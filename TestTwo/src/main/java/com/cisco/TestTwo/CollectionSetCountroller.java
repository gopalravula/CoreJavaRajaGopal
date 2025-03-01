package com.cisco.TestTwo;

import java.util.HashSet;
import java.util.Set;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Sets")
public class CollectionSetCountroller
{

	
 // http://localhost:8080/Sets/GetIdes
	@RequestMapping("GetIdes")
	public Set<Integer> GetIdes()
	{
		Integer a = 101;
		Integer b = 101;
		Integer c = 103;
		
		Set data = new HashSet<>();
		
		data.add(a);
		data.add(b);
		data.add(c);
		
		System.out.println(data);
		
		return data;
	}
	
	
	
	
 //  http://localhost:8080/Sets/GetNames
	@RequestMapping("GetNames")
	public Set<String> GetName()
	{
		String a = "Birava";
		String b = "Lakshmi";
		String c = "Lakshmi";
		
		Set data = new HashSet<>();
		
		data.add(a);
		data.add(b);
		data.add(c);
		
		System.out.println(data);
		
		return data;
	}
	
	
	
  //  http://localhost:8080/Sets/GetEmploye
	@RequestMapping("GetEmploye")
	public Set<EmployePojo> getemploye()
	{
		
		EmployePojo e1 = new EmployePojo(1, "Birava", 78.89, "JavaDevloper");
		EmployePojo e2 = new EmployePojo(1, "Birava", 78.89, "JavaDevloper");
		EmployePojo e3 = new EmployePojo(3, "Shiva", 67.78, "PythonDevloper");
		EmployePojo e4 = new EmployePojo(1, "Lakshman", 90.90, "SQLDevloper");
		
		
		Set data = new HashSet<>();
		
		data.add(e1);
		data.add(e2);
		data.add(e3);
		data.add(e4);
		
		System.out.println(data);
		
		return data;
		
		
	}
	
	
}
