package com.solvd.menu;

import com.solvd.constatnts.IConstants;
import com.solvd.placeCollections.Port;
import com.solvd.ships.civil.Civil;
import com.solvd.utils.FileIO;

import java.util.Scanner;

public class CivilMenu implements IConstants {

    private MenuMethods methods = new MenuMethods();
    private FileIO fileIO = new FileIO();
    private Scanner sc = new Scanner(System.in);
    private Port port = new Port();
    private MainMenu mainMenu;
    private String classification;
    private Civil civil;

    public void chooseAction() {
        methods.chooseAction();
        if (methods.action == 1) {
            executeLinkedMenu(port);
        } else{
                fileIO.readFromFile(PATH);
                mainMenu.choosePlace();
            }
    }
    /**
     * A menu for LinkedList collection that implements
     * the functions of adding items, deleting and displaying information
     */

    public void executeMenu(Port port) {

        int menu2 = sc.nextInt();
        switch (menu2) {
            case 0:
                executeLinkedMenu(port);
                methods.menuChoice();
                executeMenu(port);
                break;
            case 1:
                deletingLinked(port);
                methods.menuChoice();
                executeMenu(port);
                break;
            case 2:
                port.printInfoColection(port.getlinkedListCivils());
                methods.menuChoice();
                executeMenu(port);
                break;
            case 3:
                fileIO.writeToFile(PATH, port.getlinkedListCivils());
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

    public void executeLinkedMenu(Port port) {
        methods.loopNumberOfShips();
        for (int i = 1; i <= methods.ships; i++) {
           methods.getInfoMenu();
            createObjectLinked(port);
        }
        methods.menuChoice();
        executeMenu(port);

    }

    /**
     * Methods create objects for collections
     */

    public void createObjectLinked(Port port) {
        System.out.print("enter the classification - ");
        classification = sc.next();
        System.out.println("___________________________________________________" +
                "______________________________________________");
        civil = new Civil(methods.buoyancy, methods.size, methods.speed, classification);
        port.setCivil(civil);
    }

    /**
     * Methods implement deleting items from collections
     */

    public void deletingLinked(Port port) {
        methods.deleteAndCatch();
        port.removeCivil(methods.delete - 1);
    }

}
