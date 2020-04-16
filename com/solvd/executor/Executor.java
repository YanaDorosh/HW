package com.solvd.executor;


import com.solvd.collection.*;

import java.util.Scanner;


public class Executor {
    public static void main(String[] args) {

        getMenuNumber();

    }

    public static void getMenuNumber() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number for choosing ship : military 0; civilian 1; fishing  2; sailing boat 3.");
        int collection = sc.nextInt();

        switch (collection) {
            case 0:
                Menu.getArrayMenu();
                break;
            case 1:
                Menu.getLinkedMenu();
                break;
            case 2:
                Menu.getHashSetMenu();
                break;
            case 3:
                Menu.getHashMapMenu();
                break;
            case 4:
                sc.close();
                break;
            default:
                System.out.println("enter correct number");
                getMenuNumber();
                break;

        }
    }

}











