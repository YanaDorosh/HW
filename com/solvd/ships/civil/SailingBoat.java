package com.solvd.ships.civil;

import com.solvd.ships.Boat;
import com.solvd.sіwimmingPlace.INaval;
import com.solvd.typeOfMovement.IAutomotive;

public class SailingBoat extends Boat implements INaval, IAutomotive {

    private int sailings;
    private int hulls = 1;

    public SailingBoat() {

    }

    public SailingBoat(double buoyancy, int size, int speed, int sailings) {
        super(buoyancy, size, speed);
        this.sailings = sailings;
    }

    @Override
    public int sailings() {
        return this.sailings;
    }

    @Override
    public String getInfoAutomotive() {
        String infoSailing = "    Number of sails: " + sailings();
        return Boat.count++ + " Type Sail boat. " + getInfoBoat() + infoSailing + combinePower()
                + "   Hulls:  " + hulls() + " " + getInfoNaval();
    }

    @Override
    public void humanPowered(String isType) {
    }

    @Override
    public int hulls() {
        return this.hulls;
    }

    @Override
    public String getInfoNaval() {
        return isNaval;
    }

    @Override
    public String toString() {
        return getInfoAutomotive();
    }

}


