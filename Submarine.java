package com.home;

public class Submarine extends Military {
	String engine = "atomic";
	String armament ;
	int army;
	
	

	public Submarine (String type, String appointment, int size, int speed, String armament, int army )  {
		super (type, appointment, size, speed);
		this.armament = armament;
		this.army = army;
		System.out.println("Armament: " + armament);
		System.out.println("Army of soldiers: " + army);
	}
	
	public void setEngine(String  value) {
		this.engine= value;
	}
	
	public String getEngine() {
		return this.engine;
	}
	
}

