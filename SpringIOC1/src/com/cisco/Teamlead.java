package com.cisco;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Teamlead {

	
	//@Qualifier("beanName") is used when multiple beans of the same type exist,
	// and we need to pick a specific one.
	@Autowired
	@Qualifier("devloper")
	// The Qualifier name is must be same of that class name or same method name
	// Otherwise it will not Exists. //
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
