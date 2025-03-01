package com.cisco.TestTwo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ObjectCount")
public class ObjectController
{

	//  http://localhost:8080/ObjectCount/getName
	@RequestMapping("getName")
	public Object getName()
	{
		System.out.println("Object Class Name");
		Object a = "RajaGopal";
		return a;
	}
	
	
	//   http://localhost:8080/ObjectCount/GetIde
	@RequestMapping("GetIde")
	public Object getId()
	{
		System.out.println("This is Object Class id");
		Object b = 12;
		return b;
	}
	
	
	
	//    http://localhost:8080/ObjectCount/GetMarks
	@RequestMapping("GetMarks")
	public Object getMarks()
	{
		System.out.println("this is Object Class marks ");
		Object c = 34.45;
		return c;
	}
	
	
	
	//  http://localhost:8080/ObjectCount/Empdetails
	@RequestMapping("Empdetails")
	public Object Empdetail()
	{
		
		System.out.println("This is Employe Object");
		
		EmployePojo emp = new EmployePojo();
		
		emp.setEid(1);
		emp.setEname("rajaGopal");
		emp.setEsal(56.67);
		emp.setEdesg("JavaDevloper");
		
		Object a = emp;
		
		return a;
	}
	
	
}
