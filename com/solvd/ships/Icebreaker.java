package com.solvd.ships;

public class Icebreaker extends Service implements INaval {

    private String oil;

    public Icebreaker (String type,  int size, int speed, String oil )  {
        super (type, size, speed);
        this.oil = oil;
    }

    public void getInfo(){
        printInfo();
        System.out.println("Type of oil : " + oil);
        System.out.println( "Hulls: " + hulls());
    }

    @Override
    public int hulls() {
        return 3;
    }
}
