package com.solvd.ships.navy.military;

import com.solvd.myException.SizeException;
import com.solvd.myException.SpeedException;
import com.solvd.ships.Boat;
import com.solvd.sіwimmingPlace.INaval;
import com.solvd.typeOfMovement.IEngines;


public class Military extends Boat implements INaval, IEngines, IRangeOfBattle {

    private String armament;
    private int army = 1000;
    private double range = 23.6;
    private int hulls = 7;
    private String engine = " is used nuclear or motor ";


    public Military() {

    }

    public Military(double buoyancy, int size, int speed, String armament) throws SizeException, SpeedException {
        super(buoyancy, size, speed);
        this.armament = armament;
    }

    public void setArmy(int value) {
        this.army = value;
    }

    public int getArmy() {
        return this.army;

    }

    public void setArmament(String value) {
        this.armament = value;
    }

    public String getArmament() {
        return this.armament;

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
    public double BattlesRange() {
        this.range *= isMiters * getSize();
        return range;
    }

    public String getInfoMilitary() {
        String armament = "    Armament: " + getArmament();
        return "Type Warship." + getInfoBoat() + armament + "   Range of Battle  " + BattlesRange()
                + getInfoNaval() + "   Hulls  " + hulls() + "   Army " + getArmy();
    }

    @Override
    public String toString() {
        return getInfoMilitary();
    }

    @Override
    public String getInfoEngine() {
        return engine;
    }
}

