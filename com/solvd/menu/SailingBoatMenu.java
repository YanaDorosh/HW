package com.solvd.menu;

import com.solvd.constatnts.IConstants;
import com.solvd.placeCollections.Port;
import com.solvd.ships.civil.SailingBoat;
import com.solvd.utils.PropertiesIO;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SailingBoatMenu implements IConstants {

    private MenuMethods methods = new MenuMethods();
    private PropertiesIO propertiesIO= new PropertiesIO();
    private Scanner sc = new Scanner(System.in);
    private Port port = new Port();
    private MainMenu mainMenu;
    private int sail;
    private int ton;
    private SailingBoat sailingBoat;

    public void chooseAction() {
        methods.chooseAction();
        if (methods.action == 1) {
            executeMapMenu(port);
        } else {
            if (methods.action == 2) {
                propertiesIO.getValueFromProperties(PATH3,"1");
                mainMenu.choosePlace();
            }
        }
    }
    /**
     * A menu for HashMap collection that implements
     * the functions of adding items, deleting and displaying information
     */

    public void executeMenu(Port port) {

        int menu2 = sc.nextInt();
        switch (menu2) {
            case 0:
                executeMapMenu(port);
                methods.menuChoice();
                executeMenu(port);
                break;
            case 1:
                deletingMap(port);
                methods.menuChoice();
                executeMenu(port);
                break;
            case 2:
                port.printInfoColection(port.getSailingBoatMap().values());
                methods.menuChoice();
                executeMenu(port);
                break;
            case 3:
                propertiesIO.setValueToProperties(PATHSECOND, String.valueOf(port.key++), port.getSailingBoatMap().values());
            case 4:
                methods.mainMenu.choosePlace();
                break;
            case 5:
                System.out.println("Thanks for using the application");
                System.exit(0);
                break;
            default:
                System.out.println("enter correct number");
                executeMenu(port);
                sc.close();
        }
    }

    /**
     * Method pass objects to collections and re-implement the second menu of choosing actions
     */

    public void executeMapMenu(Port port) {

        methods.loopNumberOfShips();
        for (int i = 1; i <= methods.ships; i++) {
            methods.getInfoMenu();
            createObjectMap(port);
        }
        methods.menuChoice();
        executeMenu(port);
    }

    /**
     * Methods create objects for collections
     */

    public void createObjectMap(Port port) {
        try {
            System.out.print("enter number of sails -    ");
            sail = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("number is incorrect ");
            sail = 0;
            System.out.println("Sails:" + ton);
        }
        sailingBoat = new SailingBoat(methods.buoyancy, methods.size, methods.speed, sail);
        port.setSailigBoat(sailingBoat);
    }

    /**
     * Methods implement deleting items from collections
     */

    public void deletingMap(Port port) {
        methods.deleteAndCatch();
        port.removeSailingBoat(methods.delete - 1);
    }

}