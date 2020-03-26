package com.home;

public class Fishing extends Service{
	int ton;
	String equipment;

	public Fishing (String type, String appointment, int size, int speed, int power, int ton, String equipment)  {
		super (type, appointment, size, speed, power);
		this.ton =  ton;
		this.equipment = equipment;
		System.out.println("Ton: " + ton);
		System.out.println("Special equipment : " + equipment);
	}

}
