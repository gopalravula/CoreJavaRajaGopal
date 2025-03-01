package com.TypeTwo.PathVariable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/empc")
public class EmployeCountroller
{
	
 //   http://localhost:8080/empc/save/1/Raja/78.89/se
	@RequestMapping("save/{eid}/{ename}/{esal}/{edesg}")
	public EmployePojo save
	(	@PathVariable("eid") Integer eid,
		@PathVariable("ename") String ename,
		@PathVariable("esal") Double esal,
		@PathVariable("edesg")String edesg
			
	)
	{
		EmployePojo emp = new EmployePojo();
		
		emp.setEid(eid);
		emp.setEname(ename);
		emp.setEsal(esal);
		emp.setEdesg(edesg);
		
		System.out.println(emp);
		return emp;
	}
	
 //  http://localhost:8080/empc/update/78.89/se/1
	@RequestMapping("update/{esal}/{edesg}/{eid}")
	public int update
	(
		@PathVariable("esal")Double esal,
		@PathVariable("edesg")String edesg,
		@PathVariable("eid")Integer eid
	)
	{
		
		System.out.println(esal);
		System.out.println(edesg);
		System.out.println(eid);
		return eid;
	}
	
	
 //  http://localhost:8080/empc/delete/1
	@RequestMapping("delete/{eid}")
	public int delete(@PathVariable("eid") Integer eid)
	{
		System.out.println("Deletd Succefully : "+eid);
		return eid;
	}
	
	
 // http://localhost:8080/empc/getById/1
	@RequestMapping("getById/{eid}")
	public EmployePojo GetById(@PathVariable("eid") Integer eid)
	{
		EmployePojo emp = new EmployePojo(1, "Shiva", 56.67, "Devloper");
		System.out.println(emp);
		return emp;
	}
	
	
  // http://localhost:8080/empc/GetAll
	@RequestMapping("GetAll")
	public List<EmployePojo> GetAll()
	{
		List<EmployePojo> data = new ArrayList<>();
		
		data.add(new EmployePojo(1, "Shiva", 89.90, "SQL Devloper"));
		data.add(new EmployePojo(2, "Birava", 89.90, "JAVADevloper"));
		data.add(new EmployePojo(3, "Lakshmi", 90.90, "PythonDevloper"));
		
		Iterator<EmployePojo>	dass	=	data.iterator();
		
		while(dass.hasNext())
		{
			System.out.println(dass.next());
		}
		return data;
	}

}
