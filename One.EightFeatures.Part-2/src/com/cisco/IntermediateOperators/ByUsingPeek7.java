package com.cisco.IntermediateOperators;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ByUsingPeek7
{

	public static void main(String[] args)
	{
		
		Consumer<Integer> an1 = new Consumer<Integer>()
		{
			
			@Override
			public void accept(Integer t)
			{
				System.out.println(t);
				
			}
		};
		
		
		Predicate<Integer> an2 = new Predicate<Integer>()
		{
			
			@Override
			public boolean test(Integer t1)
			{
				if(t1%2==0)
					return true;
				else
					return false;
			}
		};
		
		
		Function<Integer, Integer> an3 = new Function<Integer, Integer>()
		{
			
			@Override
			public Integer apply(Integer t)
			{
				// TODO Auto-generated method stub
				return t*t;
			}
		};
		
		
			Integer[]  a = {1,2,3,4,5,6};
				
			List<Integer> data = Arrays.asList(a);
			
			
					data
					.stream()  // Pipe line //
					.peek((x)->{System.out.println("Original data ="+x);})  // Original data //
					.filter((y)->{if(y%2==0) return true; else return false;})  //After filtering //
					.peek((z)->{System.out.println("After Devided="+z);}) //Filtering data //
					.forEach((s)->{System.out.println("For Each ="+s);});  // it is printing //
		
	}

}
