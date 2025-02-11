package com.cisco1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Service {

	@Autowired
	private Dao di;
	
	
	public void save(EmployePojo emp)
	{
		System.out.println("Service for Server side Validations : "+emp);
		di.save(emp);
		
	}


	public void update(double esal, String edesg, int eid) 
	{
		System.out.println("Service for Server side Validations : "+eid);
		di.update(esal,edesg,eid);
		
	}


	public void delete(int eid) {
		
		System.out.println("Service for Server side Validations : "+eid);
		di.delete(eid);
	}


	public void getbyid(int eid) 
	{
		
		System.out.println("Service for Server side Validations : "+eid);
		di.getbyid(eid);
		
	}


	public void getAll() {
		System.out.println("Service for Server side Validations : ");
		di.getAll();
		
	}
}
