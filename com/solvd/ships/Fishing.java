package com.solvd.ships;

public class Fishing extends Service implements IRiver {

    private int ton;
    private double kilomitr;

    public Fishing (String type, int size, int speed, int ton)  {
        super (type, size, speed);
        this.ton =  ton;
    }
    public void getInfo(){
        printInfo();
        System.out.println("Ton: " + ton);
        System.out.println("Used like: " + isRiver);
        System.out.println("Kilomiters: " + run());
    }

    @Override
    public double run() {
        this.kilomitr = (this.ton/isRange)*100;
        return  this.kilomitr;

    }
}

