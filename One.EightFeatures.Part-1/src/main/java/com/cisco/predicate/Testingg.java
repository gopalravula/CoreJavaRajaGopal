package com.cisco.predicate;

import java.util.function.Predicate;

public class Testingg
{

	public static void main(String[] args)
	{	//Anonymous Class //
		Predicate<Integer> a1 = new Predicate<Integer>()
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
		
		//Lamuda Expressions //
		boolean flag =a1.test(20);
		System.out.println(flag);
		System.out.println("-------------------");
		
		
			Predicate<Integer> a2 = (Integer s)->
			{
				if(s%2==0)
					return true;
				else
					return false;
			};
			
		boolean flag1 =	a2.test(20);
		System.out.println(flag1);
		
		System.out.println("-------------------");
		
		// Method References //
		Predicate<Integer> a3 = Implementing :: add;
		
		boolean flag3 =a3.test(20);
		System.out.println(flag3);
		
		System.out.println("-------------------");
	}

}
