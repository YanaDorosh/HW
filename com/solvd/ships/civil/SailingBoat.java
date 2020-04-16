package com.solvd.ships.civil;

import com.solvd.ships.Boat;

public class SailingBoat extends Boat implements IAutomotive {

    private int sailings;

    public SailingBoat() {

    }

    public SailingBoat(String type, int size, int speed, int sailings ) {
        super(type, size, speed);
        this.sailings = sailings;
    }

    @Override
    public int sailings() {
        return this.sailings;
    }

    @Override
    public String getInfoAutomotive() {
        String infoSailing = "    Namber of sails: " + sailings();
        return "Sailboat " + getInfoBoat() + infoSailing + combinePower() ;
    }

    @Override
    public void humanPowered(String isType) {
    }

    @Override
    public String toString() {
        return getInfoAutomotive();
    }

}


