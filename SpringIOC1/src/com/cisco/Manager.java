package com.cisco;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Manager {

	@Autowired
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
