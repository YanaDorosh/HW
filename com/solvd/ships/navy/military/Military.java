package com.solvd.ships.navy.military;

import com.solvd.ships.Boat;
import com.solvd.ships.INaval;


public class Military extends Boat implements INaval, IRangeOfBattle {

    private String armament;
    private int army;
    private int range;
    private int hulls;


    public Military() {

    }

    public Military(String type, int size, int speed, String armament) {
        super(type, size, speed);
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

    public String getInfoNavy() {
        String infoNavy = "    Armament: " + getArmament() ;
        return getInfoBoat() + infoNavy;
    }

    @Override
    public int hulls() {
        return this.hulls;

    }

    @Override
    public String getInfoNoval() {
        return null;
    }

    @Override
    public int BattlesRenge() {
        this.range *= isMiters;
        return range;
    }


}

