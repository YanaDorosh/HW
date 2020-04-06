package com.solvd.ships.navy.military;

import com.solvd.ships.Boat;
import com.solvd.ships.INaval;
import com.solvd.ships.Season;

public final class Submarine extends Military implements INaval, IRangeOfBattle {

    private String engine = "atomic";
    private String armament = "torpedo";
    private int army = 50;
    private int range = 2;
    private int hulls = 3;

    public Submarine(String type, int size, int speed) {
        super(type, size, speed);
    }

    public void setEngine(String value) {
        this.engine = value;
    }

    public String getEngine() {
        return this.engine;
    }

    @Override
    public int hulls() {
        return this.hulls;
    }

    @Override
    public int BattlesRenge() {
        this.range *= isMiters;
        return range;
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
    public String getInfoNavy() {
        String infoNavy = "    Armament: " + getArmament() + "    Army of soldiers: " + String.valueOf(army);
        return getInfoBoat() + infoNavy + getEngine();

    }


}
