package com.home;

public class Icebreaker extends Service{
	
	String oiltype;
	int mintemperature;
	
	public Icebreaker (String type, String appointment, int size, int speed, int power, String oiltype, int mintemperature )  {
		super (type, appointment, size, speed, power);
		this.oiltype = oiltype;
		this.mintemperature = mintemperature;
		System.out.println("Type of oil : " + oiltype);
		System.out.println("Min temperature : " + mintemperature);
	}
}
