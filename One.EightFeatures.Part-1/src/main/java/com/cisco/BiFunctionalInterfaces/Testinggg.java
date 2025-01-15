package com.cisco.BiFunctionalInterfaces;

import java.util.function.BiFunction;

public class Testinggg
{

	public static void main(String[] args)
	{
		
		
		BiFunction<String, String, String>  a1 = new BiFunction<String, String, String>()
		{
			
			@Override
			public String apply(String t, String u)
			{
					return t+u+"@gmail.com";
			}
		};
		
				String aa =a1.apply("Ram", "lucky");
				System.out.println(aa);
				
				System.out.println("-------------------");
				
				
				
		BiFunction<String, String, String> a2 = (s,t) ->{return s+t+"@gmail.com";};
		
				String bb = a2.apply("Siva", "Kumar");
				System.out.println(bb);
				
				System.out.println("-------------------");
				
		BiFunction<String, String, String> a3 = Implementingg :: getgmail;
		
		String cc = a3.apply("Lakshmi","Parvathi");
				
		System.out.println(cc);
		
		System.out.println("---------------------------");
		
	}

}
