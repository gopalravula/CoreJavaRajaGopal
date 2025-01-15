package com.cisco.ByUsingUserDefinedOperatorsIntermediateAndTerminal;

import java.util.Arrays;
import java.util.List;

public class TestingEmployePojoIntermediateOperators1
{

	public static void main(String[] args)
	{
		
		EmployePojo e1 = new EmployePojo(1, "Birava", 23, 100.23, "se");
		EmployePojo e2 = new EmployePojo(2, "Siva", 24, 150.78, "dev");
		EmployePojo e3 = new EmployePojo(3, "Lakshmi", 25, 175.34, "aws");
		EmployePojo e4 = new EmployePojo(4, "Raju", 26, 450.56, "Testing");
		EmployePojo e5 = new EmployePojo(5, "Singh", 27, 420.56, "QA");
		EmployePojo e6 = new EmployePojo(6, "Devara", 28, 410.56, "DevOps");
		
		
		
		List<EmployePojo> data = Arrays.asList(e1,e2,e3,e4,e5,e6);
		
				
					data
					.stream()
					.filter
					(
							(emp)->{
								if(emp.getEsal()>= 400)
								return true;
							else
								return false;
								})
					
					.map
					(
							(emp)->{
									double esall = emp.getEsal()+1000.00; // here addes 1000.  //
										emp.setEsal(esall); // Here setting value is passed to here. //
										return emp;  // Return ing the employe Object. //
								})
					.forEach((emp)->{System.out.println(emp);});
		
					
			System.out.println("-----This is Upto Lamuda Expressions-----");
			
			
			
								data.stream().filter((emp)->{if(emp.getEsal()>=400) return true; else return false;}) // Filtering //
								.map(Implementing :: empdata)  // By Taking input and giving OutPut. //
								.sorted((emp1, emp2)->{return emp1.getEsal().compareTo(emp2.getEsal());}) // Comapring Two Employe salarys.//
								.forEach((x)->{System.out.println(x);}); // Itterating the data. //
								
								
		System.out.println("-----This is Upto Method References Expressions-----");
		
		
	}

}
