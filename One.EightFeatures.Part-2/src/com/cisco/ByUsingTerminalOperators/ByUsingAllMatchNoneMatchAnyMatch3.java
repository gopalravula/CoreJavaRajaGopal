package com.cisco.ByUsingTerminalOperators;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ByUsingAllMatchNoneMatchAnyMatch3
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
		
	
			
			Integer[] a = {4,6,8,10,12,14,16};
		
			List<Integer> data = Arrays.asList(a);
									
		// Any One should be match out of 10 1 can match.  //
			boolean flag1 =data.stream().anyMatch(an1);
			
			System.out.println("By using Anonymous Class anyMatch ="+flag1);
			
			// it should match 10 out of 10 can be Match.  //
			boolean flag2 =	data.stream().allMatch(an1);
			
			System.out.println("By using Anonymous Class All Match ="+flag2);
			
			// Out of 10  -  no one should match .  //
			boolean  flag3 = data.stream().noneMatch(an1);
			
			System.out.println("By using Anonymous Class None Match ="+flag3);
		
			
			System.out.println("---------------------------------------");
			
			
			
			
			
			Integer[] a1 = {1,3,5,7,9};
			
			List<Integer> data1 = Arrays.asList(a1);
					
			// Any One should be match out of 10 1 can match.  //
		boolean  test1 = data1.stream().anyMatch((x)->{if(x%2==0) return true; else return false;});

		System.out.println("By using Lamuda Expressions Class anyMatch ="+test1);
		
		
								// it should match 10 out of 10 can be Match.  //
		boolean test2 = data1.stream().allMatch((y)->{if(y%2==0) return true; else return false;});
		
		System.out.println("By using Lamuda Expressions Class allMatch ="+test2);
		
									// Out of 10  -  no one should match .  //
		boolean test3 = data1.stream().noneMatch((z)->{if(z%2==0) return true; else return false;});
		
		
		System.out.println("By using Lamuda Expressions Class noneMatch ="+test3);
		
		
		System.out.println("---------------------------------------");
		
		
		
		
		
		Integer[] a2 = {1,2,3,5,7,6,9};
		
		List<Integer> data2 = Arrays.asList(a2);
		
		
								// Any One should be match out of 10 1 can match.  //
			boolean accept1	=data2.stream().anyMatch(MethodReferenceWay1 :: evennumber);
			
			System.out.println("By using  Method Reference in anyMatch ="+accept1);
		
										// it should match 10 out of 10 can be Match.  //
			boolean accept2	= data2.stream().allMatch(MethodReferenceWay1 :: evennumber);
			
			
			System.out.println("By using  Method Reference in allMatch ="+accept2);
			
											// Out of 10  -  no one should match .  //
			boolean  accept3 = data2.stream().noneMatch(MethodReferenceWay1 :: evennumber);
		
		
			System.out.println("By using  Method Reference in noneMatch ="+accept3);
			
			
			System.out.println("---------------------------------------");
			
	}

}
