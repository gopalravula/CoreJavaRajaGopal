package com.cisco.IntermediateOperators;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ByUsingSorting3
{

	public static void main(String[] args)
	{
		
		Integer[]  a = {2,4,3,1,6,10,9,4,8,12};
		
		List<Integer>  data =	Arrays.asList(a);
		
		
		// Anonymous Class By using //
		Consumer<Integer>  an1 = new Consumer<Integer>()
		{
			
			@Override
			public void accept(Integer t)
			{
				System.out.println("Order and Even Numbers="+t);
				
			}
		};
		
		
		// Anonymous Class By using //
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
		
		// Anonymous Class By using //
		Function<Integer, Integer>	 an3 = new Function<Integer, Integer>()
		{
			
			@Override
			public Integer apply(Integer t)
			{
				
				return t*t;
			}
		};
		
		
		// Anonymous Class By using //
		Comparator<Integer> an4 = new Comparator<Integer>()
		{
			
			@Override
			public int compare(Integer e1, Integer e2)
			{
				// TODO Auto-generated method stub
				return -e1.compareTo(e2);
			}
		};
		
		
		
		data
		.stream()  // it is a pipe line //
		.filter(an2)  //it is applining the condition predicate (test) .//
		.map(an3) // it is used to give input and take return type Function(apply). ///
		.sorted(an4) // It is used to bring in sorted Order it will call Comparator . //
		.forEach(an1); // it is tking the input but no return type Consumer(Accept) .  //
		
		System.out.println("--------------------------");
		
		
		// By using Lamuda Expressions  //
		data
		.stream()
		.filter((x)->{if(x%2==0) return true; else return false;})
		.map((y)->{return y*y;})
		.sorted()
		.forEach((z)->{System.out.println("Order Comming and Number="+z);});
		
		
		System.out.println("--------------------------");
		
		
		//  By using Method Reference Only //
		data
		.stream()
		.filter(MethodReferenceWay1 :: evennumber)
		.map(MethodReferenceWay1 :: squareAll)
		.sorted()
		.forEach(MethodReferenceWay1 :: getall);
		
		
		System.out.println("--------------------------");
		
		

	}

}
