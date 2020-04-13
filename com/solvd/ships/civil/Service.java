package com.solvd.ships.civil;

import com.solvd.ships.Boat;
import com.solvd.ships.INaval;

public class Service extends Boat implements INaval {

    private int power ;
    private int hulls ;

    public Service() {

    }

    public Service(String type, int size, int speed) {
        super(type, size, speed);

    }

    public void setPower(int value) {
        this.power = value;
    }

    public int getPower() {
        return this.power;
    }

    public void setHulls(int value) {
        this.hulls = value;
    }

    @Override
    public int hulls() {
        return this.hulls;
    }

    @Override
    public String getInfoNoval() {
        String infoNaval = "    Hulls: " + String.valueOf(hulls()) + "   Power: " + String.valueOf(getPower());
        return getInfoBoat() + infoNaval;
    }

}

