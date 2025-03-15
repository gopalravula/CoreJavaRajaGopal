package com.cisco.Validation;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class Dao
{
	
	@Autowired
	private JdbcTemplate jtemp;

	public void save(EmployePojo emp) throws Exception
	{
		System.out.println(" This is Dao Class :- "+emp);
		jtemp.update("insert into validations.employepojo values(?,?,?,?,?,?,?,?,?,?);",
								emp.getEid(),emp.getEname(),emp.getEage()
								,emp.getEsal(),emp.getEdesg(),emp.getEpan(),
								emp.getEmail(),emp.getDob(),emp.getJdate(),emp.getEdate());
		
	}

	public void updatedata(int eid, double esal, String edesg) throws Exception
	{
	
		System.out.println(" This is Dao Class :- "+eid);
		
		jtemp.update("update validations.employepojo set esal = ?, edesg = ? where eid = ?",
					esal,edesg,eid);
	}

	public void delete(int eid) throws Exception
	{
		System.out.println(" This is Dao Class :- "+eid);
		jtemp.update("delete from validations.employepojo where eid = ?",eid);
		System.out.println("Data is deleted Succefully "+eid);
		
	}

	public EmployePojo GetById(int eid) throws Exception
	{
		
		System.out.println(" This is Dao Class :- "+eid);
		EmployePojo emp =
		jtemp.queryForObject("select * from validations.employepojo where eid = ?", new BeanPropertyRowMapper<EmployePojo>(EmployePojo.class),eid);
		
		System.out.println(emp);
		return emp;
	}

	public List<Map<String, Object>> GetByName(String ename) throws Exception
	{
		  // Query for employees with the given name
	    List<Map<String, Object>> empList = jtemp.queryForList(
	        "SELECT * FROM validations.employepojo WHERE ename = ?",ename);

	    System.out.println("Fetched Data: " + empList);
	    return empList;		
	}

	public List<EmployePojo> GetAll()
	{
		System.out.println(" This is Dao Class");
		return jtemp.query("select * from  validations.employepojo ", new BeanPropertyRowMapper<EmployePojo>(EmployePojo.class));
	}

}
