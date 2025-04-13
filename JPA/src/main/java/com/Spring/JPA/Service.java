package com.Spring.JPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Service
{

	@Autowired
	private Dao dai;
	
	public void save(EmployeEntity emp)
	{
		System.out.println(" This is Service Class ");
		dai.save(emp);
		
	}

	public void deleteById(Integer eid)
	{
		dai.deleteById(eid);
		System.out.println("This is Service Class "+eid);
		
	}

	public void getbyId(Integer eid)
	{
		dai.getbyId(eid);
		System.out.println("This is Servie Class "+eid);
		
	}

	public void GetAll()
	{
		dai.GetAll();
		System.out.println("This is Service Class ");
		
	}

}
