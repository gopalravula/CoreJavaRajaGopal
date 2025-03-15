package com.StartSpring.TestOne;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// We can send the data from the header it will give info to the body. //
// Bean is created from the controller //
// Abulity to take request from the Browser. //
// It is the Capabulity of taking Request from the browser. //
@RestController
public class Controller 
{
	@GetMapping("name")
	public String getName()
	{
		System.out.println("I am controller on get Name");
		return "slokam Technology pvt ltd";
	}
	
	
	@GetMapping("nameone")
	public String getNameone()
	{
		System.out.println("I am controller on get NameOne ");
		return "sr nagar hydrabad";
	}
	
	
	@GetMapping("Employe")
	public EmployePojo Empdata()
	{
		System.out.println(" This is Employe Pojo ");
		return new EmployePojo(1, "Siva", 67.78, "javaDevloper");
	}
	
	
	
}
