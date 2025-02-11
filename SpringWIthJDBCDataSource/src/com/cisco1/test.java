package com.cisco1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {

	
	public static void main(String[] args) {
		
		
		ApplicationContext ap = new AnnotationConfigApplicationContext(OurConfiguration.class);
		
			Controller	ac =	ap.getBean(Controller.class);
			
			//System.out.println(ac);
			
			//ac.save(new EmployePojo(3, "Siva", 99.98,"Devops" ));
			
			//ac.update(20.21, "PythonDev", 1);
			
			//ac.delete(3);
			
		//	ac.getbyid(1);
			
			ac.getAll();
			
		
		
	}
}
