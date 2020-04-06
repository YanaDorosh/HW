package com.solvd.ships.civil.service;

import com.solvd.ships.civil.IRiver;
import com.solvd.ships.civil.Service;

public final class Fishing extends Service implements IRiver {

    private double ton;
    private final double KILOMITR = 1.852;

    public Fishing(String type, int size, int speed, double ton) {
        super(type, size, speed);
        this.ton = ton;
    }


    public double distance() {
        double kilomitr = (this.ton / this.KILOMITR) * 100;
        return kilomitr;
    }

    public int distance(int kilomitr) {
        kilomitr = ((int) this.ton / (int) this.KILOMITR) * 100;
        return kilomitr;
    }

    public double distance(double ton) {
        double kilomitr = KILOMITR * ton;
        return kilomitr;
    }


    @Override
    public String getInfoCivil() {
        String infoRiver = "    Kilomiters:  " + String.valueOf(distance()) + "   Used like: " + isRiver;
        return getInfoBoat() + infoRiver;
    }


}

