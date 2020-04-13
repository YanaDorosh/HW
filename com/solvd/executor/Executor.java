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

        System.out.println("criate ArrayLiast 0; criate LinkedList 1;  criate HashSet 2; criate HashMap 3 ");
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

            default:
                System.out.println("enter correct number");
                getMenuNumber();
                break;

        }
    }

}











