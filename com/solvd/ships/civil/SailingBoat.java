package com.solvd.ships.civil;

import com.solvd.myException.SizeException;
import com.solvd.myException.SpeedException;
import com.solvd.ships.Boat;
import com.solvd.typeOfMovement.IAutomotive;
import com.solvd.sіwimmingPlace.INaval;

public class SailingBoat extends Boat implements INaval, IAutomotive {

    private int sailings;
    private int hulls = 1;

    public SailingBoat() {

    }

    public SailingBoat(double buoyancy, int size, int speed, int sailings) throws SizeException, SpeedException {
        super(buoyancy, size, speed);
        this.sailings = sailings;
    }

    @Override
    public int sailings() {
        return this.sailings;
    }

    @Override
    public String getInfoAutomotive() {
        String infoSailing = "    Namber of sails: " + sailings();
        return "Type Sail boat. " + getInfoBoat() + infoSailing + combinePower()
                + String.valueOf(hulls()) + getInfoNaval();
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
        return " Swimming place: sea. ";
    }

    @Override
    public String toString() {
        return getInfoAutomotive();
    }

}


