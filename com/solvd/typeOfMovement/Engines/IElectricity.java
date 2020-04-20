package com.solvd.typeOfMovement.Engines;

import com.solvd.typeOfMovement.IEngines;

public interface IElectricity extends IEngines {

    public default String getInfoMotorEngine() {
        return " is driven by electricity energy. ";
    }

}
