package com.solvd.ships;

public abstract class Boat {

    private String type;
    private int size;
    private int speed;

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
        return this.speed;
    }

}


