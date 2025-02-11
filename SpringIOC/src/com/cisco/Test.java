package com.cisco;

public class Test {

	public static void main(String[] args) {
		
		// Dependecy  //
		Manager m = new Manager();
		
		Teamlead tl = new Teamlead();
		
		Devloper  dev = new Devloper();
		
		
		// Injection //
		
		m.setTl(tl);
		
		tl.setDev(dev);
		
		m.dowork();

	}

}
