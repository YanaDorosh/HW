package com.solvd.ships.civil;

import com.solvd.ships.Boat;
import com.solvd.ships.INaval;

public class Service extends Boat implements INaval {

    private int power = 300;
    private int hulls = 4;

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


    @Override
    public int hulls() {
        return this.hulls;
    }

    @Override
    public String getInfoNoval() {
        String sizeStr = String.valueOf(getSize());
        String speedStr = String.valueOf(getSpeed());
        String infoBoat = getType() + "    " + "Size: " + sizeStr + "   Speed: " + speedStr;
        String infoNaval = "    Hulls: " + String.valueOf(hulls()) + "   Power: " + String.valueOf(getPower());
        return infoBoat + infoNaval;
    }

}

