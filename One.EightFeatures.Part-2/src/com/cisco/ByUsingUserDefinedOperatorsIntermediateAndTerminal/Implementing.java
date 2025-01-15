package com.cisco.ByUsingUserDefinedOperatorsIntermediateAndTerminal;

public class Implementing
{

	public static  Double empsal(EmployePojo emp)
	{
		
		double sal ;
		
		sal = emp.getEsal()+1000.00;
		emp.setEsal(sal);
		return sal;
	}
	
	
	
	public static EmployePojo empdata(EmployePojo emp)
	{
		
		double sal;
		
		sal = emp.getEsal()+1000.00;
		emp.setEsal(sal);
		return emp;
	}
	
}
