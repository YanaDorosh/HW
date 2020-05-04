package com.solvd.typeOfMovement.Engines;

import com.solvd.typeOfMovement.IEngines;

public interface IMotor extends IEngines {

    public default String getInfoMotorEngine() {
        return " Is propelled by an internal combustion engine. ";
    }
}
