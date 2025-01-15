package com.cisco.Consumer;

import java.util.function.Consumer;

public class Testinggg
{

	
	
	public static void main(String[] args)
	{
		
		Consumer ah = new Consumer()
		{

			@Override
			public void accept(Object t)
			{
				System.out.println(t);
				
			}
		};
		
		ah.accept("Birava");
		
		System.out.println("------------------------");
		
		
		Consumer ah1 = (name) -> {System.out.println(name);};
		
		ah1.accept("Lakshmi");
		
		System.out.println("------------------------");
		
		
		Consumer ah2 = Implementing :: m1;
		
		ah2.accept("Siva");
		
		System.out.println("------------------------");
		
		
		
	}

}
