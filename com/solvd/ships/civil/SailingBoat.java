package com.solvd.ships.civil;

import com.solvd.ships.Boat;
import com.solvd.ships.civil.IAutomotive;

public class SailingBoat extends Boat implements IAutomotive {

    private int sailings = 11;

    public SailingBoat() {

    }

    public SailingBoat(String type, int size, int speed) {
        super(type, size, speed);
    }

    public void setSailingsNumber(int value) {
        this.sailings = value;
    }

    public int getSailingsNumber() {
        return this.sailings;
    }

    @Override
    public int sailings() {
        return this.sailings;
    }

    @Override
    public String getInfoAutomotive() {
        String sizeStr = String.valueOf(getSize());
        String speedStr = String.valueOf(getSpeed());
        String infoBoat = getType() + "    " + "Size: " + sizeStr + "   Speed: " + speedStr;
        String infoSailing = "    Sailing's number: " + String.valueOf(sailings)
                + "  Automotive's type: " + isType;
        return infoBoat + infoSailing;
    }

    @Override
    public void humanPowered() {
    }

    @Override
    public void mtorboat() {
    }
}


