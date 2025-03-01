package com.cisco.TestTwo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/MapCountroller")
public class CollectionMapCountroller
{
	
	
	// http://localhost:8080/MapCountroller/Details
	@RequestMapping("Details")
	public Map<String, Integer> getDetails()
	{
		
		Map<String, Integer> a = new HashMap<>();
		
		a.put("Birava", 101);
		a.put("Lakshmi", 102);
		a.put("Shiva", 103);
		
		System.out.println(a);
		return a;	
	}
	
	
	
 //  	http://localhost:8080/MapCountroller/Empdata
	@RequestMapping("Empdata")
	public Map<EmployePojo, Integer> getemp()
	{
		
		EmployePojo e1 = new EmployePojo(1, "Birava", 90.90, "JavaDevloper");
		EmployePojo e2 = new EmployePojo(2, "Lakshmi", 90.90,"PythonDevloper");
		EmployePojo e3 = new EmployePojo(3, "Shiva", 90.90, "SQLDevloper");
		
		Map<EmployePojo, Integer> data = new HashMap<>();
		
		data.put(e1, 101);
		data.put(e2, 102);
		data.put(e3, 103);
		
		System.out.println(data);
		
		return data;
	}
	
	
	
 //  	http://localhost:8080/MapCountroller/Employedeportment
	@RequestMapping("Employedeportment")
	public Map<EmployePojo, DeportmentPojo> Getdeportment()
	{
		
		EmployePojo e1 = new EmployePojo(1, "Birava", 67.78, "JavaDevloper");
		EmployePojo e2 = new EmployePojo(2, "Lakshmi", 90.90,"SQLDevloper");
		EmployePojo e3 = new EmployePojo(3, "Lakshmi", 89.89, "PythonDevloper");
		
		
		DeportmentPojo d1 = new DeportmentPojo(101, "IT", "Sed");
		DeportmentPojo d2 = new DeportmentPojo(102, "NON-IT", "hyd");
		DeportmentPojo d3 = new DeportmentPojo(103, "Technical", "kbd");
		
		
		Map<EmployePojo, DeportmentPojo> dep = new HashMap<>();
		
		
		dep.put(e1, d1);
		dep.put(e2, d2);
		dep.put(e3, d3);
		
		System.out.println(dep);
		
		return dep;
		
	}

}
