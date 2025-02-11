package com.cisco1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Controller {
	
	@Autowired
	private Service si;
	
	// By Using Save Operation .//
	public void save(EmployePojo emp)
	{
		System.out.println("Controller for Client Side Validations : "+emp);
		si.save(emp);
	}
	
	// By using Update Operation. //
	public void update(double esal,String edesg,int eid)
	{
		
		System.out.println("Controller for Client Side Validations : "+eid);
		si.update(esal,edesg,eid);
	}
	
	public void delete(int eid)
	{
		System.out.println("Controller for Client Side Validations : "+eid);
		si.delete(eid);
	}
	
	
	public void getbyid(int eid)
	{
		
		System.out.println("Controller for Client Side Validations : "+eid);
		si.getbyid(eid);
	}
	
	public void getAll()
	{
		
		System.out.println("Controller for Client Side Validations : ");
		si.getAll();
		
	}

}
