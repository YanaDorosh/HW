package com.solvd.menu;

import com.solvd.placeCollections.Roadstead;
import com.solvd.ships.civil.service.servicetype.Fishing;
import com.solvd.utils.FileIO;
import com.solvd.utils.PropertiesIO;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FishingMenu  {

    private MenuMethods methods = new MenuMethods();
    private FileIO fileIO = new FileIO();
    private PropertiesIO propertiesIO = new PropertiesIO();
    private Scanner sc = new Scanner(System.in);
    private Roadstead roadstead = new Roadstead();
    private MainMenu mainMenu = new MainMenu();
    private Fishing fishing;
    private String classification;
    private int ton;


    public void chooseAction() {
        methods.chooseAction();
        switch (methods.action) {
            case 1:
                executeSetMenu(roadstead);
                break;
            case 2:
                fileIO.readFromFile(propertiesIO.getValueFromProperties(3));
                break;
            default:
                System.out.println("enter correct number");
                chooseAction();
                break;
        }
    }

    /**
     * A menu for HashSet collection that implements
     * the functions of adding items, deleting and displaying information
     */

    public void executeMenu(Roadstead roadstead) {

        int menu2 = sc.nextInt();
        switch (menu2) {
            case 0:
                executeSetMenu(roadstead);
                methods.menuChoice();
                executeMenu(roadstead);
                break;
            case 1:
                deletingSet(roadstead);
                methods.menuChoice();
                executeMenu(roadstead);
                break;
            case 2:
                roadstead.printInfoColection(roadstead.getFishingSet());
                methods.menuChoice();
                executeMenu(roadstead);
                break;
            case 3:
                fileIO.writeToFile(propertiesIO.getValueFromProperties(1), roadstead.getFishingSet());
            case 4:
                methods.mainMenu.choosePlace();
                break;
            case 5:
                System.out.println("Thanks for using the application");
                System.exit(0);
                break;
            default:
                System.out.println("enter correct number");
                executeMenu(roadstead);
                sc.close();
        }

    }

    /**
     * Method pass objects to collections and re-implement the second menu of choosing actions
     */

    public void executeSetMenu(Roadstead roadstead) {

        methods.loopNumberOfShips();
        for (int i = 1; i <= methods.ships; i++) {
            methods.getInfoMenu();
            createObjectSet(roadstead);
        }
        methods.menuChoice();
        executeMenu(roadstead);
    }

    /**
     * Methods create objects for collections
     */

    public void createObjectSet(Roadstead roadstead) {
        System.out.print("enter the classification - ");
        classification = sc.next();

        try {
            System.out.print("enter ton -                ");
            ton = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("number is incorrect");
            ton = 0;
            System.out.println("Ton: 2" + ton);
        }
        System.out.println("___________________________________________________" +
                "______________________________________________");
        fishing = new Fishing(methods.buoyancy, methods.size, methods.speed, classification, ton);
        roadstead.setFishingSet(fishing);

    }

    /**
     * Methods implement deleting items from collections
     */

    public void deletingSet(Roadstead roadstead) {
        methods.deleteAndCatch();
        roadstead.removeFishing(methods.delete - 1);
    }
}
