package com.solvd.typeOfMovement.Engines;

import com.solvd.typeOfMovement.IEngines;

public interface INuclear extends IEngines {

    public default String getInfoNuclearEngine(){
       return " is driven by atomic energy. ";

        }

}
