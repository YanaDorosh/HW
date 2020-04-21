package com.solvd.ships.navy.military;

import com.solvd.myException.SizeException;
import com.solvd.myException.SpeedException;
import com.solvd.typeOfMovement.Engines.INuclear;

public class Submarine extends Military implements INuclear {

    private String armament;
    private int army = 250;
    private int range = 5;
    private int hulls = 2;

    public Submarine() {
    }

    public Submarine(double buoyancy, int size, int speed, String armament) throws SpeedException, SizeException {
        super(buoyancy, size, speed, armament);

    }

    public void setArmy(int value) {
        this.army = value;
    }

    public int getArmy() {
        return this.army;

    }

    @Override
    public int hulls() {
        return this.hulls;
    }

    @Override
    public double BattlesRange() {
        this.range *= isMiters * getSize();
        return range;

    }

    public String getInfoSubmarine() {
        return getInfoMilitary() + getInfoNuclearEngine();

    }

    @Override
    public String getInfoEngine() {
        return getInfoNuclearEngine();
    }
}

