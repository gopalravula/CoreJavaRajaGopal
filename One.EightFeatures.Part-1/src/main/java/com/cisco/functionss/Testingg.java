package com.cisco.functionss;

import java.util.function.Function;

public class Testingg
{

	
	public static void main(String[] args)
	{
		
		//Anonymous Classes //
		Function<String, Integer> a1 = new Function<String, Integer>()
		{
			
			@Override
			public Integer apply(String t)
			{
				return t.length();
			}
		};
		
		
			int  aa=a1.apply("Siva Kumar");
			System.out.println(aa);
			
			System.out.println("--------------------------------");
		
		
			//Lamuda Expressions //
			Function<String, Integer> a2 = (name)->{return name.length();};
				
				int bb = a2.apply("Biravaaa");
				
				System.out.println(bb);
				System.out.println("--------------------------------");
				
			// MEthod Reference //
			Function<String, Integer> a3 = implementing :: nameGetValue;
			
			 int cc= a3.apply("Lakshmii");
			 System.out.println(cc);
			 
			 System.out.println("--------------------------------");
		
		
		
		
	}

		


		
		
	
	
}
