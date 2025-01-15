package com.cisco.IntermediateOperators;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class BysuingFilter1
{
	
	public static void main(String[] args)
	{
		
		Integer[] a = {10,20,5,30,40,20,56,19,15,33};
		
			List<Integer> data = Arrays.asList(a);
			
			
			
			// Anonymous Class //
			Predicate<Integer> an1 = new Predicate<Integer>()
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
			
			
			
			//Anonymous Class //
			Consumer<Integer> an2 = new Consumer<Integer>()
			{
				
				@Override
				public void accept(Integer t)
				{
					System.out.println("Even Numbers ="+t);
					
				}
			};
			
			// Lamuda Expressions //
			Predicate<Integer> l1 = (x)->{if(x%2==0) return true; else return false;};
			
			// Lamuda Expressions //
		Consumer<Integer> l2 = (a1)->{System.out.println("Even Numbers="+a1);};
			
			//Way 1 //
			data.stream()
			.filter(an1)
			.forEach(an2);
			
			System.out.println("------------------------");
			
			// way 2//
			data.stream()
			.filter(l1)
			.forEach(l2);
			
			System.out.println("------------------------");
			
			// Way 3 //
			data.stream() // pipe line it is a stream //
				.filter(MethodReferenceWay1 :: evennumber) //predicate for condition //
				.forEach(MethodReferenceWay1 ::getall); // Printing the Logic //
			
			System.out.println("------------------------");
		
	}

}
