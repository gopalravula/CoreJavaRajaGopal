package com.cisco.ByUsingUserDefinedOperatorsIntermediateAndTerminal;

import java.util.Arrays;
import java.util.List;

public class TestingEmployePojoIntermediateOperators3
{

	public static void main(String[] args)
	{
		
				List<Integer> l1 =	Arrays.asList(1,2,3,4,5);
				List<Integer> l2 =	Arrays.asList(6,7,8,9,10,12);
				List<Integer> l3 =	Arrays.asList(11,12,13,14,15,16);
			
			
			List<List<Integer>>  data = Arrays.asList(l1,l2,l3);
			
			
		data.stream().flatMap(List :: stream).distinct().forEach((x)->{System.out.println(x);});
		
		System.out.println("-----------By Using Flat Map -------------");

	}

}
