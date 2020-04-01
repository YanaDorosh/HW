package com.solvd.ships;

public class Service extends Boat implements INaval{

    private int power =300;

    public Service (String type,  int size, int speed )  {
        super (type, size, speed);

    }
    public void setPower(int value) {
        this.power = value;
    }

    public int getPower() {
        return this.power;
    }

    public void getInfo(){
        printInfo();
        System.out.println( "Hulls: " + hulls());
        System.out.println("Power: " + getPower());
    }

    @Override
    public int hulls() {
        return 4;
    }
}

