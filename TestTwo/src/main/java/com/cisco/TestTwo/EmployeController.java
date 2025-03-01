package com.cisco.TestTwo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * -> @RestController is a Spring Boot annotation used in Java 
 * 	to create RESTful web services. It is a combination of two annotations:

	->@Controller – Marks the class as a Spring MVC controller.
	->@ResponseBody – Automatically converts the return values of methods to JSON or XML
	 	(based on request).
	 	
 	->@RestController ensures that the response is directly returned as JSON 
 		(or another format) without needing @ResponseBody on every method.
 		
	@RequestMapping
	->It can be applied at the class level (to set a base URL for all endpoints in the class).
	->It can be applied at the method level (to define specific request paths for each method).
	->It supports different HTTP methods (GET, POST, PUT, DELETE, etc.).
	->It can handle path variables, query parameters, and request headers.
 */
@RestController
@RequestMapping("/empc")
public class EmployeController
{
	
	//http://localhost:8080/empc/getName
	@RequestMapping("getName")
	public String getName()
	{
		System.out.println("The GetName");
		return "RajaGopal";
	}
	
	
	
	//http://localhost:8080/empc/getide
	@RequestMapping("getide")
	public Integer getId()
	{
		System.out.println("GetId");
		return 101;
	}
	
	
	//http://localhost:8080/empc/getSal
	@RequestMapping("getSal")
	public Double getSal()
	{
		System.out.println("Based On the salary");
		return 89.89;
	}
	
	
	//http://localhost:8080/empc/mstatus
	@RequestMapping("mstatus")
	public Boolean getMarriageStatus()
	{
		System.out.println("This is Marriage Status");
		return true;
	}
	
	
}
