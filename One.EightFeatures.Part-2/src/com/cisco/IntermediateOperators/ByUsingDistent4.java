package com.cisco.IntermediateOperators;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ByUsingDistent4
{
	
	public static void main(String[] args)
	{
		
			Integer[] a = {12,10,8,6,4,20,16,14};
			
			List<Integer> data = Arrays.asList(a);
			
			//Anonymous way -1 //
			Consumer<Integer> an1 = new Consumer<Integer>()
			{
				
				@Override
				public void accept(Integer t)
				{
					System.out.println("Even numbers and Multiplaying="+t);
				}
			};
			
			
			//Anonymous way -2 //
			Predicate<Integer> an2 = new Predicate<Integer>()
			{
				
				@Override
				public boolean test(Integer t)
				{
					if(t%2==0)
						return true;
					else
						return false;
				}
			};
			
		
			//Anonymous way -3 //
			Function<Integer, Integer> an3 = new Function<Integer, Integer>()
			{
				
				@Override
				public Integer apply(Integer t)
				{
					
					return t*t;
				}
			};
			
			
			// by using anonymous  Way //
			data
			.stream()  // Pipeline //
			.distinct()  // Remove the duplicate data //
			.filter(an2)  // Applying the  take input no return type.  boolean Condition by  predicate(test) . //
			.map(an3)   // Applying the take input and give ouput by using  Function(apply). //
			.sorted()     // it will be print in the Sorted order it means Ascending Order Only . //
			.forEach(an1); // Appling the take input and no return type by using Consumer(Accept). //
			
			
			System.out.println("---------------------------------------------");
		
		
			// By using Lamuda Expressions.  //
			data
			.stream()
			.distinct()
			.filter((x)->{if(x%2==0) return true; else return false;})
			.map((y)->{return y*y;})
			.sorted()     // it will be print in the Sorted order it means Ascending Order Only . //
			.forEach((z)->{System.out.println("Even and Square numbers are ="+z);});
			
			
			System.out.println("---------------------------------------------");
			
			
			
			// By using Method Reference Is this Way //
			data
			.stream()
			.distinct()
			.filter(MethodReferenceWay1 :: evennumber)
			.map(MethodReferenceWay1 ::squareAll)
			.sorted()
			.forEach( MethodReferenceWay1::getall);
			
			System.out.println("---------------------------------------------");
			
		
	}

}
