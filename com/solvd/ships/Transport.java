package com.solvd.ships;

public class Transport extends Boat implements INaval{

    private int loading = 1000;

    public Transport (String type,  int size, int speed)  {
        super (type, size, speed);
    }

    public void setTransport(int value) {
        this.loading = value;
    }

    public int getTransport() {
        return this.loading;
    }

    @Override
    public int hulls() {
        return 7;
    }
}
