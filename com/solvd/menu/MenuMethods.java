package com.solvd.menu;

import com.solvd.constatnts.IConstants;
import com.solvd.myException.BouyancyException;
import com.solvd.myException.SizeException;
import com.solvd.myException.SpeedException;
import com.solvd.utils.FileIO;
import com.solvd.utils.PropertiesIO;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuMethods implements IConstants {

    /**
     * Common fields that use in all collection on this class
     */
    protected int action;
    protected double buoyancy;
    protected int size;
    protected int speed;
    protected int ships;
    private Scanner sc = new Scanner(System.in);
    protected MainMenu mainMenu = new MainMenu();
    protected int delete;
    private int minSize = 3;
    protected PropertiesIO propertiesIO = new PropertiesIO();
    protected FileIO fileIO = new FileIO();

    /**
     * Gets a common of information for all classes
     */


    public void getInfoMenu() {
        try {

            System.out.print("Enter the buoyancy -       ");
            buoyancy = sc.nextDouble();
            if (buoyancy < 0.23 | buoyancy > 0.98) {
                throw new BouyancyException();
            }
        } catch (InputMismatchException | BouyancyException e) {
            buoyancy = 0.24;
            System.out.println("   Buoyancy: " + buoyancy);
            System.out.println(e.getMessage());
        }

        try {
            System.out.print("Enter size -               ");
            size = sc.nextInt();
            if (size <= minSize) {
                throw new SizeException();
            }
        } catch (InputMismatchException | SizeException e) {
            size = 4;
            System.out.println("   Size: " + size);
            System.out.println(e.getMessage());
        }
        try {
            System.out.print("Enter speed -              ");
            speed = sc.nextInt();
            if (speed >= 300 | speed <= 30) {
                throw new SpeedException();
            }

        } catch (InputMismatchException | SpeedException e) {
            speed = 35;
            System.out.println("   Speed: " + speed);
            System.out.println(e.getMessage());
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
            mainMenu.chooseRoadstead();
        }

    }

    public void deleteAndCatch() {
        try {
            System.out.println("for deleting enter number of element");
            delete = sc.nextInt();
        }catch (InputMismatchException e){
            e.getMessage();
        }
    }

    /**
     * The method displays an action selection menu
     */

    public void menuChoice() {
        System.out.println("________________________________________________________________");
        System.out.println("0: add information; 1: delete element; 2: display the collection");
        System.out.println("3: write to file;                 4:change type of ship; 5: exit");
    }

    public void chooseAction() {
        try {
            System.out.println("Choose an action:");
            System.out.println("add information________1");
            System.out.println("read from file:________2");
            action = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Please choose correct number");
            mainMenu.choosePlace();
        }
    }
}

