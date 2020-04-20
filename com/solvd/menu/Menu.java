package com.solvd.menu;

import com.solvd.placeCollections.Storage;
import com.solvd.ships.civil.Civil;
import com.solvd.ships.civil.SailingBoat;
import com.solvd.ships.civil.service.servicetype.Fishing;
import com.solvd.ships.navy.military.Military;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    /**
     * Common fields that use in all collection on this class
     */
// ??????? як отримати ці ж поля із боут//////////////////////////////////////////////////////////////
    private int buoyancy;
    private int size;
    private int speed;
    private Scanner sc = new Scanner(System.in);
    private Storage storage = new Storage();
    private int ships;


    public void getArrayMenu() {
        executeArrayMenu(storage);
    }

    public void getLinkedMenu() {
        executeLinkedMenu(storage);
    }

    public void getHashSetMenu() {
        executeSetMenu(storage);
    }

    public void getHashMapMenu() {
        executeMapMenu(storage);
    }

    /**
     * Gets a common of information for all classes
     */

    public void getInfoMenu(Storage storage) {
        try {
            System.out.println("enter the buoyancy");
            buoyancy = sc.nextInt();

            System.out.println("enter size");
            size = sc.nextInt();

            System.out.println("enter speed");
            speed = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Enter correct information");
            //getInfoMenu(storage);             теж закиклити поки не буте числове

        }
    }


    /**
     * Methods pass objects to collections and re-implement the second menu
     */

    public void executeArrayMenu(Storage storage) {
        try {

            System.out.println("enter number of ships");
            ships = sc.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Enter correct information");
            ////////////////////////////////////////////// тут хочу зациклити поки не стане вірним числовим
                System.out.println("enter number of ships");
                ships = sc.nextInt();
        }
        for (int i = 1; i <= ships; i++) {
            getInfoMenu(storage);
            createObjectArray(storage);
        }
        System.out.println("enter 0 to add information;  press 1 to delete element;" +
                " press 2 to display the collection; press 3 to exit the menu");
        executeMenu2(storage);

    }


    public void executeLinkedMenu(Storage storage) {
        try {
            System.out.println("enter number of ships");
            ships = sc.nextInt();
            for (int i = 1; i <= ships; i++) {
                getInfoMenu(storage);
                createObjectLinked(storage);
            }
        } catch (InputMismatchException e) {
            System.out.println("Enter correct information");

        }
        System.out.println("enter 0 to add information;  press 1 to delete element;" +
                " press 2 to display the collection; press 3 to exit the menu");
        executeMenu2(storage);
    }

    public void executeSetMenu(Storage storage) {
        try {
            System.out.println("enter number of ships");
            ships = sc.nextInt();
            for (int i = 1; i <= ships; i++) {
                getInfoMenu(storage);
                createObjectSet(storage);
            }

        } catch (InputMismatchException e) {
            System.out.println("Enter correct information");

        }
        System.out.println("enter 0 to add information;  press 1 to delete element;" +
                " press 2 to display the collection; press 3 to exit the menu");
        executeMenu2(storage);
    }

    public void executeMapMenu(Storage storage) {
        System.out.println("enter number of ships");
        ships = sc.nextInt();
        for (int i = 1; i <= ships; i++) {
            getInfoMenu(storage);
            createObjectMap(storage);
        }
        System.out.println("enter 0 to add information;  press 1 to delete element;" +
                " press 2 to display the collection; press 3 to exit the menu");
        executeMenu2(storage);
    }

    /**
     * A menu for all collections that implements
     * the functions of adding items, deleting and displaying information
     */

    public void executeMenu2(Storage storage) {
        try {

            int menu2 = sc.nextInt();
            switch (menu2) {
                case 0:
                    executeArrayMenu(storage);
                    executeLinkedMenu(storage);
                    executeSetMenu(storage);
                    executeMapMenu(storage);
                    break;
                case 1:
                    deletingArray(storage);
                    deletingLinked(storage);
                    deletingSet(storage);
                    deletingMap(storage);
                    break;
                case 2:
                    storage.printInfoColection(storage.getMilitaryList());
                    storage.printInfoColection(storage.getlinkedListCivils());
                    storage.printInfoColection(storage.getFishingSet());
                    storage.printInfoColection(storage.getSailingBoatMap().values());
                    break;
                case 3:
                    System.out.println("Thanks for using the application");
                    System.exit(0);
                    break;
                default:
                    System.out.println("enter correct number");
                    executeMenu2(storage);
                    sc.close();
            }

        } catch (InputMismatchException e) {
            System.out.println("enter correct number");
            executeMenu2(storage);
        }
    }

    /**
     * Methods create objects for collections
     */

    public void createObjectArray(Storage storage) {
        System.out.println("enter armament");
        String armament = sc.next();

        Military military = new Military(buoyancy, size, speed, armament);
        storage.setMilitary(military);
    }

    public void createObjectLinked(Storage storage) {
        System.out.println("enter the  classification");
        String classification = sc.next();

        Civil civil = new Civil(buoyancy, size, speed, classification);
        storage.setCivil(civil);
    }

    public void createObjectSet(Storage storage) {
        System.out.println("enter the classification");
        String classification = sc.next();

        System.out.println("enter ton");
        int ton = sc.nextInt();

        Fishing fishing = new Fishing(buoyancy, size, speed, classification, ton);
        storage.setFishingSet(fishing);
    }

    public void createObjectMap(Storage storage) {
        System.out.println("enter number of sails");
        int sail = sc.nextInt();

        SailingBoat sailingBoat = new SailingBoat(buoyancy, size, speed, sail);
        storage.setSailigBoat(sailingBoat);
    }

    /**
     * Methods implement deleting items from collections
     */

    public void deletingArray(Storage storage) {
        System.out.println("for deleting enter number of element");
        int delete = sc.nextInt();
        storage.removeMilitary(delete - 1);
        storage.printInfoColection(storage.getMilitaryList());
    }

    public void deletingLinked(Storage storage) {
        System.out.println("for deleting enter number of element");
        int delete = sc.nextInt();
        storage.removeCivil(delete - 1);
        storage.printInfoColection(storage.getlinkedListCivils());
    }

    public void deletingSet(Storage storage) {
        System.out.println("for deleting enter number of element");
        int delete = sc.nextInt();
        storage.removeFishing(delete - 1);
        storage.printInfoColection(storage.getFishingSet());
    }

    public void deletingMap(Storage storage) {
        System.out.println("for deleting enter number of element");
        int delete = sc.nextInt();
        storage.removeSailingBoat(delete - 1);
        storage.printInfoColection(storage.getSailingBoatMap().values());
    }

}
