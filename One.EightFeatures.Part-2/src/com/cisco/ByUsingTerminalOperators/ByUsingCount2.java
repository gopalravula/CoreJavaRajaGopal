package com.cisco.ByUsingTerminalOperators;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ByUsingCount2
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
	
			Integer[]  a = {10,20,30,25,15,14,12,10};
		
			List<Integer> data = Arrays.asList(a);
			
		
			Consumer<Integer> an1 = new Consumer<Integer>()
			{
				
				@Override
				public void accept(Integer t)
				{
					System.out.println("The Even numbers="+t);
					
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
			
			
			System.out.println("---By using Anonymous Class (Count Operation) ---");
			
		Long Count =data
					.stream()  // pipeline //
					.filter(an2) //Applying the condition boolean predicate(test). //
					.map(an3)   // Applying input and take output it is Function(apply).  //
					.distinct()  // it will not allow the duplicate data. //
					.sorted()  // it bring in the sorting Order Only . //
					.count();   // it will bring the count of all it is terminal Operator.  //
		
		System.out.println(Count);
		
		System.out.println("------------------");
		
		
		System.out.println("---- By Using Lamuda Expressions (Count Operation) ----");
		
				Long Cdata = data
						.stream()
						.distinct()
						.filter((x)->{if(x%2==0) return true; else return false;})
						.map((y)->{return y*y;})
						.sorted()
						.count();
						
				
				System.out.println(Cdata);
				
				System.out.println("------------------");
				
				System.out.println("---- By Using Method Referenecs (Count Operation)  -----");
				
			Long  Cdata1 = data
						.stream()
						.distinct()
						.filter( MethodReferenceWay1::evennumber)
						.map(MethodReferenceWay1 ::squareAll)
						.sorted()
						.count();
			

			System.out.println(Cdata1);
			
			System.out.println("------------------");
			

	}

}
