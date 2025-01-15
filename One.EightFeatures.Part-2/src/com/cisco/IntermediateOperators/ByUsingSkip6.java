package com.cisco.IntermediateOperators;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ByUsingSkip6
{

	public static void main(String[] args)
	{
		
			Integer[] a = {10,20,30,40,50};
			
			List<Integer> data = Arrays.asList(a);
		
		Consumer<Integer> an1 = new Consumer<Integer>()
		{
			
			@Override
			public void accept(Integer t)
			{
				System.out.println(t);
				
			}
		};
		
					// By using Anonymous Class //
				data.stream().skip(2).forEach(an1);
				
				System.out.println("---By Using Anonymous Class---");
				
				data.stream().skip(2).forEach((x)->{System.out.println(x);});
				
				System.out.println("---By Using Lamuda Expressions----");
				
				data.stream().skip(2).forEach(System.out :: println);
				
				System.out.println("---- By using Method Referenecs-----");

	}

}
