package com.TypeOne.RequestParameters;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/empcount")
public class EmpRequestController
{

 // http://localhost:8080/empcount/Save?eid=1&ename=Shiva&esal=67.78&edesg=javaDev
	@RequestMapping("Save")
	public EmployePojo save
	(
			@RequestParam("eid") Integer eid,
			@RequestParam("ename") String ename,
			@RequestParam("esal") Double esal,
			@RequestParam("edesg") String edesg
	)
	{
		System.out.println("This is Controller class save method ");
		
		
		EmployePojo emp = new EmployePojo();
		emp.setEid(eid);
		emp.setEname(ename);
		emp.setEsal(esal);
		emp.setEdesg(edesg);
		
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(esal);
		System.out.println(edesg);
		
		
		return emp;
	}
	
	
	
 // http://localhost:8080/empcount/Update?eid=1&esal=67.78&edesg=javaDev
	@RequestMapping("Update")
	public int update
	(
			@RequestParam("eid") Integer eid,
			@RequestParam("esal") Double esal,
			@RequestParam("edesg") String edesg
			
	)
	{
		
		System.out.println("This is update of the controller --"+eid);
		System.out.println(esal);
		System.out.println(edesg);
		
		return eid;
		
	}
	
	
	
	
 //  http://localhost:8080/empcount/delete?eid=1
	@RequestMapping("delete")
	public int delete(@RequestParam() Integer eid)
	{
		System.out.println("This is Delete method---"+eid);
		return eid;
	}
	
	
// http://localhost:8080/empcount/getbyId?eid=1
	@RequestMapping("getbyId")
	public EmployePojo getbyid(@RequestParam("eid") Integer eid)
	{
		System.out.println("This is GetByid");
		
		EmployePojo emp = new EmployePojo();
		emp.setEid(eid);
		
		return emp;
	}
	
	
	
//  http://localhost:8080/empcount/GetAll
	@RequestMapping("GetAll")
	public List<EmployePojo> getAll()
	{
		
		System.out.println("this is GetAll method");
		
		List<EmployePojo> data = new ArrayList<>();
		
		data.add(new EmployePojo(1, "Birava", 67.78, "JavaDevloper"));
		data.add(new EmployePojo(2, "lakshmi", 89.89, "PythonDevloper"));
		data.add(new EmployePojo(3, "Shiva", 90.90, "SQLDevloper"));
		
		return data;
	}
	
}
