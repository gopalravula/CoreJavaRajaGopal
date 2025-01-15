package com.cisco.BiConsumer;

import java.util.function.Consumer;

public class TestingOnee
{

	public static void main(String[] args)
	{
		
		Consumer<Integer> a1 = new Consumer<Integer>()
		{
			
			@Override
			public void accept(Integer t)
			{
				System.out.println(t);
				
			}
		};
		
		a1.accept(30);
		
		System.out.println("-----------------------");
		
		
		Consumer<Integer> a2 = (a) -> {System.out.println(a);};
		
		a2.accept(40);
		
		System.out.println("-----------------------");
		
		Consumer<Integer> a3 = implementing :: m1;
		
		a3.accept(50);
		
		System.out.println("-----------------------");
		

	}

}
