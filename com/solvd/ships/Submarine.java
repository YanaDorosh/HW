package com.solvd.ships;

public class Submarine extends Military implements INaval, IRangeOfBattle {

    private String engine = "atomic";
    private String armament;
    private int army = 50;
    private int range = 2;

    public Submarine (String type,  int size, int speed, String armament )  {
        super (type, size, speed, armament);
    }

    public void setEngine(String  value) {
        this.engine= value;
    }

    public String getEngine() {
        return this.engine;
    }
    public void setArmy(int  value) {
        this.army= value;
    }

    public int getArmy() {
        return this.army;
    }

    @Override
    public int hulls() {
        return 3;
    }

    @Override
    public int BattlesRenge() {
        this.range *=isMiters;
        return range;
    }


}
