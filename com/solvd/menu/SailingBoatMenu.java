package com.solvd.menu;

import com.solvd.placeCollections.Roadstead;
import com.solvd.ships.civil.SailingBoat;
import com.solvd.utils.PropertiesIO;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SailingBoatMenu {

    private MenuMethods methods = new MenuMethods();
    private PropertiesIO propertiesIO = new PropertiesIO();
    private Scanner sc = new Scanner(System.in);
    private Roadstead roadstead = new Roadstead();
    private MainMenu mainMenu = new MainMenu();
    private int sail;
    private String type;
    private SailingBoat sailingBoat;

    public void chooseAction() {
        methods.chooseAction();
        switch (methods.action) {
            case 1:
                executeMapMenu(roadstead);
                break;
            case 2:
                methods.fileIO.readFromFile(methods.propertiesIO.getValueFromProperties(6));
                break;
            default:
                System.out.println("enter correct number");
                chooseAction();
                break;
        }

    }

    /**
     * A menu for HashMap collection that implements
     * the functions of adding items, deleting and displaying information
     */

    public void executeMenu(Roadstead roadstead) {

        int menu2 = sc.nextInt();
        switch (menu2) {
            case 0:
                executeMapMenu(roadstead);
                methods.menuChoice();
                executeMenu(roadstead);
                break;
            case 1:
                deletingMap(roadstead);
                methods.menuChoice();
                executeMenu(roadstead);
                break;
            case 2:
                roadstead.printInfoColection(roadstead.getSailingBoatMap().values());
                methods.menuChoice();
                executeMenu(roadstead);
                break;
            case 3:
                methods.fileIO.writeToFile(methods.propertiesIO.getValueFromProperties(1),
                        roadstead.getSailingBoatMap().values());
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

    public void executeMapMenu(Roadstead roadstead) {

        methods.loopNumberOfShips();
        for (int i = 1; i <= methods.ships; i++) {
            methods.getInfoMenu();
            createObjectMap(roadstead);
        }
        methods.menuChoice();
        executeMenu(roadstead);
    }

    /**
     * Methods create objects for collections
     */

    public void createObjectMap(Roadstead roadstead) {
        try {
            System.out.print("enter type -               ");
            type = sc.next();
            System.out.print("enter number of sails -    ");
            sail = sc.nextInt();
            System.out.println("___________________________________________________" +
                    "______________________________________________");
        } catch (InputMismatchException e) {
            System.out.println("number is incorrect ");
            sail = 0;
            System.out.println("Sails:" + sail);
        }
        sailingBoat = new SailingBoat(methods.buoyancy, methods.size, methods.speed, type, sail);
        roadstead.setSailigBoat(sailingBoat);
    }

    /**
     * Methods implement deleting items from collections
     */

    public void deletingMap(Roadstead roadstead) {
        methods.deleteAndCatch();
        roadstead.removeSailingBoat(methods.delete - 1);
    }

}