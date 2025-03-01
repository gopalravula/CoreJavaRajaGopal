package com.TypeThree.RequestBody;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("reqbody")
public class EmployeController
{
	
	
	@GetMapping("savep")
	// ReqestBody it will be in the Taken in the row data to be performed. //
	public EmployePojo savep(@RequestBody EmployePojo emp)
	{
		System.out.println("This is Employe = "+emp);
		return emp;
	}
}
