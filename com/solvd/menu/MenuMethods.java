package com.solvd.menu;

import com.solvd.placeCollections.Storage;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuMethods {

    /**
     * Common fields that use in all collection on this class
     */

    protected int buoyancy;
    protected int size;
    protected int speed;
    protected int ships;
    private Scanner sc = new Scanner(System.in);
    protected MainMenu mainMenu = new MainMenu();
    protected Storage storage = new Storage();
    protected int delete;

    /**
     * Gets a common of information for all classes
     */

    public void getInfoMenu(Storage storage) {
        try {
            System.out.print("Enter the buoyancy -       ");
            buoyancy = sc.nextInt();

            System.out.print("Enter size -               ");
            size = sc.nextInt();

            System.out.print("Enter speed -              ");
            speed = sc.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Enter correct information");
            buoyancy = 0;
            System.out.println("   Buoyancy: " + buoyancy);
            size = 4;
            System.out.println("   Size: " + size);
            speed = 35;
            System.out.println("   Speed: " + speed);
        }

    }

    /**
     * The method checks number for deleting.
     * Here checks two types mistakes in the moment of entering
     */

    public void loopNumberOfShips() {
        try {
            do {
                System.out.println("enter number of ships");
                ships = sc.nextInt();
            }
            while (ships <= 0);
        } catch (InputMismatchException e) {
            System.out.println("Please enter a number");
            mainMenu.getMenuNumber();
        }

    }

    public void deleteAndCatch() throws InputMismatchException {
        System.out.println("for deleting enter number of element");
        delete = sc.nextInt();
    }

    /**
     * The method displays an action selection menu
     */

    public void menuChoice() {
        System.out.println("___________________________________________________" +
                "______________________________________________");
        System.out.println("0: add information; 1: delete element;" +
                " 2: display the collection; 3: change type of ship; 4: exit");
    }

}

