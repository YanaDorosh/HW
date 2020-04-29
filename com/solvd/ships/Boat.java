package com.solvd.ships;

import com.solvd.myException.BouyancyException;
import com.solvd.myException.SizeException;
import com.solvd.myException.SpeedException;

public abstract class Boat {

    private double buoyancy;
    private int size;
    private int speed;
    private final int KNOTE = 1852;
    private int minSize = 3;

    public Boat() {
    }

    public Boat(double buoyancy, int size, int speed)  {

        try {
            if (size <= minSize) {
                throw new SizeException();
            }
        } catch (SizeException e) {
            System.out.println(e.getMessage());
        }
        try {
            if (speed >= 300 | speed <= 30) {
                throw new SpeedException();
            }
        } catch (SpeedException e) {
            System.out.println(e.getMessage());
        }
        try {
            if (buoyancy>= 0.23 | buoyancy <= 0.98) {
                throw new BouyancyException();
            }
        } catch (BouyancyException e) {
            System.out.println(e.getMessage());
        }

        this.buoyancy = buoyancy;
        this.speed = speed;
        this.size = size;
    }


    public double getBuoyancy() {
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

}


