package com.cisco.TestTwo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Datatype")
public class DataTypeController
{

	//  http://localhost:8080/Datatype/getName
		@RequestMapping("getName")
		public String getName()
		{
			return "RajaGopal";
		}
		
		
		
	//  http://localhost:8080/Datatype/getid
		@RequestMapping("getid")
		public Integer getide()
		{
			return 123;
		}
		
		
	//  http://localhost:8080/Datatype/getMarks
		@RequestMapping("getMarks")
		public Double getMarks()
		{
			return 67.78;
		}
		
		
	//   http://localhost:8080/Datatype/empdata
		@RequestMapping("empdata")
		public EmployePojo empdata()
		{
			EmployePojo e = new EmployePojo();
			
			e.setEid(1);
			e.setEname("RajaGopal");
			e.setEsal(56.67);
			e.setEdesg("javaDevloper");
			
			return e;
		}
	
	
	
}
