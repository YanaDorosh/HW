package com.solvd.ships.civil.service;

import com.solvd.ships.INaval;
import com.solvd.ships.civil.Service;

public class Icebreaker extends Service implements INaval {

    private String oil = " Special -45";
    private int hulss = 3;

    public Icebreaker() {

    }

    public Icebreaker(String type, int size, int speed) {
        super(type, size, speed);

    }

    @Override
    public String getInfoNoval() {
        String sizeStr = String.valueOf(getSize());
        String speedStr = String.valueOf(getSpeed());
        String infoBoat = getType() + "    " + "Size: " + sizeStr + "   Speed: " + speedStr;
        String infoNaval = "    Hulls: " + String.valueOf(hulls()) + "   Oil: " + oil;
        return infoBoat + infoNaval;

    }

    @Override
    public int hulls() {
        return this.hulss;
    }
}
