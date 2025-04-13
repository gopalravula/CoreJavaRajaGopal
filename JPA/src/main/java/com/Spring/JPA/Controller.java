package com.Spring.JPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ECount")
public class Controller
{
	@Autowired
	private Service ser;
	
	@PostMapping("save")
	public void save(@RequestBody  EmployeEntity emp)
	{
		System.out.println("This is Controller Class "+emp);
		ser.save(emp);
	}
	
	
	
	
	
	@DeleteMapping("delete/{eid}")
	public void deleteById(@PathVariable("eid") Integer eid)
	{
		ser.deleteById(eid);
		System.out.println("This is Controller Class"+eid);
		
	}
	
	@GetMapping("getById/{eid}")
	public void getbyId(@PathVariable Integer eid)
	{
		ser.getbyId(eid);
		System.out.println("This is Controller Class "+eid);
		
	}
	
	@GetMapping("GetAll")
	public void GetAll()
	{
		ser.GetAll();
		System.out.println("this is Controller Class");
	}
	
	
	
	
	
}
