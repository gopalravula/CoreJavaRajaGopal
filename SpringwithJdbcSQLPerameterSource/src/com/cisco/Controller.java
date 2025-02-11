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
		System.out.println("This is Controller Class  =  "+emp);
		return si.save(emp);
	}
	
	
	public void update(double esal ,String edesg, int eid)
	{
	    System.out.println("This is Controller Class =  "+eid);
	    si.update(esal,edesg,eid);
	}
	
	
	public void delete(int eid)
	{
	    System.out.println("This is Controller Class = "+eid);
	    si.delete(eid);
	}
	
	
	
	public EmployePojo getbyId(int eid)
	{
	    System.out.println("This is Controller Class = "+eid);
	  return  si.getbyId(eid);
	    
	}
	
	
	public EmployePojo getByName(int eid)
	{
	    System.out.println("This is Controller Class = "+eid);
	    return si.getByName(eid);
	}
	

	
	
	public List<EmployePojo> getAll()
	{
	    System.out.println("This is Controller and GetAll data ");
	    return si.getAll();
	}
	
	
	
	
	
	
	
}
