package com.solvd.collection;

import com.solvd.executor.Executor;
import com.solvd.ships.navy.military.Military;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListCollection {

    List<Military> listMilitarys;


    public ArrayListCollection() {
        listMilitarys = new ArrayList<Military>();

    }

    public void setMilitary(Military military) {
        listMilitarys.add(military);
    }

    public void removeMilitary(int index) {
        listMilitarys.remove(index);
    }

    public List<Military> getListMilitarys() {
        return listMilitarys;
    }

    /**
    *Displays a menu for entering data into an object
     */

    public static void getArrayMenu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the type of warship");
        String type = sc.next();

        System.out.println("enter size");
        int size = sc.nextInt();

        System.out.println("enter speed");
        int speed = sc.nextInt();

        System.out.println("enter armament");
        String armament = sc.next();

        Military military = new Military(type, size, speed, armament);
        ArrayListCollection arrayListCollection = new ArrayListCollection();
        arrayListCollection.setMilitary(military);

        System.out.println("enter 0 to add information; press 1 to display the collection; press 2 to exit the menu");
        int menu1 = sc.nextInt();

        /**
         *Еhe implementation of adding or removing an object from a collection
         */

        switch (menu1) {
            case 0:
                System.out.println("enter the type of warship");
                String type1 = sc.next();

                System.out.println("enter size");
                int size1 = sc.nextInt();

                System.out.println("enter speed");
                int speed1 = sc.nextInt();

                System.out.println("enter armament");
                String armament1 = sc.next();

                Military military1 = new Military(type1, size1, speed1, armament1);
                arrayListCollection.setMilitary(military1);

                System.out.println("for deleting press 0; press 1 to display the collection;  press 2 to exit the menu");
                int menu2 = sc.nextInt();

                /**
                 *Еhe implementation menu of removing an object from a collection
                 */

                switch (menu2) {
                    case 0:
                        System.out.println("for deleting first element press 0; for deleting second element press 1");
                        int delete = sc.nextInt();
                        switch (delete) {
                            case 0:
                                arrayListCollection.removeMilitary(0);
                                printResults(arrayListCollection);
                                break;
                            case 1:
                                arrayListCollection.removeMilitary(1);
                                printResults(arrayListCollection);
                                break;

                            default:
                                System.out.println("enter correct number");
                        }
                        break;
                    case 1:
                        printResults(arrayListCollection);
                        break;

                    case 2:
                        sc.close();
                        break;

                    default:
                        System.out.println("enter correct number");

                }
                break;

            case 1:
                printResults(arrayListCollection);
                break;

            case 2:
                sc.close();
                break;

            default:
                System.out.println("enter correct number");

        }
    }

    /**
     Displays the data contained in the collection
     */

    public static void printResults(ArrayListCollection arrayListCollection) {
        for (Military military : arrayListCollection.getListMilitarys()) {
            System.out.println(military.getInfoNavy());
        }
    }

}


