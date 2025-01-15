package com.cisco.Functionalinterfaces;

public class TestClass
{
	
	
	public static void main(String[] args)
	{
	
		
		FunInterfaces a1 = new FunInterfaces()
		{
			
			@Override
			public void m1()
			{
				System.out.println("---This is Functional interface Class---");
			}
		};
		
		a1.a1();
		a1.m1();
		FunInterfaces.a2();
		
		System.out.println("--------------------------------");
		
		
		
		FunInterfaces a2 = () -> {System.out.println("----This is lamuda Expressions---");};
		
		a2.a1();
		a2.m1();
		FunInterfaces.a2();
		
		System.out.println("--------------------------------");
		
		
		FunInterfaces a3 = ImplemntClasss :: ahaa;
		
		a3.a1();
		a3.m1();
		FunInterfaces.a2();
		
		System.out.println("--------------------------------");
		
		
		FunInterfaces a4 = System.out :: println;
		a4.a1();
		
	}

}
