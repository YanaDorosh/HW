package com.solvd.menu;

import com.solvd.constatnts.IConstants;
import com.solvd.placeCollections.Port;
import com.solvd.ships.civil.service.servicetype.Fishing;
import com.solvd.utils.FileIO;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FishingMenu implements IConstants {

    private MenuMethods methods = new MenuMethods();
    private FileIO fileIO = new FileIO();
    private Scanner sc = new Scanner(System.in);
    private Port port = new Port();
    private MainMenu mainMenu = new MainMenu();
    private Fishing fishing;
    private String classification;
    private int ton;


    public void chooseAction() {
        methods.chooseAction();
        if (methods.action == 1) {
            executeSetMenu(port);
        } else {
            fileIO.readFromFile(PATH);
            mainMenu.choosePlace();
        }
    }

    /**
     * A menu for HashSet collection that implements
     * the functions of adding items, deleting and displaying information
     */

    public void executeMenu(Port port) {

        int menu2 = sc.nextInt();
        switch (menu2) {
            case 0:
                executeSetMenu(port);
                methods.menuChoice();
                executeMenu(port);
                break;
            case 1:
                deletingSet(port);
                methods.menuChoice();
                executeMenu(port);
                break;
            case 2:
                port.printInfoColection(port.getFishingSet());
                methods.menuChoice();
                executeMenu(port);
                break;
            case 3:
                fileIO.writeToFile(PATH, port.getFishingSet());
            case 4:
                methods.mainMenu.choosePlace();
                break;
            case 5:
                System.out.println("Thanks for using the application");
                System.exit(0);
                break;
            default:
                System.out.println("enter correct number");
                executeMenu(port);
                sc.close();
        }

    }

    /**
     * Method pass objects to collections and re-implement the second menu of choosing actions
     */

    public void executeSetMenu(Port port) {

        methods.loopNumberOfShips();
        for (int i = 1; i <= methods.ships; i++) {
            methods.getInfoMenu();
            createObjectSet(port);
        }
        methods.menuChoice();
        executeMenu(port);
    }


    /**
     * Methods create objects for collections
     */

    public void createObjectSet(Port port) {
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
        port.setFishingSet(fishing);

    }

    /**
     * Methods implement deleting items from collections
     */

    public void deletingSet(Port port) {
        methods.deleteAndCatch();
        port.removeFishing(methods.delete - 1);
    }
}
