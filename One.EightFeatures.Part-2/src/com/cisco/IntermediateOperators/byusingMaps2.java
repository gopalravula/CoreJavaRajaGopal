package com.cisco.IntermediateOperators;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class byusingMaps2
{

	public static void main(String[] args)
	{
		
		Integer[]  a = {10,20,30,15,25,35,40,30,48};
		
				List<Integer> data	=	Arrays.asList(a);
		
				
		Consumer<Integer> c1 = new Consumer<Integer>()
		{
			
			@Override
			public void accept(Integer t)
			{
				System.out.println("This is Square="+t);
				
			}
		};
		
		
	Function<Integer, Integer> F1 = new Function<Integer, Integer>()
	{
		
		@Override
		public Integer apply(Integer t)
		{
			return t*t;
		}
	};
	
	
	Predicate<Integer> p1 = new Predicate<Integer>()
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
	
	
	//By using Anonymous way //
	
			data.stream() //Pipe line //
			.filter(p1) //Filter here it will be apply some Conditions predicate(test)//
			.map(F1) //it will square the value it means it take one and it will give return one  Function(apply) //
			.forEach(c1);  //It will itterate the data by consumer(accept) //
	
		System.out.println("-------------------------------");
		
		//By using lamuda Expressions  //
		Consumer<Integer> l1 = (x)->{System.out.println("Even Numbers ="+x);};
		
		Function<Integer, Integer> l2 = (y)->{return y*y;};
		
		Predicate<Integer> l3 = (z)->{if(z%2==0) return true; else return false;};
		
		
		
		
		
		// Lamuda  Expressions   way-1//
		
		data
		.stream() //Pipe line //
		.filter(l3) //By applying Conditions by using predicate(test). //
		.map(l2)  //By applying input and giving output by using Function(apply). //
		.forEach(l1);  // By appling  input but no return type Consumer(accept). //
		
		
		System.out.println("-------------------------------");

		
		
		
		
		// Lamuda  Expressions   way-2//
		data.stream()
		.filter((d)->{if(d%2==0) return true; else return false;})
		.map((f)->{return f*f;})
		.forEach((g)->{System.out.println("Even Numbers="+g);});
		
		
		System.out.println("-------------------------------");
		
		
		
		
		// Method References  //
		data.stream()
		.filter(MethodReferenceWay1 :: evennumber)
		.map( MethodReferenceWay1 :: squareAll)
		.forEach(MethodReferenceWay1:: getall);
		
		System.out.println("-------------------------------");
		
	}
}
