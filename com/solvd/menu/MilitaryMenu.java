package com.solvd.menu;

import com.solvd.placeCollections.Storage;
import com.solvd.ships.navy.military.Military;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MilitaryMenu {

    private MenuMethods methods = new MenuMethods();
    private Scanner sc = new Scanner(System.in);
    private Military military;
    private int army;
    private String armament;


    /**
     * A menu for ArrayList collection that implements
     * the functions of adding items, deleting and displaying information
     */

    public void executeMenu2(Storage storage) {

        int menu2 = sc.nextInt();
        switch (menu2) {
            case 0:
                executeArrayMenu(storage);
                methods.menuChoice();
                executeMenu2(storage);
                break;
            case 1:
                deletingArray(storage);
                methods.menuChoice();
                executeMenu2(storage);
                break;
            case 2:
                storage.printInfoColection(storage.getMilitaryList());
                methods.menuChoice();
                executeMenu2(storage);
                break;
            case 3:
                methods.mainMenu.getMenuNumber();
                break;
            case 4:
                System.out.println("Thanks for using the application");
                System.exit(0);
                sc.close();
                break;
            default:
                System.out.println("enter correct number");
                executeMenu2(methods.storage);
        }

    }


    /**
     * Method pass objects to collections and re-implement the second menu of choosing actions
     */

    public void executeArrayMenu(Storage storage) {
        methods.loopNumberOfShips();
        for (int i = 1; i <= methods.ships; i++) {
            methods.getInfoMenu(methods.storage);
            createObjectArray(methods.storage);
        }
        methods.menuChoice();
        executeMenu2(methods.storage);
    }

    /**
     * Methods create objects for collections
     */

    public void createObjectArray(Storage storage) {
        try {
            System.out.print("Enter army -               ");
            army = sc.nextInt();
        } catch (InputMismatchException e) {
            army = 0;
            armament = "0 ";
            System.out.print("Army: " + army + " ");
            System.out.println("Armament: " + armament);
        }
        System.out.print("Enter armament -           ");
        armament = sc.next();
        military = new Military(methods.buoyancy, methods.size, methods.speed, army, armament);
        storage.setMilitary(military);

    }

    /**
     * Methods implement deleting items from collections
     */

    public void deletingArray(Storage storage) {
        methods.deleteAndCatch();
        storage.removeMilitary(methods.delete - 1);
    }

}
