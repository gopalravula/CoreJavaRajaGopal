package com.cisco;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Controller {
	
	@Autowired
	private Service si;
	
	public EmployePojo save(EmployePojo emp)
	{
	
		System.out.println("i am a Controller Class = "+emp);
		return si.save(emp);
	}
	
	
	public void update( double esal ,String edesg, int eid)
	{
		System.out.println("I am cintroller class update ="+eid);
		si.update(esal,edesg,eid);
		
	}
	
	
	
	public void delete(int eid)
	{
		System.out.println(" I am Controller Class delete method ="+eid);
		
		si.delete(eid);
	}
	
	
	public EmployePojo getbyid(int eid)
	{
		System.out.println("This is Controller class getById ="+eid);
		
		return si.getbyid(eid);
	}
	
	
	public void getbyName(int eid)
	{
		System.out.println("This is Controller class getbyName ="+eid);
		
		si.getbyName(eid);
	}
	
	
	public List<EmployePojo> getAll()
	{
		EmployePojo e = new EmployePojo();
		System.out.println("this is Controller Class  ");
		
		return si.getAll();
	}
	
	

}
