package com.solvd.ships;

public class SailingBoat extends Boat implements IAutomotive {

    private int sailings = 11;

    public SailingBoat (String type,  int size, int speed)  {
        super (type, size, speed);
    }

    public void setSailingsNumber(int value) {
        this.sailings = value;
    }

    public int getSailingsNumber() {
        return this.sailings;
    }

    public void getInfo() {
        printInfo();
        System.out.println("Max sailing's number: " + sailings);
        System.out.println("Automotive's type: " + isType);
    }

    @Override
    public int sailings() {
        return this.sailings;
    }

    @Override
    public void humanPowered() {
    }

    @Override
    public void mtorboat() {
    }
}


