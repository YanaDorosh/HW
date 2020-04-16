package com.solvd.ships.civil;

public interface IAutomotive {
    public String isType = "Unpowered";
    public String isPower = "wind power";

    public int sailings();

    public String getInfoAutomotive();

    public void humanPowered(String isType);

    public default  String motorboat(){
        return String.valueOf("  engine ");
    }

    public default String combinePower(){
        return "   Used two types of power:" + motorboat() +  " and " +  isPower;
    }

}
