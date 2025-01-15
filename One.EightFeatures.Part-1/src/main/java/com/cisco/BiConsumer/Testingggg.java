package com.cisco.BiConsumer;

import java.util.function.BiConsumer;

public class Testingggg
{

	public static void main(String[] args)
	{
		
	
		BiConsumer<Integer, Integer> a = new BiConsumer<Integer, Integer>()
		{
			
			@Override
			public void accept(Integer t, Integer u)
			{
				System.out.println(t+u);
				
			}
		};
		
		a.accept(20, 30);
		
		System.out.println("------------");
		
		
		BiConsumer<Integer, Integer> a1 = (s,t) -> {System.out.println(s+t);};
		
		a1.accept(40,50);
		
		System.out.println("------------");
		 
		
		BiConsumer<Integer, Integer> a2 = implementing :: m1;
		
		a1.accept(70, 30);
		
		System.out.println("------------");
		

	}

}
