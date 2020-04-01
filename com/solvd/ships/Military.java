package com.solvd.ships;

public class Military extends Boat implements INaval, IHighSpeedCraft, IRangeOfBattle {

    private String armament;
    private int army = 300;
    private int range = 3;

    public Military (String type,  int size, int speed, String armament)  {
        super (type, size, speed);
        this.armament = armament;
    }
    public void setArmy(int value) {
        this.army = value;
    }

    public int getArmy() {
        return this.army;

    }

    @Override
    public void highSpeed() {

    }

    @Override
    public int hulls() {
        return 6;

    }

    @Override
    public int BattlesRenge() {
        this.range *=isMiters;
        return range;
    }

    public void getInfo(){
        printInfo();
        System.out.println("Armament: " + armament);
        System.out.println("HighSpeedCraft: " + isSpeed);
        System.out.println( "Hulls: " + hulls());
        System.out.println( "BattlesRenge: " + BattlesRenge());
        System.out.println("Army of soldiers: " + getArmy());

    }
}

