package com.cisco;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Service {
	
	@Autowired
	private Dao di;

	public EmployePojo save(EmployePojo emp) {
		
		System.out.println("this is Service Class Save method "+emp);
		
		return di.save(emp);
	}

	public void update(double esal, String edesg, int eid) {
		
		System.out.println("this is Service Class update method "+eid);
		di.update(esal,edesg,eid);
		
		
	}

	public void delete(int eid) {
		
		
		System.out.println("This is Service Class deleted method ="+eid);
		
		di.delete(eid);
		
	}

	public EmployePojo getbyid(int eid) {
		
		
		System.out.println("this is Service Class Getbyid Method ="+eid);
		return di.getbyid(eid);
	}

	public void getbyName(int eid) {
		
		
		System.out.println("This is Service Class getbyName Method = "+eid);
		di.getbyName(eid);
		
	}

	public List<EmployePojo> getAll() {
		
		System.out.println("this is Service Class ");
		
		
		return di.getAll();
	}

}
