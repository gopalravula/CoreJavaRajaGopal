package com.cisco.MethodReferencesss;

public class Testingg implements Faceingg{

	
	@Override
	public void Ename(String name) 
	{
	System.out.println(name+"------"+name.length());
		
	}
	public static void main(String[] args) 
	{
		//Normal way //
		Testingg a = new Testingg();
		
		a.Ename("Birava");
		
		System.out.println("-------------");
		
		//Anonymous Way //
		Faceingg a1 = new Faceingg()
		{
			
			@Override
			public void Ename(String name)
			{
			
				System.out.println(name+"------"+name.length());
				
			}
		};
		
		a1.Ename("Sivaa");
		
		System.out.println("-------------");
		
		//Lamuda Expressions //
		Faceingg a2 = (name) -> 
		{
			System.out.println(name+"------"+name.length());
		};
		
		a2.Ename("Lakshmi");
		
		System.out.println("-------------");

	}

	

}
