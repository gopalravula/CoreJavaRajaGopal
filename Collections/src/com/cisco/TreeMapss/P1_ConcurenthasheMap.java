package com.cisco.TreeMapss;

import java.util.concurrent.ConcurrentHashMap;

public class P1_ConcurenthasheMap {

	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(1, "Birava", 67.78, "se");
		Employee e2 = new Employee(2, "Laxmi", 88.78, "dev");
		Employee e3 = new Employee(3, "Siva", 56.78, "java");
		
		
		ConcurrentHashMap<Employee, Integer> a = new ConcurrentHashMap<Employee, Integer>();
		
		
		a.put(e1, 101);
		a.put(e2, 102);
		a.put(e2, 103);

		
		System.out.println(a);
		
	}
}
