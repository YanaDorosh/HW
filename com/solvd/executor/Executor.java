package com.solvd.executor;

import com.solvd.ships.*;
import com.solvd.ships.civil.*;
import com.solvd.ships.civil.service.Fishing;
import com.solvd.ships.civil.service.Icebreaker;
import com.solvd.ships.navy.military.IRangeOfBattle;
import com.solvd.ships.navy.military.Military;
import com.solvd.ships.navy.military.Submarine;
import com.solvd.ships.navy.Navy;

public class Executor {
    public static void main(String[] args) {
        Permission permission = new Permission();


        INaval service = new Service("Service", 150, 510);
        Roadstead roadstead = new Roadstead();
        roadstead.setNaval(service);
        System.out.println("Roadstead: " + roadstead.getNaval().getInfoNoval());
        Boat servicePermise = permission.getPermission(Season.SPRING);


        INaval transport = new Transport("Transport", 500, 500);
        roadstead.setNaval(transport);
        System.out.println("Roadstead: " + roadstead.getNaval().getInfoNoval());
        Boat trasportPermiss = permission.getPermission(Season.FALL);


        INaval icebreaker = new Icebreaker("Icebreaker", 450, 230);
        roadstead.setNaval(icebreaker);
        System.out.println("Roadstead: " + roadstead.getNaval().getInfoNoval());
        Boat icebreakertPermiss = permission.getPermission(Season.WINTER);


        IAutomotive sailing = new SailingBoat("Sailing", 350, 360);
        roadstead.setAutomotive(sailing);
        System.out.println("Roadstead: " + roadstead.getAutomotive().getInfoAutomotive());
        Boat sailingPermiss = permission.getPermission(Season.SAMMER);


        IRiver civil = new Civil("Civil", 450, 450);
        roadstead.setRiver(civil);
        System.out.println("Roadstead: " + roadstead.getRiver().getInfoCivil());
        Boat civilgPermiss = permission.getPermission(Season.FALL);


        IRiver fishing = new Fishing("Fishing", 150, 250, 35.3);
        roadstead.setRiver(fishing);
        System.out.println("Roadstead: " + roadstead.getRiver().getInfoCivil());
        Boat fishingPermiss = permission.getPermission(Season.SPRING);

        IRangeOfBattle military = new Military("Military", 250, 360);
        Navy navy = new Navy();
        navy.setRangeOfBattle(military);
        System.out.println("Navy: " + navy.getRangeOfBattle().getInfoNavy());
        System.out.println("BattlesRenge: " + navy.getRangeOfBattle().BattlesRenge());
        Boat militaryPermiss = permission.getPermission(Season.FALL);


        IRangeOfBattle submarine = new Submarine("Military submarine", 500, 100);
        navy.setRangeOfBattle(submarine);

        System.out.println("Navy: " + navy.getRangeOfBattle().getInfoNavy());
        System.out.println("BattlesRenge: " + navy.getRangeOfBattle().BattlesRenge());
        Boat submarynePermiss = permission.getPermission(Season.FALL);

    }

}





