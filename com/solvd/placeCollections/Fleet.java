package com.solvd.placeCollections;

import com.solvd.ships.navy.military.Military;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Fleet  {

//    private List<?> fleetShips;
Storage storage = new Storage();
//    private List<Military> militarise = new ArrayList<>();
//    private List<Submarine> submarines = new ArrayList<>();
    private List<? extends Military> listOfMilitary;

    public Fleet() {
       listOfMilitary = new ArrayList<>();
//        fleetShips = new ArrayList<>();
    }

  public void setShipOfFleet(List <?> listOfMilitary) {
       this.listOfMilitary= storage.militaryList;
      // this.submarines =submarines;

    }
    public void addShipOfFleet(List <?> listOfMilitary) {
        storage.militaryList.add(new Military(buoyancy, size, speed, army, armament));
       // submarines.add(new Submarine());

    }

    public void removeShipOfFleet(int index) {
        listOfMilitary.remove(index);

    }

    public List<? extends Military> getShipOfFleet() {
        return listOfMilitary;
    }


    private int buoyancy;
    private int size;
    private int speed;
    int army;
    private Scanner sc = new Scanner(System.in);
    String armament;

    public void mm() {
        Fleet fleet = new Fleet();
        System.out.println("enter buoyancy of the vessel");
        buoyancy = sc.nextInt();
        System.out.println("enter size");
        size = sc.nextInt();
        System.out.println("enter speed");
        speed = sc.nextInt();
        System.out.println("enter armament");
        armament = sc.next();


       // Military military = new Military(buoyancy, size, speed, army, armament);
        fleet.setShipOfFleet(listOfMilitary);
//printInfoColection(listOfMilitary);
    }

    public void printInfoColection(Collection<?> list) {
        for (Object ls : list) {
            System.out.println(ls.toString());
        }
    }



}
