package com.cisco.Functionalinterfaces;

@FunctionalInterface
public interface FunInterfaces
{
	
	public void m1();
	
	
	default void a1()
	{
		System.out.println("This is a1 Class");
	}
	
	
	public static void a2()
	{
		System.out.println("This is a2 Class");
	}
	
	
	
	
		
		
	

}
