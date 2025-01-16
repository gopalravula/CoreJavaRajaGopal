package com.cisco.Concurenthas;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SynHahMa {

	public static void main(String[] args) {


		//Synchronized Method in the Collection Class //
		
		Map<String, String> map1 = new HashMap<String, String>();
		
		map1.put("1","Birava");
		map1.put("2", "SIva");
		map1.put("3", "Lakshmi");
		
		//Creating a Synchronized Map //
		
		/* Q1:-Can Multiple thread write in the same Segment ?
		 * Ans :- No.Thread acquires a lock on segment in put() operation and at a time only
		 * 			one thread can write in the segment .
		 * 
		 * Q2:-Can two threads write in the different segments ?.
		 * Ans :- Yes,Two threads are allowed to write concurrently in different segments.
		 * 
		 * Q3:- Can Multiple thread read from the same segment ?
		 * Ans :- yes,Thread doesn"t acquire a lock on segment in get()
		 * 			operation and any number of threads can read from the same segment.
		 * 
		 * Q4:- If one thread is waiting in a segment, can another thread read from the segment?
		 * Ans :- Yes,but in this case last updated value will be seen by reading thread.
		 * 
		 * 
		 * Q5:- Null keys and null values ?
		 * Ans :- Concurent hashmap is doesn"t allow null keys and null values.
		 * 
		 */
			Map<String, String> Sync = Collections.synchronizedMap(map1);
			
			System.out.println(Sync);
			
			
			//Concurent HashMap //
			
			ConcurrentHashMap<String, String> daa = new ConcurrentHashMap<String, String>();
			
			daa.put("A", "java");
			daa.put("B", "Python");
			daa.put("C", "Ruby");
			
			System.out.println(daa);
			System.out.println(daa.get("A"));
			
			
			
	}

}
