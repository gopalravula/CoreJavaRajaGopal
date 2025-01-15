package com.cisco.ByUsingUserDefinedOperatorsIntermediateAndTerminal;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOperatorLogic2
{

	public static void main(String[] args)
	{
		
		EmployePojo e1 = new EmployePojo(1, "Birava", 27, 120.23, "se");
		EmployePojo e2 = new EmployePojo(2, "Siva", 26, 150.23, "dev");
		EmployePojo e3 = new EmployePojo(3, "Lakshmi", 25, 175.23, "DevOps");
		EmployePojo e4 = new EmployePojo(4, "Anji", 24, 200.23, "se");
		EmployePojo e5 = new EmployePojo(5, "Rohith", 23, 240.23, "dev");
		EmployePojo e6 = new EmployePojo(6, "Vijay", 22, 250.23, "DevOps");
		
		
		
		List<EmployePojo> data = Arrays.asList(e1,e2,e3,e4,e5,e6);
		
		
	Map<Object, Long>	gd =data
						.stream()
						.collect(Collectors.groupingBy((x)->{return x.getEdesg();}, Collectors.counting()));
	
	System.out.println(gd);
	
	System.out.println("------Counting Of Designiation Based-----------");
	
	
	
	
		Map<Object, Double> ddata1 =data
									.stream()
				.collect(Collectors.groupingBy((y)->{return y.getEdesg();}, Collectors.summingDouble((z)->{return z.getEsal();})));
	
		System.out.println(ddata1);
		
		System.out.println("-------- Counting Of Designiation Based Salary ----------");
		
		
		
		
		
		Map<Object, Optional<EmployePojo>>	ddata2	=	data
									.stream()
									.collect(Collectors.groupingBy((a)->{return a.getEdesg();} , Collectors.maxBy((x,y)->{return x.getEsal().compareTo(y.getEsal());})));

		System.out.println(ddata2);
		
		System.out.println("-------- Counting Of Designiation Based Salary Maximum ----------");
		
		
		
		
		
		
		Map<Object, Optional<EmployePojo>>	ddata3	=	data
				.stream()
				.collect(Collectors.groupingBy((a)->{return a.getEdesg();} , Collectors.minBy((x,y)->{return x.getEsal().compareTo(y.getEsal());})));

			System.out.println(ddata3);
			
			
			System.out.println("-------- Counting Of Designiation Based Salary Minimum ----------");
			
			
			
			
			
			Map<Object, DoubleSummaryStatistics>	ddata4	=	data
					.stream()
					.collect(Collectors.groupingBy((a)->{return a.getEdesg();} , Collectors.summarizingDouble((x)->{return x.getEsal();})));

			
						System.out.println(ddata4);
			
			
			System.out.println("-------- Counting Of Designiation Based Salary All Operations  ----------");
			
			
			
			
			
			
		
	}

}
