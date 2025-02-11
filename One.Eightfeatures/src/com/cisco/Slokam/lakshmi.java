package com.cisco.Slokam;

public class lakshmi {
	public static void main(String[] args) {
		
		/*
	interface will handle create a sub Class,Overide Un implemented Method.
	step 1:- Provide implementation for those methods.
	step 2:- Create a Sub Class Object.
	step 3:- Call the method using the created Object reference.
	
	 */
		//No Object is created for interface//
		//it create an anonymous Class it creates a sub Class internally it doesn"t
		// have any name.
		intter a = new intter()
		{
			@Override
			public void m1() 
			{
				System.out.println("Biravaaa");
			}
		};
		
		a.m1();
	}
}
