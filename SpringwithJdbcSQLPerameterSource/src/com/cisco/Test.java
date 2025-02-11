package com.cisco;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    
    public static void main(String[] args)
    {
	
	ApplicationContext ap = new AnnotationConfigApplicationContext(OurConfigiration.class);
	
	
	Controller cc	= ap.getBean(Controller.class);
	
	//EmployePojo ee	= cc.save(new EmployePojo(7, "Devara", 94.45, "Net"));
	//System.out.println(ee);

	//cc.update(67.67, "Python", 7);
	
	//cc.delete(7);
	
	//cc.getbyId(1);

	//cc.getByName(5);
	
	cc.getAll();

}

}