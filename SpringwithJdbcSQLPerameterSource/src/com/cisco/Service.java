package com.cisco;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Service {

	
	@Autowired
	private Dao di;

	public EmployePojo save(EmployePojo emp) {
		
		System.out.println("This is Service Class = "+emp);
		return di.save(emp);
	}

	public void update(double esal, String edesg, int eid)
	{
	    System.out.println("This is Service Update Method =  "+eid);
	    di.update(esal,edesg,eid);
	}

	public void delete(int eid)
	{
	    
	    System.out.println("This is Service Delete Method  = "+eid);
	    di.delete(eid);
	    
	}

	public EmployePojo getbyId(int eid)
	{
	   
	    System.out.println("This is Service Class GetBy id Based = "+eid);
	  return  di.getbyId(eid);
	}

	public EmployePojo getByName(int eid)
	{
	  
	    System.out.println("This is Service and GetByName = "+eid);
	    
	    return di.getByName(eid);
	}

	public List<EmployePojo> getAll()
	{
	   
	    System.out.println("This is Service Class ");
	    
	    return di.getAll();
	}
	
}
