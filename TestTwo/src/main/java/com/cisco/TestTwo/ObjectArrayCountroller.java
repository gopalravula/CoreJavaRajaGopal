package com.cisco.TestTwo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ObjectArray")
public class ObjectArrayCountroller
{
	
	
 //  http://localhost:8080/ObjectArray/GetNames
	@RequestMapping("GetNames")
	public Object[] getNames()
	{
		Object[] s = {101,"Birava","Singaaa",34.45};
		System.out.println("----This is Object Array Class ----");
		return s;
	}
	
	
	
 //    http://localhost:8080/ObjectArray/UserDefObject
	@RequestMapping("UserDefObject")
	public Object[] Prede()
	{
		EmployePojo e = new EmployePojo();
		e.setEid(1);
		e.setEname("Birava");
		e.setEsal(45.67);
		e.setEdesg("JavaDevloper");
		
		EmployePojo e1 = new EmployePojo();
		e1.setEid(2);
		e1.setEname("Shiva");
		e1.setEsal(67.89);
		e1.setEdesg("PythonDevloper");
		
		EmployePojo e2 = new EmployePojo();
		e2.setEid(3);
		e2.setEname("Lakshmi");
		e2.setEsal(67.78);
		e2.setEdesg("SQlDevloper");
		
		Object[] a = {e,e1,e2};
		System.out.println(a);
		
		return a;
	}

}
