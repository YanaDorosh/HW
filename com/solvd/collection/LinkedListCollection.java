package com.solvd.collection;

import com.solvd.ships.civil.Civil;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class LinkedListCollection {
    LinkedList<Civil> linkedListCivils;

    LinkedListCollection() {
        linkedListCivils = new LinkedList<Civil>();
    }

    public void setCivil(Civil civil) {
        linkedListCivils.add(civil);
    }

    public void removeCivil(int index) {
        linkedListCivils.remove(index);
    }

    public List<Civil> getlinkedListCivils() {
        return linkedListCivils;
    }


    public static void getLinkedMenu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the type of  Civil ship");
        String type = sc.next();

        System.out.println("enter size");
        int size = sc.nextInt();

        System.out.println("enter speed");
        int speed = sc.nextInt();

        System.out.println("enter the number of passengers to calculate the range");
        int passengers = sc.nextInt();

        Civil civil = new Civil(type, size, speed, passengers);
        LinkedListCollection linkedListCollection = new LinkedListCollection();
        linkedListCollection.setCivil(civil);

        System.out.println("enter 0 to add information; press 1 to display the collection; press 2 to exit the menu");
        int menu1 = sc.nextInt();

        switch (menu1) {
            case 0:
                System.out.println("enter the type of Civil ship");
                String type1 = sc.next();

                System.out.println("enter size");
                int size1 = sc.nextInt();

                System.out.println("enter speed");
                int speed1 = sc.nextInt();

                System.out.println("enter the number of passengers to calculate the range");
                int passengers1 = sc.nextInt();

                Civil civil1 = new Civil(type1, size1, speed1, passengers1);

                linkedListCollection.setCivil(civil1);

                System.out.println("for deleting press 0; press 1 to display the collection;  press 2 to exit the menu");
                int menu2 = sc.nextInt();

                switch (menu2) {
                    case 0:
                        System.out.println("for deleting first element press 0; for deleting second element press 1");
                        int delete = sc.nextInt();
                        switch (delete) {
                            case 0:
                                linkedListCollection.removeCivil(0);
                                printResults(linkedListCollection);
                                break;
                            case 1:
                                linkedListCollection.removeCivil(1);
                                printResults(linkedListCollection);
                                break;

                            default:
                                System.out.println("enter correct number");
                        }
                        break;
                    case 1:
                        printResults(linkedListCollection);
                        break;

                    case 2:
                        sc.close();
                        break;

                    default:
                        System.out.println("enter correct number");

                }
                break;

            case 1:
                printResults(linkedListCollection);
                break;

            case 2:
                sc.close();
                break;

            default:
                System.out.println("enter correct number");

        }
    }

    public static void printResults(LinkedListCollection linkedListCollection) {
        for (Civil civil : linkedListCollection.getlinkedListCivils()) {
            System.out.println(civil.getInfoCivil());
        }
    }


}
