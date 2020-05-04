package com.solvd.menu;

import com.solvd.constatnts.IConstants;
import com.solvd.placeCollections.Port;
import com.solvd.ships.navy.military.Military;
import com.solvd.utils.FileIO;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MilitaryMenu implements IConstants {

    private MenuMethods methods = new MenuMethods();
    private FileIO fileIO = new FileIO();
    private Scanner sc = new Scanner(System.in);
    private Port port = new Port();
    private MainMenu mainMenu = new MainMenu();
    private Military military;
    private int army;
    private String armament;


    public void chooseAction() {
        methods.chooseAction();
        if (methods.action == 1) {
            executeArrayMenu(port);
        } else {
                fileIO.readFromFile(PATH);
                mainMenu.choosePlace();
        }
    }

    /**
     * A menu for ArrayList collection that implements
     * the functions of adding items, deleting and displaying information
     */

    public void executeMenu(Port port) {

        int menu2 = sc.nextInt();
        switch (menu2) {
            case 0:
                executeArrayMenu(port);
                methods.menuChoice();
                executeMenu(port);
                break;
            case 1:
                deletingArray(port);
                methods.menuChoice();
                executeMenu(port);
                break;
            case 2:
                port.printInfoColection(port.getMilitaryList());
                methods.menuChoice();
                executeMenu(port);
                break;
            case 3:
                fileIO.writeToFile(PATH, port.getMilitaryList());
            case 4:
                methods.mainMenu.choosePlace();
                break;
            case 5:
                System.out.println("Thanks for using the application");
                System.exit(0);
                sc.close();
                break;
            default:
                System.out.println("enter correct number");
                executeMenu(port);
        }

    }


    /**
     * Method pass objects to collections and re-implement the second menu of choosing actions
     */

    public void executeArrayMenu(Port port) {
        methods.loopNumberOfShips();
        for (int i = 1; i <= methods.ships; i++) {
            methods.getInfoMenu();
            createObjectArray(port);
        }
        methods.menuChoice();
        executeMenu(port);
    }

    /**
     * Methods create objects for collections
     */

    public void createObjectArray(Port port) {
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
        System.out.println("___________________________________________________" +
                "______________________________________________");
        military = new Military(methods.buoyancy, methods.size, methods.speed, army, armament);
        port.setMilitary(military);

    }

    /**
     * Methods implement deleting items from collections
     */

    public void deletingArray(Port port) {
        methods.deleteAndCatch();
        port.removeMilitary(methods.delete - 1);
    }

}


