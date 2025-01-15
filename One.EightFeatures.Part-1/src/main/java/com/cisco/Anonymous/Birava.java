package com.cisco.Anonymous;

public class Birava {

	public static void main(String[] args) {
		
		//Anonymous Sub Class //
		//I am creating a sub Class for interface it"s name is 
			//Annonymous Class.
		I2 a = new I2() {
			
			@Override
			public void add(int a, int b) {
				
				System.out.println(a+b);
				
			}
		};
		
		a.add(2, 5);
		
		System.out.println(a);
		
		System.out.println("----------------------");
		
		I3 b = new I3() 
		{
			@Override
			public int mul(int a, int b) 
			{
				System.out.println("multiplication");
				return a*b;
			}
		};
			int s	= b.mul(6, 6);
			
			System.out.println(s);
			
			System.out.println(b);
			
			System.out.println("--------------------");
	}

}
