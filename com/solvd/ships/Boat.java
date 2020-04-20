package com.solvd.ships;

import com.solvd.speedException.SpeedException;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Boat {

    private int buoyancy;
    private int size;
    private int speed;
    private final int KNOTE = 1852;
    private Scanner sc = new Scanner(System.in);

    public Boat() {

    }

    public Boat(int buoyancy, int size, int speed) {

        try {
            if (speed >= 300 | speed <= 30)
                throw new SpeedException();
        } catch (SpeedException e) {
            System.out.println(e.getMessage());
            loopSpeed();
        }
        catch (InputMismatchException e){
            System.out.println(" Enter correct information");
        }

        this.buoyancy = buoyancy;
        this.size = size;
        this.speed = speed;
    }


    public int getBuoyancy() {
        return buoyancy;
    }

    public int getSize() {
        return size;
    }


    public int convertSpeed() {
        return speed * KNOTE;
    }


    public final String getInfoBoat() {

        String buoyancyStr = String.valueOf(getBuoyancy());
        String sizeStr = String.valueOf(getSize());
        String speedStr = String.valueOf(convertSpeed());
        String infoBoat = " Buoyancy: " + getBuoyancy() + "   " + "Size: " + sizeStr + "  Speed: " + speedStr;
        return infoBoat;
    }

    public void loopSpeed(){
        if (speed >= 300 | speed <= 30)
            do {
                System.out.println("enter speed");
                speed = sc.nextInt();
            }
            while (speed >= 300 | speed <= 30);
    }


}


