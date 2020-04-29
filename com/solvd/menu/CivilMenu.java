package com.solvd.menu;

import com.solvd.placeCollections.Storage;
import com.solvd.ships.civil.Civil;

import java.util.Scanner;

public class CivilMenu {

    private MenuMethods methods = new MenuMethods();
    private Scanner sc = new Scanner(System.in);
    private String classification;
    private Civil civil;

    /**
     * A menu for LinkedList collection that implements
     * the functions of adding items, deleting and displaying information
     */

    public void executeMenu2(Storage storage) {

        int menu2 = sc.nextInt();
        switch (menu2) {
            case 0:
                executeLinkedMenu(methods.storage);
                methods.menuChoice();
                executeMenu2(storage);
                break;
            case 1:
                deletingLinked(methods.storage);
                methods.menuChoice();
                executeMenu2(storage);
                break;
            case 2:
                storage.printInfoColection(storage.getlinkedListCivils());
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

    public void executeLinkedMenu(Storage storage) {
        methods.loopNumberOfShips();
        for (int i = 1; i <= methods.ships; i++) {
            methods.getInfoMenu(methods.storage);
            createObjectLinked(methods.storage);
        }
        methods.menuChoice();
        executeMenu2(storage);

    }


    /**
     * Methods create objects for collections
     */

    public void createObjectLinked(Storage storage) {
        System.out.print("enter the classification - ");
        classification = sc.next();
        civil = new Civil(methods.buoyancy, methods.size, methods.speed, classification);
        storage.setCivil(civil);
    }

    /**
     * Methods implement deleting items from collections
     */

    public void deletingLinked(Storage storage) {
        methods.deleteAndCatch();
        storage.removeCivil(methods.delete - 1);
    }

}
