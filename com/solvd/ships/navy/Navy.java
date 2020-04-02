package com.solvd.ships.navy;

import com.solvd.ships.navy.military.IRangeOfBattle;

public class Navy {

    private IRangeOfBattle rangeOfBattle;

    public void setRangeOfBattle(IRangeOfBattle rangeOfBattle) {
        this.rangeOfBattle = rangeOfBattle;
    }

    public IRangeOfBattle  getRangeOfBattle() {
        return this.rangeOfBattle;
    }

}

