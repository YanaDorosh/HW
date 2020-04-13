package com.solvd.executor;


import com.solvd.collection.ArrayListCollection;
import com.solvd.collection.HashMapCollection;
import com.solvd.collection.LinkedListCollection;
import com.solvd.collection.SetCollection;

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
                ArrayListCollection.getArrayMenu();
                break;
            case 1:
                LinkedListCollection.getLinkedMenu();
                break;
            case 2:
                SetCollection.getHashSetMenu();
                break;
            case 3:
                HashMapCollection.getHashMapMenu();
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











