package com.cisco.TestTwo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stdc")
public class StudentController
{
	//http://localhost:8080/stdc/getName
	@RequestMapping("getName")
	public String GetName()
	{
		System.out.println("this is Student Controller GetName");
		return "RajaGopal Ravula";
	}
	
	//http://localhost:8080/stdc/getSid
	@RequestMapping("getSid")
	public Integer GetSid()
	{
		System.out.println("This is Student Controller id");
		return 10001;
	}
	
	
	//http://localhost:8080/stdc/getMarks
	@RequestMapping("getMarks")
	public Double GetMarks()
	{
		System.out.println("This is Student Marks");
		return 45.56;
	}
	
	
	//http://localhost:8080/stdc/GetPass
	@RequestMapping("GetPass")
	public Boolean GetPass()
	{
		System.out.println("This is Student Controller pass/fail");
		return true;
	}

}
