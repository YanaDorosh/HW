package com.solvd.placeCollections;

import com.solvd.ships.navy.military.Military;
import com.solvd.ships.navy.military.Submarine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fleet{

    List<Military> militaries = new ArrayList<>();
    List<Submarine> submarines = new ArrayList<>();
    List<? extends Military> listOfMilitary;

    public Fleet() {
        listOfMilitary = new ArrayList<>();
    }


   //////////////////
    public void printInfoColection(List<?> list) {
        for (Object ls : list) {
            System.out.println(ls.toString());
        }
    }
////////////////////////////


    public void setShipOfFleet(Military military) {
       this.militaries = militaries;
       this.submarines =submarines;

    }
    public void addShipOfFleet(Military military) {
        militaries.add(new Military());
        submarines.add(new Submarine());

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
    private Scanner sc = new Scanner(System.in);

    public void mm() {
        Fleet fleet = new Fleet();
        System.out.println("enter buoyancy of the vessel");
        buoyancy = sc.nextInt();
        System.out.println("enter size");
        size = sc.nextInt();
        System.out.println("enter speed");
        speed = sc.nextInt();
        System.out.println("enter armament");
        String armament = sc.next();

        Military military = new Military(buoyancy, size, speed, armament);
        fleet.setShipOfFleet(military);
        fleet.printInfoColection(fleet.getShipOfFleet());

    }
}
