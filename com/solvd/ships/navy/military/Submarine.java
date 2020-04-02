package com.solvd.ships.navy.military;

import com.solvd.ships.INaval;

public class Submarine extends Military implements INaval, IRangeOfBattle {

    private String engine = "atomic";
    private String armament = "torpedo" ;
    private int army = 50;
    private int range = 2;
    private int hulls = 3;

    public Submarine (String type,  int size, int speed)  {
        super (type, size, speed);
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
        return this.hulls;
    }

    @Override
    public int BattlesRenge() {
        this.range *=isMiters;
        return range;
    }


}
