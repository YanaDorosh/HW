package com.solvd.ships.civil.service;

import com.solvd.ships.civil.IRiver;
import com.solvd.ships.civil.Service;

public class Fishing extends Service implements IRiver {

    private int ton = 25;
    private double kilomitr = 200;

    public Fishing(String type, int size, int speed) {
        super(type, size, speed);

    }

    public static double distance(double ton, double kilomitr) {
        kilomitr = (ton / kilomitr) * 100;
        return kilomitr;
    }

    public static int distance() {
        int km = 200;
        int tons = 25;
        km = km / tons * 100;
        return km;
    }


    @Override
    public String getInfoCivil() {
        String sizeStr = String.valueOf(getSize());
        String speedStr = String.valueOf(getSpeed());
        String infoBoat = getType() + "    " + "Size: " + sizeStr + "   Speed: " + speedStr;
        String infoRiver = "    Kilomiters:  " + String.valueOf(distance()) + "   Used like: " + isRiver;
        return infoBoat + infoRiver;
    }
}

