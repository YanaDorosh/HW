package com.solvd.menu;

import com.solvd.placeCollections.Storage;
import com.solvd.ships.civil.SailingBoat;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SailingBoatMenu {

    private MenuMethods methods = new MenuMethods();
    private Scanner sc = new Scanner(System.in);
    private int sail;
    private int ton;
    private SailingBoat sailingBoat;

    /**
     * A menu for HashMap collection that implements
     * the functions of adding items, deleting and displaying information
     */

    public void executeMenu2(Storage storage) {

        int menu2 = sc.nextInt();
        switch (menu2) {
            case 0:
                executeMapMenu(methods.storage);
                methods.menuChoice();
                executeMenu2(storage);
                break;
            case 1:
                deletingMap(methods.storage);
                methods.menuChoice();
                executeMenu2(storage);
                break;
            case 2:
                storage.printInfoColection(methods.storage.getSailingBoatMap().values());
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

    public void executeMapMenu(Storage storage) {

        methods.loopNumberOfShips();
        for (int i = 1; i <= methods.ships; i++) {
            methods.getInfoMenu(methods.storage);
            createObjectMap(methods.storage);
        }
        methods.menuChoice();
        executeMenu2(storage);
    }

    /**
     * Methods create objects for collections
     */

    public void createObjectMap(Storage storage) {
        try {
            System.out.print("enter number of sails -    ");
            sail = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("number is incorrect ");
            sail = 0;
            System.out.println("Sails:" + ton);
        }
        sailingBoat = new SailingBoat(methods.buoyancy, methods.size, methods.speed, sail);
        storage.setSailigBoat(sailingBoat);
    }

    /**
     * Methods implement deleting items from collections
     */

    public void deletingMap(Storage storage) {
        methods.deleteAndCatch();
        storage.removeSailingBoat(methods.delete - 1);
    }

}
