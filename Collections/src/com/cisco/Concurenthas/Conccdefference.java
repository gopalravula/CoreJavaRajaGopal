package com.cisco.Concurenthas;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class Conccdefference {

	public static void main(String[] args) {
		
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("One", 1);
		map.put("Two", 2);
		map.put("Three", 3);
		
	Iterator<Entry<String, Integer>> data = map.entrySet().iterator();
		
	//Attem[pting by modifying while itterating //
	
	while(data.hasNext())
	{
		Entry<String, Integer>	enti = data.next();
		
		if(enti.getKey().equals("Two"))
		{
			map.put("four", 4);
		}
	}
	
	System.out.println(map);

	}

}
