package com.cisco.DoubleConsumers;

import java.util.function.DoubleConsumer;

public class TesingDoublee
{
	
	public static void main(String[] args)
	{
		
		DoubleConsumer a1 = new DoubleConsumer()
		{
			
			@Override
			public void accept(double value)
			{
				System.out.println(value);
				
			}
		};
		
		a1.accept(34.45);
		
		System.out.println("-------------------------");
		
		
		DoubleConsumer a2 = (a) -> {System.out.println(a);};
		
		a2.accept(56.67);
		
		System.out.println("--------------------------");
		
		DoubleConsumer a3 = Implementing :: m1;
		
		a3.accept(90.90);
		
		System.out.println("----------------------------");
		
		
	}

}
