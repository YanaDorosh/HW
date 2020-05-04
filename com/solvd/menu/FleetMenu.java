package com.solvd.menu;

import com.solvd.constatnts.IConstants;
import com.solvd.placeCollections.Fleet;
import com.solvd.placeCollections.Port;
import com.solvd.ships.navy.military.Military;
import com.solvd.ships.navy.military.Submarine;
import com.solvd.utils.FileIO;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FleetMenu implements IConstants {

    private FileIO fileIO = new FileIO();
    private MenuMethods methods = new MenuMethods();
    private MainMenu mainMenu = new MainMenu();
    private Fleet fleet = new Fleet();
    private Scanner sc = new Scanner(System.in);
    private Military military;
    private Submarine submarine;
    private int army;
    private String armament;


    /**
     * A menu for ArrayList collection that implements
     * the functions of adding items, deleting and displaying information
     */
    public void chooseAction(){
        methods.chooseAction();
        if (methods.action == 1) {
            executeFleetMenu(fleet);
        }else {
            if (methods.action == 2) {
                fileIO.readFromFile(PATH);
                mainMenu.choosePlace();
            }
        }
    }

    public void executeMenu(Fleet fleet) {
        int menu = sc.nextInt();
        switch (menu) {
            case 0:
                executeFleetMenu(fleet);
                methods.menuChoice();
                executeMenu(fleet);
                break;
            case 1:
                deletingArray(fleet);
                methods.menuChoice();
                executeMenu(fleet);
                break;
            case 2:
                if (mainMenu.militaryShip == 1) {
                    fleet.printInfoColection(fleet.getMilitaryList());
                }else  {
                    fleet.printInfoColection(fleet.getSubmarineList());
                }

                methods.menuChoice();
                executeMenu(fleet);
                break;
            case 3:
                if (mainMenu.militaryShip == 1) {
                    fileIO.writeToFile(PATH, fleet.getMilitaryList());
                }else {
                    fileIO.writeToFile(PATH, fleet.getSubmarineList());
                }
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
                executeMenu(fleet);
        }

    }

    /**
     * Method pass objects to collections and re-implement the second menu of choosing actions
     */

    public void executeFleetMenu(Fleet fleet) {
        methods.loopNumberOfShips();
        for (int i = 1; i <= methods.ships; i++) {
            methods.getInfoMenu();
            createObjectArray(fleet);
        }
        methods.menuChoice();
        executeMenu(fleet);
    }

    /**
     * Methods create objects for collections
     */

    public void createObjectArray(Fleet fleet) {
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

        if (mainMenu.militaryShip == 1) {
            military = new Military(methods.buoyancy, methods.size, methods.speed, army, armament);
            fleet.setMilitary(military);
        }else {
            submarine = new Submarine(methods.buoyancy, methods.size, methods.speed, army, armament);
            fleet.setSubmarine(submarine);
        }

    }

    /**
     * Methods implement deleting items from collections
     */

    public void deletingArray(Fleet fleet) {
        methods.deleteAndCatch();
        fleet.removeMilitary(methods.delete - 1);
    }

    public void executeArrayMenu2(Port port) {
        methods.loopNumberOfShips();
        for (int i = 1; i <= methods.ships; i++) {
            methods.getInfoMenu();
            createObjectArray(fleet);
        }
        methods.menuChoice();
        executeMenu(fleet);
    }

}