package com.cisco.ByUsingUserDefinedOperatorsIntermediateAndTerminal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TerminalOperatorLogic1
{

	public static void main(String[] args)
	{
		
		Integer[] a = {1,1,1,2,3,3,4,5,6,4,4,5,5,6,8,8,9,9};
		
		
				List<Integer> data	= Arrays.asList(a);
				
														//Grouped: {1=[1], 2=[2, 2], 3=[3, 3, 3]}
															// Counting: {1=1, 2=2, 3=3}
														// Collecting the data  Grouping the data 
		Map<Integer, Long> gdata = data.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(gdata);
		
		
		System.out.println("--------- By Using The Integer ------------");
		
		
		String[] s1 = {"siva","Raj","Birava","Lokesh","Anji","siva"};
		
					List<String> dat1 =	Arrays.asList(s1);
					
					
	Map<String, Long> gdat = dat1.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
	
	System.out.println(gdat);
	
	
	System.out.println("--------- By Using The String ------------");
					
		
	}

}
