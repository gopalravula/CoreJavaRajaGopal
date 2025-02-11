package com.cisco;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class Dao {

	//private DataSource datasource;
	
	@Autowired
	private JdbcTemplate jtemp;
	
	// For insert,update delete we use  Only update . //
	
	public void save(EmployePojo emp) {
		
	
		
	jtemp.update("insert into gopal.employe values(?,?,?,?);",emp.getEid(),emp.getEname(),emp.getEsal(),emp.getEdesg());
		
			System.out.println("Data is Saved Succefully :  "+emp);
	}


	public void update(double esal, String edesg, int eid) {
		
		jtemp.update("update gopal.employe set esal=?,edesg=? where eid=?",esal,edesg,eid);
		
		System.out.println("Data is Updated Succefully : "+eid);
	}


	public void delete(int eid) {
	
		jtemp.update("delete from  gopal.employe where eid =?",eid);
		
		System.out.println("Data is saved Succefully : "+eid);
	}


	
	// ---------------------------------------------------------------------------//
	
	// Get Only name,sal,count,empdata = QueryForObject. //
	
	public void getbyName(int eid) {
			// it take only One Object and return type is must and we should want to give the name. //
	  String name =	jtemp.queryForObject("select ename from gopal.employe where eid =? ", String.class,eid);
	  System.out.println(name);
		
	}
	
	
	public void getbySal(int eid)
	{
			Double esal	= jtemp.queryForObject("select esal from gopal.employe where eid=?", Double.class,eid);
			System.out.println(esal);
	}


	public void getCount() {
		
			
			long count	= jtemp.queryForObject("select count(*) from gopal.employe ", Long.class);
			System.out.println(count);
		
	}

	// For Passing This Only for RowMapper of Data. //
	public void empdata(int eid) {
		
	EmployePojo emp	=	jtemp.queryForObject("select * from gopal.employe where eid =?", new BeanPropertyRowMapper<>(EmployePojo.class),eid);
	System.out.println(emp);
		
	}


	//-------------------------------------------------------------------------------------//
	
	
	public void Empdatas(int eid) {
		
		EmployePojo dass=	jtemp.queryForObject("select * from gopal.employe where eid=?",new OurRowMapper());
		
		System.out.println(dass);
	}

	
	//-----------------------------------------------------------------------------------------------//
	
	//By usingQuery //
	public void empdataway1() {
		
	 List<EmployePojo> data  =  jtemp.query("select * from gopal.employe ;", new OurRowMapper());
	 
	 System.out.println(data);
		
	}

	//----------------------------------------------------------------------------------------------//

	//By Using QueryForList. //
	public void empdata2() {
		
		List<Map<String, Object>>  data1= jtemp.queryForList("select * from gopal.employe");
		
		Iterator<Map<String, Object>>	sos	=	data1.iterator();
		
				while(sos.hasNext())
				{
					System.out.println(sos.next());
				}
		
	}

//--------------------------------------------------------------------------//
	public void batchupdate() {
				//get connection
				// Exception handling
				//prepared statement
				// set parameter
				//execute query batchupdate
				// close batchupdatte
		Object[] a = {3,"Siva",99.99,"Dev"};
		Object[] b = {4,"Lokesh",67.78,"Tester"};
		Object[] c = {5,"Deva",89.89,"UI Designer"};
		Object[] d = {6,"Ashok",34.45,"Manual Testing"};
		
		
		List<Object[]> a1 = new ArrayList<>();
		
		a1.add(a);
		a1.add(b);
		a1.add(c);
		a1.add(d);
		
				jtemp.batchUpdate("insert into gopal.employe values(?,?,?,?)",a1);
				
				System.out.println("-----Data is inserted Succefully----");
	}
	

}
