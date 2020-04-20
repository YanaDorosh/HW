package com.solvd.ships.civil.service;

import com.solvd.ships.civil.Civil;
import com.solvd.typeOfMovement.IEngines;

public class Service extends Civil implements IEngines {

    private  String engine = "   is used electricity or motor engines ";

    public Service() {

    }

    public Service(int buoyancy, int size, int speed, String classification) {
        super(buoyancy, size, speed, classification);

    }

    public String getInfoService() {
        return "Type Service. " + getInfoBoat() + getInfoEngine();
    }

    @Override
    public String getInfoEngine() {
        return engine;
    }
}

