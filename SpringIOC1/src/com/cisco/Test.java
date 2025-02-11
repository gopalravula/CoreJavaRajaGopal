package com.cisco;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		
		ApplicationContext ap = new AnnotationConfigApplicationContext(ourConfiguration.class);
		
			Manager men	=ap.getBean(Manager.class);
			men.dowork();
		
			//Teamlead tl = ap.getBean(Teamlead.class);
			// tl.dowork();
		
			//Devloper dev = ap.getBean(Devloper.class);
			//dev.dowork();
			  
			System.out.println("---------------------");
			  
			  
			//String a = ap.getBean(String.class);
			//System.out.println(a);
		
		// By using Type Casting and passing the method Name it self . //
			String way1	= (String) ap.getBean("name");
			
			System.out.println(way1);
			
			
			String way2	= (String) ap.getBean("nameone");
			
			System.out.println(way2);
			
			
			System.out.println("---------------------");
			
			List<String> Arr1 = (List<String>) ap.getBean("One");
			
			System.out.println(Arr1);
			  
			List<String> Arr2 = (List<String>) ap.getBean("two");
			
			System.out.println(Arr2);
			
			System.out.println("---------------------");
				
	}

}
