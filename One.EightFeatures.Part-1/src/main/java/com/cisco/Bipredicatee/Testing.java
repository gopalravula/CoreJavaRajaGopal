package com.cisco.Bipredicatee;


import java.util.function.BiPredicate;

public class Testing
{
	
	    public static void main(String[] args) 
	    {
	       
	    	BiPredicate<Integer, Integer> a1 = new BiPredicate<Integer, Integer>()
			{
				
				@Override
				public boolean test(Integer t, Integer u)
				{
					
					return (t+u)>10;
				}
			};
			
		boolean flag = a1.test(2, 9);
		System.out.println(flag);
		
		System.out.println("------------------------------------");
		
		BiPredicate<Integer, Integer> a2 = (Integer s,Integer t)->{return (s+t)>10;};
		
			boolean flag1	=a2.test(4, 8);
			System.out.println(flag1);
			
			System.out.println("------------------------------------");
			
		BiPredicate<Integer, Integer> a3 =implemnting :: Greaterthen;
		
		boolean flag2 = a3.test(2, 9);
		System.out.println(flag2);
		
		System.out.println("------------------------------------");
	    	
	    }
	}


