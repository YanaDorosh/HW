package com.solvd.typeOfMovement.Engines;

import com.solvd.typeOfMovement.IEngines;

public interface INuclear extends IEngines {

    public default String getInfoNuclearEngine() {
        return " Is driven by atomic energy. ";

    }

}
