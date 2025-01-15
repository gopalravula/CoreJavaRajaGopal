package com.cisco.ByUsingUserDefinedOperatorsIntermediateAndTerminal;

import java.util.Arrays;
import java.util.List;

public class TestingEmployePojoIntermediateOperators2
{

	public static void main(String[] args)
	{
		
		
		EmployePojo e1 = new EmployePojo(1, "Birava", 23, 100.23, "se");
		EmployePojo e2 = new EmployePojo(2, "Siva", 24, 150.78, "dev");
		EmployePojo e3 = new EmployePojo(3, "Lakshmi", 25, 175.34, "aws");
		EmployePojo e4 = new EmployePojo(4, "Raju", 26, 450.56, "Testing");
		EmployePojo e5 = new EmployePojo(5, "Singh", 27, 420.56, "QA");
		EmployePojo e6 = new EmployePojo(6, "Devara", 28, 410.56, "DevOps");
		EmployePojo e7 = new EmployePojo(6, "Singh", 27, 420.56, "QA");
		EmployePojo e8 = new EmployePojo(6, "Devara", 28, 410.56, "DevOps");
		
		
		List<EmployePojo> data =	Arrays.asList(e1,e2,e3,e4,e5,e6,e7,e8);
		
		// We have to Overide Hashcode and Equal method in Employe Class  //
			data.stream().distinct().forEach((x)->{System.out.println(x);});
			
			System.out.println("-------Destint is Completed ------------");
			
			// Limit is used which One we want it will Come based on that number only. //
			data.stream().limit(5).forEach((x)->{System.out.println(x);});
			
			System.out.println("-------limit is Completed ------------");
			
			
			//We skip the data it will perform of skipping On it self.  //
			data.stream().skip(2).forEach((x)->{System.out.println(x);});
			
			System.out.println("-------skip  is Completed ------------");
			
			
			
			

	}

}
