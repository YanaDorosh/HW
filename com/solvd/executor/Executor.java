package com.solvd.executor;


import com.solvd.menu.Menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Executor {

    public static void main(String[] args) {

        getMenuNumber();
    }

    public static void getMenuNumber() {

        try {

            Scanner sc = new Scanner(System.in);
            Menu menu = new Menu();

            System.out.println("Enter number for choosing ship:");
            System.out.println("0:        military");
            System.out.println("1:        civilian");
            System.out.println("2:         fishing");
            System.out.println("3:    sailing boat");
            int collection = sc.nextInt();

            switch (collection) {
                case 0:
                    menu.getArrayMenu();
                    break;
                case 1:
                    menu.getLinkedMenu();
                    break;
                case 2:
                    menu.getHashSetMenu();
                    break;
                case 3:
                    menu.getHashMapMenu();
                    break;

                default:
                    System.out.println("number is incorrect");
                    getMenuNumber();
                    break;
            }
        } catch (InputMismatchException e) {
            e.getMessage();
        } finally {
            System.out.println("Work completed!!!");
        }

    }
}















