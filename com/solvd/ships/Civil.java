package com.solvd.ships;

public class Civil extends Boat implements IRiver{

    private int passengers;
    private double kilomitr;

    public Civil( String type, int size, int speed, int passengers) {
        super (type,  size, speed);
        this.passengers = passengers;
    }

    public void getInfo(){
        printInfo();
        System.out.println("Used like: " + isRiver);
        System.out.println("Kilomiters: " + run());
        System.out.println("Passengers: " + passengers);
    }

    @Override
    public double run() {
        double kilomitr = (this.passengers/isRange)*100;
        return kilomitr;

    }
}

