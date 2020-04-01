package com.solvd.executor;

import com.solvd.ships.*;

public class Executor {
        public static void main(String[] args) {


            Civil civil = new Civil("Civil",450, 450, 3000);
            civil.getInfo();
            System.out.println("================================");

            SailingBoat sailing = new SailingBoat("Sailing",350, 360);
            int sailings = sailing.getSailingsNumber();
            sailing.getInfo();
            System.out.println("================================");

            Transport transport = new Transport("Transport", 500, 500);
            int loading = transport.getTransport();
            transport.printInfo();
            System.out.println("Hulls: " + transport.hulls());
            System.out.println("Transport loading tons: " + loading);
            System.out.println("================================");

            Military military = new Military("Military", 250, 360, "RIM-162 ESSM launchers/ RIM-116 RAM/ Phalanx CIWS/ machine guns" );
            int army = military.getArmy();
            military.getInfo();
            System.out.println("================================");

            Submarine submarine = new Submarine("Military submarine", 500, 100, "torpedo");
            String engine = submarine.getEngine();
            submarine.getInfo();
            System.out.println("================================");

            Service service = new Service("Service", 150, 510);
            int servicePower = service.getPower();
            service.getInfo();
            System.out.println("================================");

            Icebreaker icebreaker = new Icebreaker("Icebreaker", 450, 230, "Special -45" );
            icebreaker.getInfo();
            System.out.println("================================");

            Fishing fishing = new Fishing("Fishing", 150, 250, 25);
            fishing.getInfo();
            System.out.println("================================");

        }


    }





