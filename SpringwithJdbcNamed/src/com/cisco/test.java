package com.cisco;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {

	public static void main(String[] args) {
	
		
		ApplicationContext ap = new AnnotationConfigApplicationContext(OurConfiguration.class);
		
			
		Controller cc	=	ap.getBean(Controller.class);
		
	//	EmployePojo ee =	cc.save(new EmployePojo(7, "Devaa", 89.90, "sql Devloper"));
		
		//System.out.println(ee);
		
		//cc.update(88.88, "AWS", 7);
		
		//cc.delete(7);
		
	//	cc.getbyid(1);
		
	//	System.out.println("----Data is Delted succefully----");
		
	//	cc.getbyName(3);
		
	List<EmployePojo> e=	cc.getAll();
	
		Iterator<EmployePojo >data = e.iterator();
		
		while(data.hasNext())
		{
			System.out.println(data.next());
		}
//	System.out.println(e);
	}

}
