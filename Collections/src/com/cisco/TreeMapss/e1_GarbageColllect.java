package com.cisco.TreeMapss;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class e1_GarbageColllect {

	
	public static void main(String[] args) {
		
		
		Employee e1 = new Employee(1, "Birava", 67.78, "se");
		Employee e2 = new Employee(2, "Laxmi", 88.78, "dev");
		Employee e3 = new Employee(3, "Siva", 56.78, "java");
		
		
		HashMap<Employee, Integer> a = new HashMap<Employee, Integer>();
		
		a.put(e1, 101);
		a.put(e2, 102);
		a.put(e3, 103);
		
		//Here it is Eligible for Garbage Collector also it is itterating the data.//
		//here eligible also getting the data. //
		//Here it is Eligible for key is null also it is itterating the data //
		//What itteratior is not Checking if the Key is eligible Or not //
		//SomeThing it is not there but is is Showingg //
		//Whether this key is present or not befor itterating we have to Check //
		//This is Problem to resolve it Weakhashmap is Came //
		
		System.out.println("Object is making for the garbage Collector");
		
		e1=e2;
		
		System.gc();
		
		
		Iterator<Entry<Employee, Integer>> ss = a.entrySet().iterator();
		
		while(ss.hasNext())
		{
			
			System.out.println(ss.next());
		}
		
		
		System.out.println("---------------------------");
		
		
	}
}
