package com.cisco.TreeMapss;
import java.util.Hashtable;
import java.util.Map.Entry;

public class p2_HashTable {

	/*
	 * public class Hashtable<K,V>
		extends Dictionary<K,V>
    		implements Map<K,V>, Cloneable, java.io.Serializable {
	 */
	public static void main(String[] args) {
		
		//it calls HashCode and Equals Method on key //
		//If we not @Overide it Calls from Object  Class hashcode And Equals Method //
		Hashtable<Employee, Integer> a = new Hashtable<Employee, Integer>();
		
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
