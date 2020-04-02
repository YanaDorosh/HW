package com.solvd.executor;

import com.solvd.ships.INaval;
import com.solvd.ships.Roadstead;
import com.solvd.ships.civil.*;
import com.solvd.ships.civil.service.Fishing;
import com.solvd.ships.civil.service.Icebreaker;
import com.solvd.ships.navy.military.IRangeOfBattle;
import com.solvd.ships.navy.military.Military;
import com.solvd.ships.navy.military.Submarine;
import com.solvd.ships.navy.Navy;

public class Executor {
        public static void main(String[] args) {

            INaval service = new Service("Service", 150, 510);
            Roadstead roadstead = new Roadstead();

            roadstead.setNaval(service);
            System.out.println("Roadstead: " + roadstead.getNaval().getInfoNoval() );
            System.out.println("================================");

            INaval transport = new Transport("Transport", 500, 500);

            roadstead.setNaval(transport);
            System.out.println("Roadstead: " + roadstead.getNaval().getInfoNoval() );
            System.out.println("================================");

            INaval icebreaker = new Icebreaker("Icebreaker", 450, 230);
            roadstead.setNaval(icebreaker);
            System.out.println("Roadstead: " + roadstead.getNaval().getInfoNoval() );
            System.out.println("================================");

            IAutomotive sailing = new SailingBoat("Sailing",350, 360);

            roadstead.setAutomotive(sailing);
            System.out.println("Roadstead: " + roadstead.getAutomotive().getInfoAutomotive() );
            System.out.println("================================");

            IRiver civil = new Civil("Civil", 450, 450);

            roadstead.setRiver(civil);
            System.out.println("Roadstead: " + roadstead.getRiver().getInfoCivil());
            System.out.println("================================");


            IRiver fishing = new Fishing("Fishing", 150, 250);

            roadstead.setRiver(fishing);
            System.out.println("Roadstead: " + roadstead.getRiver().getInfoCivil());
            System.out.println("================================");

            IRangeOfBattle military = new Military("Military", 250, 360);
            Navy navy = new Navy();

            navy.setRangeOfBattle(military);
            System.out.println("Navy: " + navy.getRangeOfBattle().getInfoNavy() );
            System.out.println("BattlesRenge: " + navy.getRangeOfBattle().BattlesRenge());
            System.out.println("================================");


            IRangeOfBattle submarine = new Submarine("Military submarine", 500, 100);
            navy.setRangeOfBattle(submarine);

            System.out.println("Navy: " + navy.getRangeOfBattle().getInfoNavy());
            System.out.println("BattlesRenge: " + navy.getRangeOfBattle().BattlesRenge());
            System.out.println("================================");

        }

    }





