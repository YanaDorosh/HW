package com.solvd.typeOfMovement.Engines;

import com.solvd.typeOfMovement.IEngines;

public interface IMotor extends IEngines {

    public default String getInfoMotorEngine(){
        return " is propelled by an internal combustion engine. ";
    }
}
