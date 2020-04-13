package com.solvd.collection;

import com.solvd.ships.civil.service.Fishing;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetCollection {
    Set<Fishing> fishingSet;

    public SetCollection() {
        fishingSet = new HashSet<Fishing>();
    }


    public void setFishingSet(Fishing fishing) {
       fishingSet.add(fishing);
    }

    public Set<Fishing> getFishingSet() {
        return fishingSet;
    }

    public void removeFishing(int index) {
        fishingSet.remove(fishingSet.toArray()[index]);
    }

    public static void  getHashSetMenu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the ship type");
        String type = sc.next();

        System.out.println("enter size");
        int size = sc.nextInt();

        System.out.println("enter speed");
        int speed = sc.nextInt();

        System.out.println("enter ton");
        int ton = sc.nextInt();


        Fishing fishing = new Fishing(type, size, speed, ton);
        SetCollection setCollection  = new SetCollection();
        setCollection.setFishingSet(fishing);

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

                System.out.println("enter ton");
                int ton1 = sc.nextInt();

                Fishing fishing1 = new Fishing(type1, size1, speed1, ton1);

                setCollection.setFishingSet(fishing1);

                System.out.println("for deleting press 0; press 1 to display the collection;  press 2 to exit the menu");
                int menu2 = sc.nextInt();

                switch (menu2) {
                    case 0:
                        System.out.println("for deleting first element press 0; for deleting second element press 1");
                        int delete = sc.nextInt();
                        switch (delete) {
                            case 0:
                                setCollection.removeFishing(1);
                                printResults(setCollection);
                                break;
                            case 1:
                                setCollection.removeFishing(0);
                                printResults(setCollection);
                                break;

                            default:
                                System.out.println("enter correct number");
                        }
                        break;
                    case 1:
                        printResults(setCollection);
                        break;

                    case 2:
                        sc.close();
                        break;

                    default:
                        System.out.println("enter correct number");

                }
                break;

            case 1:
                printResults(setCollection);
                break;

            case 2:
                sc.close();
                break;

            default:
                System.out.println("enter correct number");

        }
    }

    public static void printResults(SetCollection setCollection) {
        for (Fishing fishing : setCollection.getFishingSet()) {
            System.out.println(fishing.getInfoCivil());
        }
    }

}
