package com.solvd.ships.civil;

import com.solvd.ships.Boat;

public class Civil extends Boat implements IRiver {

    private int passengers;
    private double kilomitr;
    private int range;

    public Civil() {

    }

    public Civil(String type, int size, int speed, int passengers) {
        super(type, size, speed);
        this.passengers = passengers;
    }

    @Override
    public String getInfoCivil() {
        String infoRiver = "     Passengers  " + String.valueOf(passengers) + "   Used like: " + isRiver;
        return "Civil's " + getInfoBoat() + infoRiver;
    }
    @Override
    public String toString() {
        return getInfoCivil();
    }



}

