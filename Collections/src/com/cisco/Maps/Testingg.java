package com.cisco.Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Testingg {

	public static void main(String[] args) {
	
		
		Map<String, Integer> a = new HashMap<String, Integer>();
		
		a.put("Siva",101);
		a.put("Birava", 102);
		a.put("Lakshmi", 103);
		a.put("Mahesh", 104);
		a.put("Lokesh", 105);
		
		
		//--------This is way One------------//
		for(Entry<String, Integer> ah :a.entrySet())
		{
			//It is Getting Key and Values Both will be print //
			System.out.println(ah.getKey()+"------"+ah.getValue());
		}
		
		System.out.println("------------------------------------");
		
		
		//To get the key Set String will be Enough //
			for( String oh  :a.keySet())
			{
				//System.out.println(a.get(oh));
				System.out.println(oh);
			}
			
			
			System.out.println("------------------------------");

			
			//We want Only Values use like this //
			for(Integer ss :a.values())	
			{
				//Values are Printing //
				System.out.println(ss);
			}
								
	}

}
