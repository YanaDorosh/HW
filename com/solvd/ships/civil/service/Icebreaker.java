package com.solvd.ships.civil.service;

import com.solvd.ships.INaval;
import com.solvd.ships.civil.Service;

public final class Icebreaker extends Service implements INaval {

    private String oil;
    private int hulls;

    public Icebreaker() {

    }

    public Icebreaker(String type, int size, int speed) {
        super(type, size, speed);

    }

    public void setHulls(int value) {
        this.hulls = value;
    }
    @Override
    public String getInfoNoval() {
        String infoNaval = "    Hulls: " + hulls() + "   Oil: " + oil;
        return getInfoBoat() + infoNaval;

    }

    @Override
    public int hulls() {
        return this.hulls;
    }
}
