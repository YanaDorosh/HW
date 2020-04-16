package com.solvd.collection;

import com.solvd.ships.civil.Civil;
import com.solvd.ships.civil.SailingBoat;
import com.solvd.ships.civil.service.Fishing;
import com.solvd.ships.navy.military.Military;

import java.util.Scanner;

public class Menu {

    private static String type;
    private static int size;
    private static int speed;
    private static String armament;
    static Scanner sc = new Scanner(System.in);
    private static Storage storage = new Storage();


    public static void getArrayMenu() {
        executeArrayMenu(storage);
    }

    public static void getLinkedMenu() {
        executeLinkedMenu(storage);
    }

    public static void getHashSetMenu() {
        executeSetMenu(storage);
    }

    public static void getHashMapMenu() {
        executeMapMenu(storage);
    }

    public static void getInfoMenu(Storage storage) {
        System.out.println("enter the type ");
        type = sc.next();

        System.out.println("enter size");
        size = sc.nextInt();

        System.out.println("enter speed");
        speed = sc.nextInt();
    }

    public static void executeArrayMenu(Storage storage) {
        System.out.println("enter number of ships");
        int ships = sc.nextInt();
        for (int i = 1; i <= ships; i++) {
            getInfoMenu(storage);
            createObjectArray(storage);
        }
        System.out.println("enter 0 to add information;  press 1 to delete element;" +
                " press 2 to display the collection; press 3 to exit the menu");
        executeMenu2(storage);
    }

    public static void executeLinkedMenu(Storage storage) {
        System.out.println("enter number of ships");
        int ships = sc.nextInt();
        for (int i = 1; i <= ships; i++) {
            getInfoMenu(storage);
            createObjectLinked(storage);
        }
        System.out.println("enter 0 to add information;  press 1 to delete element;" +
                " press 2 to display the collection; press 3 to exit the menu");
        executeMenu2(storage);
    }

    public static void executeSetMenu(Storage storage) {
        System.out.println("enter number of ships");
        int ships = sc.nextInt();
        for (int i = 1; i <= ships; i++) {
            getInfoMenu(storage);
            createObjectSet(storage);
        }
        System.out.println("enter 0 to add information;  press 1 to delete element;" +
                " press 2 to display the collection; press 3 to exit the menu");
        executeMenu2(storage);
    }

    public static void executeMapMenu(Storage storage) {
        System.out.println("enter number of ships");
        int ships = sc.nextInt();
        for (int i = 1; i <= ships; i++) {
            getInfoMenu(storage);
            createObjectMap(storage);
        }
        System.out.println("enter 0 to add information;  press 1 to delete element;" +
                " press 2 to display the collection; press 3 to exit the menu");
        executeMenu2(storage);
    }


    public static void executeMenu2(Storage storage) {

        int menu2 = sc.nextInt();
        switch (menu2) {
            case 0:
                executeArrayMenu(storage);
                executeLinkedMenu(storage);
                executeSetMenu(storage);
                executeMapMenu(storage);
                break;
            case 1:
                deleting(storage);
                break;
            case 2:
                storage.printInfoColection(storage.getMilitaryList());
                storage.printInfoColection(storage.getlinkedListCivils());
                storage.printInfoColection(storage.getFishingSet());
                storage.printInfoColection(storage.getSailingBoatMap().values());
                break;
            case 3:
                sc.close();
                break;
            default:
                System.out.println("enter correct number");
                executeMenu2(storage);

        }
    }

    public static void createObjectArray(Storage storage) {
        System.out.println("enter armament");
        String armament = sc.next();

        Military military = new Military(type, size, speed, armament);
        storage.setMilitary(military);
    }

    public static void createObjectLinked(Storage storage) {
        System.out.println("enter the number of passengers");
        int passengers = sc.nextInt();

        Civil civil = new Civil(type, size, speed, passengers);
        storage.setCivil(civil);
    }

    public static void createObjectSet(Storage storage) {
        System.out.println("enter ton");
        int ton = sc.nextInt();
        Fishing fishing = new Fishing(type, size, speed, ton);
        storage.setFishingSet(fishing);
    }

    public static void createObjectMap(Storage storage) {
        System.out.println("enter number of sails");
        int sail = sc.nextInt();

        SailingBoat sailingBoat = new SailingBoat(type, size, speed, sail);
        storage.setSailigBoat(sailingBoat);
    }

    public static void deleting(Storage storage) {
        System.out.println("for deleting enter number of element");
        int delete = sc.nextInt();
        storage.removeMilitary(delete - 1);
        storage.printInfoColection(storage.getMilitaryList());
        storage.printInfoColection(storage.getlinkedListCivils());
        storage.printInfoColection(storage.getFishingSet());
        storage.printInfoColection(storage.getSailingBoatMap().values());
    }

}
