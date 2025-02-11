package com.cisco;

public class Manager {

	
	private Teamlead tl;

	public void setTl(Teamlead tl) {
		this.tl = tl;
	}
	
	

	public void dowork()
	{
		System.out.println("Manager Work started");
		tl.dowork();
		System.out.println("Manager Work Ended");
	}
	
	
}
