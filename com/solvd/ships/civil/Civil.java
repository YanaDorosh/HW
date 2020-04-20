package com.solvd.ships.civil;

import com.solvd.ships.Boat;

public class Civil extends Boat  {

    private String classification;

    public Civil(){

    }
    public Civil(int buoyancy, int size, int speed, String classification){
        super(buoyancy, size, speed);
        this.classification = classification;
    }


}

