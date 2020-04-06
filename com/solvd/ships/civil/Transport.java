package com.solvd.ships.civil;

import com.solvd.ships.Boat;
import com.solvd.ships.INaval;

public class Transport extends Boat implements INaval {

    private int loading = 1000;
    private int hulls = 7;

    public Transport() {

    }

    public Transport(String type, int size, int speed) {
        super(type, size, speed);
    }

    public void setTransport(int value) {
        this.loading = value;
    }

    public int getTransport() {
        return this.loading;
    }

    @Override
    public int hulls() {
        return this.hulls;
    }

    @Override
    public String getInfoNoval() {
        String infoNaval = "  Hulls: " + String.valueOf(hulls()) +
                "  Transport loading tons: " + String.valueOf(loading);
        return getInfoBoat() + infoNaval;
    }
}
