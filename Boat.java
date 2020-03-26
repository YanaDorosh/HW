package com.home;

public class Boat {
	
	String type;
	String appointment;
	int size;
	int speed;
	
	public Boat() {

	}

	public Boat (String type, String appointment, int size, int speed) {
		this.type = type;
		this.appointment = appointment;
		this.size = size;
		this.speed = speed;
	}
	
	protected void printInfo() {
		System.out.println("Type: " + type);
		System.out.println("Appointment: " + appointment);
		System.out.println("Size: " + size);
		System.out.println("Speed: " + speed);
		
	}


}
