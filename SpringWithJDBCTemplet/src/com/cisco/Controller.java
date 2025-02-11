package com.cisco;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Controller {
	
	@Autowired
	private Service si;
	
	//Save By Using Templet. //
	public void save(EmployePojo emp)
	{
		System.out.println("This is Controller to save the data :  "+emp);
		si.save(emp);
	}
	
	
	// Update By Using templet //
	public void update(double esal,String edesg,int eid)
	{
		
		System.out.println("This is Controller to Update the data :  "+eid);
		si.update(esal,edesg,eid);
		
	}
	
	
	// Delete By Using templet //
	public void delete(int eid)
	{
		System.out.println("This is Controller to Delete the data :  "+eid);
		si.delete(eid);
	}
	
	// ------------------------------------------------------------//
	
	// Get By Name //
	public void getbyName(int eid)
	{
		
		System.out.println("This is Controller to By Name Only the data :  "+eid);
		si.getbyName(eid);
	}
	
	//Get By Sal //
	public void getbySal(int eid)
	{
		
		System.out.println("This is Controller to By Salary Only the data :  "+eid);
		si.getbySal(eid);
	}
	
	// Get By Count //
	public void getCount()
	{
		System.out.println("This is Controller to By getCount Only the data :  ");
		si.getCount();
	}
	
	// Get Employe data. //
	public void Empdata(int eid)
	{
		
		System.out.println("This is Controller to By Employe Data Only the data :  "+eid);
		si.empdata(eid);
		
	}
	
	//---------------------------------------------------------------------------------//
	
	public void Empdatas(int eid)
	{
		System.out.println("This is Controller to By Employe Data Only the data :  "+eid);
		si.Empdatas(eid);
	}
	
	//---------------------------------------------------------------------------------//
	
	public void empdataway1()
	{
		
		System.out.println("This is Controller to By Employe Data Only the data :  ");
		si.empdataway1();
		
	}

	//-----------------------------------------------------------------------------//
	
	
	public void empdata2()
	{
		System.out.println("This is Controller to By Employe Data list of data Only the data :  ");
		si.empdata2();
	}

	
	//--------------------------------------------------------------------------------//
	
	//Batch Update. //
	
	public void batchupdate()
	{
				//get connection
				// Exception handling
				//prepared statement
				// set parameter
				//execute query batchupdate
				// close batchupdatte
		
		System.out.println("This is Controller to By Employe Data Batch Update Only the data :  ");
		si.batchupdate();
		
		
	}
}
