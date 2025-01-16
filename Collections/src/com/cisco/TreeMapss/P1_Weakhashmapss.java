package com.cisco.TreeMapss;

import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.Map.Entry;

public class P1_Weakhashmapss {

	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(1, "Birava", 67.78, "se");
		Employee e2 = new Employee(2, "Laxmi", 88.78, "dev");
		Employee e3 = new Employee(3, "Siva", 56.78, "java");
		
		//One Object is Eligible for Garbage Collector and key is Not presenting //
		//WeakHashMap while itterating it will check whether key is present or not //
		//If it present Only it will give the associate Value Other wise it won"t get //
		//it is Always Checking if it key is present Or Not Check it in Heap Memory
						//and it will give the value.
		//You don"t have any reference i won"t give it Through the end user get Out //
		//it will remove the key //
		//i want Strong refrence only it will give the data //
		//name it self it is veryStrong whether it is Object is Present Or not //
		//before itterating keep it Gc //
		WeakHashMap<Employee, Integer> a = new WeakHashMap<Employee, Integer>();
		
		a.put(e1, 101);
		a.put(e2, 102);
		a.put(e3, 103);
		
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
