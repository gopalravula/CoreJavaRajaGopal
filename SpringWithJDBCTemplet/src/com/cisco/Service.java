package com.cisco;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Service {

	@Autowired
	private Dao di;

	public void save(EmployePojo emp) {
		
		System.out.println("This is Service to save the data :  "+emp);
		di.save(emp);
		
	}

	public void update(double esal, String edesg, int eid) {
		
		System.out.println("This is Service to update the data :  "+eid);
		di.update(esal,edesg,eid);
	}

	public void delete(int eid) {
		
		System.out.println("This is Service to Delete the data :  "+eid);
		di.delete(eid);
		
	}
	
	//-----------------------------------------------------------------------------//

	public void getbyName(int eid) {
		
		
		System.out.println("This is Service to GetByName the data :  "+eid);
		di.getbyName(eid);
		
	}

	
	public void getbySal(int eid) {
		
		System.out.println("This is Service to getbySal the data :  "+eid);
		di.getbySal(eid);
	}

	public void getCount() {
		System.out.println("This is Service to getCount the data :  ");
		di.getCount();
		
	}

	public void empdata(int eid) {
		
		System.out.println("This is Service to Empdata the data :  "+eid);
		di.empdata(eid);
		
	}
	
	//------------------------------------------------------------------------------------//

	public void Empdatas(int eid) {
		
		System.out.println("This is Service to Empdata the data :  "+eid);
		di.Empdatas(eid);
	}

	public void empdataway1() {
		
		System.out.println("This is Service to Empdata the data :  ");
		di.empdataway1();
	}

	//-------------------------------------------------------------------------------------//
	public void empdata2() {
		
		System.out.println("This is Service to Empdata the data :  ");
		di.empdata2();
	}

	public void batchupdate() {
		System.out.println("This is Service to Empdata the data :  ");
		di.batchupdate();
		
	}
}
