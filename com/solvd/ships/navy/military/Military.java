package com.solvd.ships.navy.military;

import com.solvd.ships.Boat;
import com.solvd.ships.INaval;



public class Military extends Boat implements  INaval,  IRangeOfBattle {

    private String armament ="RIM-162 ESSM launchers" ;
    private int army = 300;
    private int range = 3;
    private int hulls = 6;

    public Military(){

    }

    public Military (String type,  int size, int speed)  {
        super (type, size, speed);

    }

    public void setArmy(int value) {
        this.army = value;
    }

    public int getArmy() {
        return this.army;

    }

    @Override
    public String getInfoNavy() {
        String sizeStr = String.valueOf(getSize());
        String speedStr = String.valueOf(getSpeed());
        String infoBoat = getType()+ "    " + "Size: " + sizeStr + " Speed: " + speedStr;
        String infoNavy = "    Armament: " + armament  + "    Army of soldiers: " + String.valueOf (army);
        return infoBoat + infoNavy;
    }

    @Override
    public int hulls() {
        return this.hulls;

    }

    @Override
    public String getInfoNoval() {
        return null;
    }

    @Override
    public int BattlesRenge() {
        this.range *=isMiters;
        return range;
    }


}

