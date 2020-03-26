package com.home;

public class Military extends Boat {
	
	private String armament = "RIM-162 ESSM launchers/ RIM-116 RAM/ Phalanx CIWS/ machine guns";
	private int army = 300;
	

	public Military (String type, String appointment, int size, int speed )  {
		super (type, appointment, size, speed);
	}
	
	
	public void setArmament(String value) {
		this.armament = value;
	}
	
	public void setArmy(int value) {
		this.army= value;
	}
	
	public String getArmament() {
		return this.armament;
	}
	
	public int getArmy() {
		return this.army;
		
	}
	
}