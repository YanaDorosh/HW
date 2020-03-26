package com.home;

public class Civil extends Boat {
	
	int passengers;
	

	public Civil(String type, String appointment, int size, int speed, int passengers) {
		this.type = type;
		this.appointment = appointment;
		this.size = size;
		this.speed = speed;
		this.passengers = passengers;
		
		System.out.println ( "Passengers: " + passengers);
	}
	
	
}
