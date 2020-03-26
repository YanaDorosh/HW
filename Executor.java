package com.home;

public class Executor {

	public static void main(String[] args) {
		
		Civil c = new Civil ("Civil", "For travel", 450, 450, 3000);
		c.printInfo();
		System.out.println("========");
		
		SailingBoat s = new SailingBoat("Sailing", "Sport and entertainment", 350, 360, 400 );
		s.printInfo();
		int sailings = s.getSailingsNumber() ;
		System.out.println("Sailing's number: " + sailings);
		System.out.println("========");
		
		Transport t = new Transport("Transport", "Transportation of goods", 500, 500, 0 );
		t.printInfo();
		int loading = t.getTransport() ;
		System.out.println("Transport loading tons: " + loading);
		System.out.println("========");
		
		Military m = new Military("Military", "For protection ", 250, 360);
		m.printInfo();
		String armament = m.getArmament() ;
		int army = m.getArmy();
		System.out.println("Armament: " + armament);
		System.out.println("Army of soldiers: " + army);
		System.out.println("========");
		
		
		Submarine sub = new Submarine("Military", "Watercraft capable of operation underwater", 500, 500, " torpedo", 100);
		sub.printInfo();
		String engine = sub.getEngine();
		System.out.println("Engine: " + engine);
		System.out.println("========");
		
		Service serv = new Service("Service", "Towing", 150, 510, 500);
		serv.printInfo();
		System.out.println("========");
		
		Icebreaker ice = new Icebreaker("Service", "Icebreaker", 450, 230, 254, " Special", -45);
		ice.printInfo();
		System.out.println("========");
		
		Fishing f = new Fishing("Service", "For fishing", 150, 250, 254, 52, "Fising tools");
		f.printInfo();
		System.out.println("========");
		
		
		
		
		
		
		
	}

	
}
