package com.solvd.menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu {

    protected static int militaryShip;
    private Scanner sc = new Scanner(System.in);

    public void choosePlace() {
        try {
            System.out.println("Choose a place:  ");
            System.out.println("Fleet:____________1");
            System.out.println("Port:_____________2");
            System.out.println("3<-------------Exit");
            int place = sc.nextInt();
            switch (place) {
                case 1:
                    chooseFleetShip();
                case 2:
                    chooseRoadstead();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Please choose correct number");
                    choosePlace();
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Please choose correct number");
        } finally {
            System.out.println("================================================================================");
            System.out.println("Work completed!!!");
            sc.close();
        }
    }

    public void chooseFleetShip() {
        FleetMenu fleetMenu = new FleetMenu();
        try {
            System.out.println("Choose a ship:");
            System.out.println("Military ship:  1");
            System.out.println("Submarine:      2");
            System.out.println("3<------Main menu");
            militaryShip = sc.nextInt();
            switch (militaryShip) {
                case (1):
                    fleetMenu.chooseAction();
                    break;
                case (2):
                    fleetMenu.chooseAction();
                    break;
                case 3:
                    choosePlace();
                    break;
                default:
                    System.out.println("Please choose correct number");
                    choosePlace();
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Please choose correct number");
            choosePlace();
        }
    }

    public void chooseRoadstead() {
        MilitaryMenu militaryMenu = new MilitaryMenu();
        SailingBoatMenu sailingMenu = new SailingBoatMenu();
        CivilMenu civilMenu = new CivilMenu();
        FishingMenu fishingMenu = new FishingMenu();
        try {
            System.out.println("Enter number for choosing ship:");
            System.out.println("0:        military");
            System.out.println("1:        civilian");
            System.out.println("2:         fishing");
            System.out.println("3:    sailing boat");
            System.out.println("Main menu------->4");
            System.out.println("Exit------------>5");

            int collection = sc.nextInt();
            switch (collection) {
                case 0:
                    militaryMenu.chooseAction();
                    break;
                case 1:
                    civilMenu.chooseAction();
                    break;
                case 2:
                    fishingMenu.chooseAction();
                    break;
                case 3:
                    sailingMenu.chooseAction();
                    break;
                case 4:
                    choosePlace();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("number is incorrect");
                    chooseRoadstead();
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Please choose correct number");
            choosePlace();
        }

    }


}

