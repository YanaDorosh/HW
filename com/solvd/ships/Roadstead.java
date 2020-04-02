package com.solvd.ships;

import com.solvd.ships.civil.IAutomotive;
import com.solvd.ships.civil.IRiver;

public class Roadstead {

    private INaval naval;
    private IAutomotive automotive;
    private IRiver river;


    public void setNaval(INaval naval) {
        this.naval = naval;
    }

    public INaval getNaval() {
        return this.naval;
    }

    public void setAutomotive(IAutomotive automotive) {
        this.automotive = automotive;
    }

    public IAutomotive getAutomotive() {
        return automotive;
    }

    public void setRiver(IRiver river) {
        this.river = river;
    }

    public IRiver getRiver() {
        return river;
    }
}
