package com.solvd.ships.civil;

import com.solvd.ships.Boat;
import com.solvd.ships.civil.IAutomotive;

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
        String infoSailing = "    Namber of sails: " + sailings()
                + "  Automotive's type: " + isType;
        return getInfoBoat() + infoSailing;
    }

    @Override
    public void humanPowered() {
    }

    @Override
    public void motorboat() {
    }
}


