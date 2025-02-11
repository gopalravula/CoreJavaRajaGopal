package com.cisco;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Testing
{

    public static void main(String[] args)
    {
	ApplicationContext ap = new AnnotationConfigApplicationContext(OurConfiguration.class);
	
	controller cc = ap.getBean(controller.class);
	
	cc.getbyid(2);
	
	System.out.println("The data is Executed succefully . ");

    }

}
