package com.cisco.TestTwo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/List")
public class CollectionListController
{
	
 //  http://localhost:8080/List/GetNames
	@RequestMapping("GetNames")
	public List<String>GetNames()
	{
		String a = "Bhirava";
		String b = "lakshmi";
		String c = "Shiva";
		
		List  s = new ArrayList<>();
		
		s.add(a);
		s.add(b);
		s.add(c);
		
		return s;
	}
	
	
	
  //  http://localhost:8080/List/GetIdes
	@RequestMapping("GetIdes")
	public List<Integer> GetIds()
	{
		
		Integer a =101;
		Integer b = 102;
		Integer c = 103;
		
		List s = new ArrayList<>();
		
		s.add(a);
		s.add(b);
		s.add(c);
		
		return s;
	}
	
	
  //   http://localhost:8080/List/Empdatas
	@RequestMapping("Empdatas")
	public List<EmployePojo> GetEmpdata()
	{
		
		EmployePojo e1 = new EmployePojo(1, "Birava", 67.78, "JavaDevloper");
		EmployePojo e2 = new EmployePojo(2, "Lokesh", 67.78, "SQlDevloper");
		EmployePojo e3 = new EmployePojo(3, "Devagiri", 78.89, "PythonDevloper");
		
		List s1 = new ArrayList<>();
		
		s1.add(e1);
		s1.add(e2);
		s1.add(e3);
		
		System.out.println(s1);
		return s1;
	}
	
}
