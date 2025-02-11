package com.cisco;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class Dao {
	
	@Autowired
	private NamedParameterJdbcTemplate njtemp;

	public EmployePojo save(EmployePojo emp) {
		
		
		MapSqlParameterSource a = new MapSqlParameterSource();
		
		System.out.println("Named PerameterJDBCTemplate==" + njtemp);
		a.addValue("eid", emp.getEid());
		a.addValue("ename", emp.getEname());
		a.addValue("esal", emp.getEsal());
		a.addValue("edesg", emp.getEdesg());
		
		njtemp.update("insert into gopal.employe values(:eid,:ename,:esal,:edesg);",a);
		
		System.out.println("I am in Dao Class----"+emp);
		return emp;
	}
	
	

	public void update(double esal, String edesg, int eid) {
		
		MapSqlParameterSource a = new MapSqlParameterSource();
		
		System.out.println("Name ParameterDatasource ="+njtemp);
		
		a.addValue("esal", esal);
		a.addValue("edesg", edesg);
		a.addValue("eid", eid);
		
		njtemp.update("update gopal.employe set esal=:esal,edesg=:edesg where eid=:eid", a);
		
		System.out.println("Data is updated succefully="+eid);
		
	}



	public void delete(int eid) {
		
	
		MapSqlParameterSource a = new MapSqlParameterSource();
		
		System.out.println("NamedParameter Datasource ="+njtemp);
		
		a.addValue("eid", eid);
		
		njtemp.update("delete from gopal.employe where eid =:eid", a);
		
		System.out.println("this is Dao Class deted Succefully ="+eid);
		
	}



	public EmployePojo getbyid(int eid) {
		
		System.out.println("This is Dao Class ="+eid);
		
		MapSqlParameterSource a = new MapSqlParameterSource();
		
		a.addValue("eid", eid);
		
		 EmployePojo emp =njtemp.queryForObject("select * from gopal.employe where eid =:eid", a, new BeanPropertyRowMapper<EmployePojo>(EmployePojo.class));
		
		 System.out.println(emp);
		return emp;
	}



	public void getbyName(int eid) {
	
		
		System.out.println("This is Dao Class = "+eid);
		
		MapSqlParameterSource a = new MapSqlParameterSource();
		
		a.addValue("eid", eid);
		
			String ss = njtemp.queryForObject("select ename from gopal.employe where eid = :eid; ", a, String.class);
		
		System.out.println(ss);
	}



	public List<EmployePojo> getAll() {
		
		System.out.println("This is Dao Class ");
		
		// We need this One Only to pass the perameters purpuse only . //
		MapSqlParameterSource a = new MapSqlParameterSource();
		
		
		return njtemp.query("select * from gopal.employe", new ourRowMapper());
	}

}
