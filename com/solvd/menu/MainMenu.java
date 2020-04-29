package com.solvd.menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu {

    public void getMenuNumber() {
        MenuMethods methods = new MenuMethods();
        Scanner sc = new Scanner(System.in);
        SailingBoatMenu sailingMenu = new SailingBoatMenu();
        MilitaryMenu militaryMenu = new MilitaryMenu();
        CivilMenu civilMenu = new CivilMenu();
        FishingMenu fishingMenu = new FishingMenu();

        try {

            System.out.println("Enter number for choosing ship:");
            System.out.println("0:        military");
            System.out.println("1:        civilian");
            System.out.println("2:         fishing");
            System.out.println("3:    sailing boat");
            int collection = sc.nextInt();

            switch (collection) {
                case 0:
                    militaryMenu.executeArrayMenu(methods.storage);
                    break;
                case 1:
                    civilMenu.executeLinkedMenu(methods.storage);
                    break;
                case 2:
                    fishingMenu.executeSetMenu(methods.storage);
                    break;
                case 3:
                    sailingMenu.executeMapMenu(methods.storage);
                    break;
                default:
                    System.out.println("number is incorrect");
                    getMenuNumber();
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Please choose correct number");
            getMenuNumber();
        } finally {
            System.out.println("================================================================================");
            System.out.println("Work completed!!!");
            sc.close();
        }

    }

}
