package com.home;


public class Transport extends Civil{
	
	private int loading = 1000;

	public Transport (String type, String appointment, int size, int speed, int loading)  {
		super (type, appointment, size, speed, loading);
	}
	
	
	public void setTransport(int value) {
		this.loading = value;
	}
	
	public int getTransport() {
		return this.loading;	
	}

}

