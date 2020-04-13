package com.solvd.collection;

import com.solvd.ships.civil.SailingBoat;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapCollection {

    Map<Integer, SailingBoat> sailingBoatMap;


    HashMapCollection() {
        sailingBoatMap = new HashMap<Integer, SailingBoat>();

    }

    public void setSailigBoat(SailingBoat sailingBoat) {
        int key = 0;
        key++;
        sailingBoatMap.put(key, sailingBoat);
    }


    public Map<Integer, SailingBoat> getSailingBoat() {
        return sailingBoatMap;
    }

    public void removeSailingBoat(int index) {
        sailingBoatMap.remove(index);
    }


    public static void getHashMapMenu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the ship type");
        String type = sc.next();

        System.out.println("enter size");
        int size = sc.nextInt();

        System.out.println("enter speed");
        int speed = sc.nextInt();

        System.out.println("enter number of sails");
        int sail = sc.nextInt();


        SailingBoat sailingBoat = new SailingBoat(type, size, speed, sail);
        HashMapCollection hashMapCollection = new HashMapCollection();
        hashMapCollection.setSailigBoat(sailingBoat);

        System.out.println("enter 0 to add information; press 1 to display the collection; press 2 to exit the menu");
        int menu1 = sc.nextInt();

        switch (menu1) {
            case 0:

                System.out.println("enter the ship type");
                String type1 = sc.next();

                System.out.println("enter size");
                int size1 = sc.nextInt();

                System.out.println("enter speed");
                int speed1 = sc.nextInt();

                System.out.println("enter number of sails");
                int sail1 = sc.nextInt();

                SailingBoat sailingBoat1 = new SailingBoat(type1, size1, speed1, sail1);

                hashMapCollection.setSailigBoat(sailingBoat1);

                System.out.println("for deleting press 0; press 1 to display the collection;  press 2 to exit the menu");
                int menu2 = sc.nextInt();

                switch (menu2) {
                    case 0:
                        System.out.println("for deleting first element press 0; for deleting second element press 1");
                        int delete = sc.nextInt();
                        switch (delete) {
                            case 0:
                                hashMapCollection.removeSailingBoat(0);
                                printResults(hashMapCollection);
                                break;
                            case 1:
                                hashMapCollection.removeSailingBoat(1);
                                printResults(hashMapCollection);
                                break;

                            default:
                                System.out.println("enter correct number");
                        }
                        break;
                    case 1:
                        printResults(hashMapCollection);
                        break;

                    case 2:
                        sc.close();
                        break;

                    default:
                        System.out.println("enter correct number");

                }
                break;

            case 1:
                printResults(hashMapCollection);
                break;

            case 2:
                sc.close();
                break;

            default:
                System.out.println("enter correct number");

        }
    }

    public static void printResults(HashMapCollection hashMapCollection) {
        for (SailingBoat sailingBoat : hashMapCollection.getSailingBoat()) {
            System.out.println(sailingBoat.getInfoAutomotive());
        }
    }

}
