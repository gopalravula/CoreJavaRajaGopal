package com.cisco.ByUsingTerminalOperators;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ByUsingMaxAndMin4
{
	
	/* 
	 * Intermediate :- Filter, Map, Sort, Distint, limit, Skip, Peek, Flatmap.
	 * Terminal Method :- 
	 * 	i)ForEach();
	 * 	ii)Collect.
	 * 	iii)Count.
	 * 	iv)AnyMatch(Predicate).
	 * 	v)AllMatch(Predicate).
	 * 	vi)NoneMatch(Predicate).
	 * 	vii)FindFirst().
	 * 	viii)FindAny().
	 * 	ix) Max(Comparator).
	 * 	X)Min(Comparator).
	 * 
	 */

	public static void main(String[] args)
	{
	
		
		Integer[]  a = {10,20,30,40,50,60,70,80,90};
		
		List<Integer> data	= Arrays.asList(a);
		
		
		// Anonymous Class //
		Comparator<Integer> ann1 = new Comparator<Integer>()
		{
			
			@Override
			public int compare(Integer e1, Integer e2)
			{
				// TODO Auto-generated method stub
				return e1.compareTo(e2);
			}
		};
		
		// Anonymous Class //
		Optional<Integer> an1 = data.stream().max(ann1);
		
		System.out.println("This is Anonymous Class By Maximum Value = "+an1.get());
		
		
		// By Using Lamuda Expressions //
		Optional<Integer> an2 = data.stream().max((x,y)->{return x.compareTo(y);});
		
		
		System.out.println("This is Lamuda Expressions Class By Maximum Value = "+an2.get());
		
		
			// By using Method Reference //
			Optional<Integer> an3 = data.stream().max(Integer :: compareTo);
			
			
			System.out.println("This is  Method Reference  Class By Maximum Value = "+an3.get());
			
			
			
			System.out.println("-------------------------------------------------------------");
			
			
			
			
			Integer[]  a1 = {10,20,30,40,50,60,70,80,90};
			
			List<Integer> data1	= Arrays.asList(a1);
			
			
			Comparator<Integer> bn1 = new Comparator<Integer>()
			{
				
				@Override
				public int compare(Integer e1, Integer e2)
				{
					return e1.compareTo(e2);
				}
			};
			
			
			// Anonymous Class //
			Optional<Integer> brr1 = data1.stream().min(bn1);
			
			System.out.println("This is Anonymous Class By using Minimum Value = "+brr1.get());
			
			
			// By using Lamuda Expressions  //
			Optional<Integer>  brr2 = data1.stream().min((c,d)->{return c.compareTo(d);});
			
			System.out.println("This is Lamuda Expressions Class By using Minimum Value = "+brr2.get());
			
			
			// By Using Method Reference  //
			
			  Optional<Integer> brr3 = data1.stream().min(Integer :: compareTo);
			  
			  
			  System.out.println("This is Method Reference Class By using Minimum Value = "+brr3.get());
			  
			  
			
			  System.out.println("-------------------------------------------------------------");	

	}

}
