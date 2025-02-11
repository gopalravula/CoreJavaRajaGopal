package com.cisco;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;

@Component
public class Dao
	{

	@Autowired
	private NamedParameterJdbcTemplate jntemp;

	public EmployePojo save(EmployePojo emp)
	{
		
		System.out.println("This is Dao Class =  "+emp);
		
		SqlParameterSource s = new BeanPropertySqlParameterSource(emp);
		
		String sql = "insert into gopal.employe values(:eid,:ename,:esal,:edesg);";
		
		jntemp.update(sql, s);
	
		System.out.println("This is Data Saved Succefully----"+emp);
	
		return emp;
	}

	
	
	public void update(double esal, String edesg, int eid)
	{
	 
	    System.out.println("This is Dao Update Method = "+eid);
	    
	    EmployePojo emp = new EmployePojo();
	    emp.setEsal(esal);
	    emp.setEdesg(edesg);
	    emp.setEid(eid);
	    
	    SqlParameterSource s = new BeanPropertySqlParameterSource(emp);
	    
	    String sql = "update gopal.employe set esal=:esal,edesg=:edesg where eid=:eid;";
	    
	    jntemp.update(sql, s);
	    
	    System.out.println("Data is Updated Succefully = "+eid);
	}



	public void delete(int eid)
	{
	  
	    System.out.println("This is Dao Class Started =  "+eid);
	    
	    EmployePojo emp = new EmployePojo();
	    emp.setEid(eid);
	    
	    SqlParameterSource s = new BeanPropertySqlParameterSource(emp);
	    
	    String sql = "delete from gopal.employe where eid =:eid;";
	    
	    jntemp.update(sql, s);
	    
	    System.out.println("Data is deleted Succefully = "+eid);
	    
	}



	public EmployePojo getbyId(int eid)
	{
	   
	    System.out.println("This is Dao Class is Started ="+eid);
	    
	    EmployePojo emp = new EmployePojo();
	    emp.setEid(eid);
	    
	    SqlParameterSource s = new BeanPropertySqlParameterSource(emp);
	    
	    String query = "select * from gopal.employe where eid =:eid;";
	    
	EmployePojo  qu1 = jntemp.queryForObject(query, s,new BeanPropertyRowMapper<EmployePojo>(EmployePojo.class));
	    
	    System.out.println(qu1);
	    
	    return qu1;
	    
	}



	public EmployePojo getByName(int eid)
	{
	    
	    System.out.println("This is Dao Class is Started = "+eid);
	    
	    EmployePojo emp = new EmployePojo();
	    
	    emp.setEid(eid);
	    
	    SqlParameterSource s = new BeanPropertySqlParameterSource(emp);
	    
	    String query = "select ename from gopal.employe where eid = :eid;";
	    
	    
	    	String sname = jntemp.queryForObject(query, s,String.class);
	    	
	    	System.out.println(sname);
	    
	    return emp;
	}



	public List<EmployePojo> getAll()
	{
	    
	    System.out.println("This is Dao Class started --");
	    
	    EmployePojo emp = new EmployePojo();
	    
	    SqlParameterSource s = new BeanPropertySqlParameterSource(emp);
	    
	    String query = "select * from gopal.employe";
	    
	    List<EmployePojo> dat =jntemp.query(query, new OurRowMapper());
	    
	    	Iterator<EmployePojo>	dass	=	dat.iterator();
	    
	    		while(dass.hasNext())
	    		{
	    		    System.out.println(dass.next());
	    		}
	    		
	    return dat;
	}
	
	
	
}
