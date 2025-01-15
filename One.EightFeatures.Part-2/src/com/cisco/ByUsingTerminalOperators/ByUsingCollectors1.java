package com.cisco.ByUsingTerminalOperators;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ByUsingCollectors1
{
	
	/* 
	 * Intermediate :- Filter, Map, Sort, Distint, limit, Skip, Peek, Flatmap.
	 * Terminal Method :- 
	 * 	i)ForEach();
	 * 	ii)Collect
	 * 	iii)Count
	 * 	iv)AnyMatch(Predicate)
	 * 	v)AllMatch(Predicate)
	 * 	vi)NoneMatch(Predicate)
	 * 	vii)FindFirst()
	 * 	viii)FindAny()
	 * 	ix) Max(Comparator)
	 * 	X)Min(Comparator)
	 * 
	 */
	
	
	public static void main(String[] args)
	{
		
		Integer[] a = {12,15,14,2,4,64,8,10,12};
		
			List<Integer> data = Arrays.asList(a);
		
		Consumer<Integer> an1 = new Consumer<Integer>()
		{
			
			@Override
			public void accept(Integer t)
			{
				System.out.println("This is Order and even="+t);
			}
		};
		
		
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
		
		
		Function<Integer, Integer> an3 = new Function<Integer, Integer>()
		{
			
			@Override
			public Integer apply(Integer t)
			{
				
				return t*t;
			}
		};
		
		
		//                    pipeline    remove duplicate applying cond  squaring the value Ascending Order  Bring it in lists .
		 List<Integer>  dat1 = data.stream().distinct().filter(an2).map(an3).sorted().collect(Collectors.toList());
		 
		 System.out.println("The data is ="+dat1);
		
		System.out.println("--------------------------------");
		
		
		
		// Using normal day //
		List<Integer> dat = data.stream().collect(Collectors.toList());
		
		System.out.println("The data is ="+dat);
		
		System.out.println("--------------------------------");
		
		
		
		// By using lamuda Expressions //
		List<Integer>  dat2	 =	data.stream()
						.distinct()
						.filter((x)->{if(x%2==0) return true; else return false;})
						.map((y)->{return y*y;})
						.sorted()
						.collect(Collectors.toList());
		
		System.out.println("The data is="+dat2);
		
		System.out.println("--------------------------------");
		
		
		
		// By using method References //
		
		List<Integer> dat3   =  data
							.stream()
							.distinct()
							.filter(MethodReferenceWay1 :: evennumber)
							.map(MethodReferenceWay1 :: squareAll)
							.sorted()
							.collect(Collectors.toList());
		
		
		System.out.println("The all data is ="+dat3);
		
		System.out.println("--------------------------------");
	}

}
