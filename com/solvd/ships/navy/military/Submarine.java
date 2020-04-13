package com.solvd.ships.navy.military;

import com.solvd.ships.INaval;

public final class Submarine extends Military implements INaval, IRangeOfBattle {

    private String engine;
    private String armament;
    private int army;
    private int range;
    private int hulls ;

    public Submarine(String type, int size, int speed, String armament) {
        super(type, size, speed);
        this.armament=armament;
    }

    public void setEngine(String value) {
        this.engine = value;
    }

    public String getEngine() {
        return this.engine;
    }

    public void setHulls(int value) {
        this.hulls = value;
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
