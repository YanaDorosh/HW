package com.home;

public class SailingBoat extends Civil {
	
	private int sailings = 11;

	public SailingBoat (String type, String appointment, int size, int speed, int passengers)  {
		super (type, appointment, size, speed, passengers );
	}
	
	
	public void setSailingsNumber(int value) {
		this.sailings = value;
	}
	
	public int getSailingsNumber() {
		return this.sailings;	
	}
	

}
