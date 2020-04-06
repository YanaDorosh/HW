package com.solvd.ships.civil.service;

import com.solvd.ships.INaval;
import com.solvd.ships.civil.Service;

public final class Icebreaker extends Service implements INaval {

    private String oil = " Special -50";
    private int hulss = 3;

    public Icebreaker() {

    }

    public Icebreaker(String type, int size, int speed) {
        super(type, size, speed);

    }


    @Override
    public String getInfoNoval() {
        String infoNaval = "    Hulls: " + String.valueOf(hulls()) + "   Oil: " + oil;
        return getInfoBoat() + infoNaval;

    }

    @Override
    public int hulls() {
        return this.hulss;
    }
}
