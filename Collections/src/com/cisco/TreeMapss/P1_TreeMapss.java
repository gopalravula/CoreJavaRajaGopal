package com.cisco.TreeMapss;

import java.util.Map.Entry;
import java.util.TreeMap;

public class P1_TreeMapss {

	public static void main(String[] args) {
		
		//Treemap Put Method calls The ComapareTo Method //
		//We need to provide implementation for CompareTo() or Compare() Method. //
		TreeMap<Employee, Integer>  a = new TreeMap(new BasedOnName());

		a.put(new Employee(101, "Birava", 89.79, "java"),1001);
		a.put(new Employee(102, "Lakshmi", 78.79, "CDev"),1002);
		a.put(new Employee(105, "siva", 90.79, "PythonDev"),1005);
		a.put(new Employee(104, "Anji", 67.79, "SQL Dev"),1004);
		a.put(new Employee(103, "Bhanu", 60.79, "DevOps"),1003);
		
		
		for(Entry<Employee, Integer> ss: a.entrySet())
		{
			
			System.out.println(ss);
			
		}
		
		
	}
}
