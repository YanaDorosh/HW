package com.solvd.menu;

import com.solvd.placeCollections.Storage;
import com.solvd.ships.civil.service.servicetype.Fishing;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FishingMenu {

    private MenuMethods methods = new MenuMethods();
    private Scanner sc = new Scanner(System.in);
    private Fishing fishing;
    private String classification;
    private int ton;

    /**
     * A menu for HashSet collection that implements
     * the functions of adding items, deleting and displaying information
     */

    public void executeMenu2(Storage storage) {

        int menu2 = sc.nextInt();
        switch (menu2) {
            case 0:
                executeSetMenu(methods.storage);
                methods.menuChoice();
                executeMenu2(storage);
                break;
            case 1:
                deletingSet(methods.storage);
                methods.menuChoice();
                executeMenu2(storage);
                break;
            case 2:
                storage.printInfoColection(methods.storage.getFishingSet());
                methods.menuChoice();
                executeMenu2(storage);
                break;
            case 3:
                methods.mainMenu.getMenuNumber();
                break;
            case 4:
                System.out.println("Thanks for using the application");
                System.exit(0);
                break;
            default:
                System.out.println("enter correct number");
                executeMenu2(methods.storage);
                sc.close();
        }

    }

    /**
     * Method pass objects to collections and re-implement the second menu of choosing actions
     */

    public void executeSetMenu(Storage storage) {

        methods.loopNumberOfShips();
        for (int i = 1; i <= methods.ships; i++) {
            methods.getInfoMenu(methods.storage);
            createObjectSet(methods.storage);
        }
        methods.menuChoice();
        executeMenu2(storage);
    }


    /**
     * Methods create objects for collections
     */

    public void createObjectSet(Storage storage) {
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
        fishing = new Fishing(methods.buoyancy, methods.size, methods.speed, classification, ton);
        storage.setFishingSet(fishing);

    }

    /**
     * Methods implement deleting items from collections
     */

    public void deletingSet(Storage storage) {
        methods.deleteAndCatch();
        storage.removeFishing(methods.delete - 1);
    }
}
