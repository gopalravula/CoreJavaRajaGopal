package com.cisco;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	
	public static void main(String[] args) {
		
		
		ApplicationContext ap = new AnnotationConfigApplicationContext(GetConfiguration.class);
		
		
			Controller cc	=	ap.getBean(Controller.class);
			
			//cc.save(new EmployePojo(3, "Sivaa", 13.34, "DevOps"));
			
			//cc.update(50.50, "SQLDevloper", 2);
			
			//cc.delete(3);
			
			//cc.getbyName(2);
			
			//cc.getbySal(2);
			
			//cc.getCount();
			
			//cc.Empdata(1);
			
		//	cc.empdataway1();
			
			//cc.empdata2();
			
			cc.batchupdate();
	}
}
