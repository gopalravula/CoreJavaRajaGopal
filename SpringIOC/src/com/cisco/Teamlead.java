package com.cisco;

public class Teamlead {

	
	private Devloper dev;

	public void setDev(Devloper dev) {
		this.dev = dev;
	}
	
	
	public void dowork()
	{
		System.out.println("Teamlead Work started");
		dev.dowork();
		System.out.println("Teamlead Work Ended");
	}
	
	
	
}
