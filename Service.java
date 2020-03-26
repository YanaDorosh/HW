package com.home;

public class Service extends Boat {
	int power;
	
	

	public Service (String type, String appointment, int size, int speed, int power )  {
		super (type, appointment, size, speed);
		this.power = power;
		System.out.println("Pulling force: " + power);
	}
}
	
