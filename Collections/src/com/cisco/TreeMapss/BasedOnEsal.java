package com.cisco.TreeMapss;

import java.util.Comparator;

public class BasedOnEsal implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) 
	{
	
		Double x = e1.getEsal();
		Double y = e2.getEsal();
		
		return x.compareTo(y);
	}

	

}
