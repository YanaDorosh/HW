package com.solvd.ships;

public abstract class Boat {

    private String type;
    private int size;
    private int speed;
    final int KNOTE = 1852;

    public Boat() {

    }

    public Boat(String type, int size, int speed) {
        this.type = type;
        this.size = size;
        this.speed = speed;
    }

    public String getType() {
        return this.type;
    }

    public int getSize() {
        return this.size;
    }

    public int getSpeed() {
        return this.speed * KNOTE;
    }

    public final String getInfoBoat() {
        String sizeStr = String.valueOf(getSize());
        String speedStr = String.valueOf(getSpeed());
        String infoBoat = getType() + "   " + "Size: " + sizeStr + "  Speed: " + speedStr;
        return infoBoat;
    }


}


