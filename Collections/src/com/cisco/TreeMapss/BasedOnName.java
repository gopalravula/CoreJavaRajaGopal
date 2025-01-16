package com.cisco.TreeMapss;

import java.util.Comparator;

public class BasedOnName implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {

		String x = e1.getEname();
		String y = e2.getEname();
		
		return x.compareTo(y);
	}

}
