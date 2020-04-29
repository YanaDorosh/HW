package com.solvd.menu;

import com.solvd.placeCollections.Fleet;
import com.solvd.ships.navy.military.Military;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FleetMenu {

    private MenuMethods methods = new MenuMethods();
    private Scanner sc = new Scanner(System.in);
    private Military military;
    private int army;
    private String armament;
    private Fleet fleet = new Fleet();


    /**
     * A menu for ArrayList collection that implements
     * the functions of adding items, deleting and displaying information
     */

    public void executeMenu2(Fleet fleet) {

        int menu2 = sc.nextInt();
        switch (menu2) {
            case 0:
                executeFleetMenu(fleet);
                methods.menuChoice();
                executeMenu2(fleet);
                break;
            case 1:
                deletingFleet(fleet);
                methods.menuChoice();
                executeMenu2(fleet);
                break;
            case 2:
                System.out.println();
           //     fleet.printInfoColection(fleet.getFleetShips());
                methods.menuChoice();
                executeMenu2(fleet);
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
                executeMenu2(fleet);
        }

    }

    /**
     * Method pass objects to collections and re-implement the second menu of choosing actions
     * @param fleet
     */

    public void executeFleetMenu(Fleet fleet) {
        methods.loopNumberOfShips();
        for (int i = 1; i <= methods.ships; i++) {
            methods.getInfoMenu(methods.storage);
            createObjectFleet(fleet);
        }
        methods.menuChoice();
        executeMenu2(fleet);
    }

    /**
     * Methods create objects for collections
     */

    public void createObjectFleet(Fleet fleet) {
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
   //   fleet.setFleetShips(methods.storage.getMilitaryList());


    }

    /**
     * Methods implement deleting items from collections
     */

        public void deletingFleet(Fleet fleet) {
        methods.deleteAndCatch();
   //     fleet.leaveThePlace(military);
    }

}
