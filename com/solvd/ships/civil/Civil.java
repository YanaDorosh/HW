package com.solvd.ships.civil;

import com.solvd.myException.SizeException;
import com.solvd.myException.SpeedException;
import com.solvd.ships.Boat;
import com.solvd.typeOfMovement.IEngines;

public class Civil extends Boat implements IEngines {

    private String classification;
    private String engine = "  Is used electricity or motor engines ";

    public Civil() {

    }

    public Civil(double buoyancy, int size, int speed, String classification) throws SizeException, SpeedException {
        super(buoyancy, size, speed);
        this.classification = classification;
    }

    public String getInfoCivil() {
        return "Civil. " + getInfoBoat() + getInfoEngine();
    }

    @Override
    public String toString() {
        return getInfoCivil();
    }

    @Override
    public String getInfoEngine() {
        return engine;
    }
}

