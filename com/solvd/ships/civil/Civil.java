package com.solvd.ships.civil;

import com.solvd.ships.Boat;

public class Civil extends Boat implements IRiver {

    private int passengers = 3000;
    private double kilomitr = 200.0;
    private int range = 6;

    public Civil() {

    }

    public Civil(String type, int size, int speed) {
        super(type, size, speed);

    }


    public double distance() {
        double kilomitr = (this.passengers / range) * 100;
        return kilomitr;
    }

    @Override
    public String getInfoCivil() {
        String sizeStr = String.valueOf(getSize());
        String speedStr = String.valueOf(getSpeed());
        String infoBoat = getType() + "    " + "Size: " + sizeStr + "   Speed: " + speedStr;
        String infoRiver = "    Kilomiters:  " + String.valueOf(distance()) + "   Used like: " + isRiver
                + "   Passengers: " + passengers;
        return infoBoat + infoRiver;
    }


}

