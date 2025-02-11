package com.cisco;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ourRowMapper implements RowMapper<EmployePojo>{

	@Override
	public EmployePojo mapRow(ResultSet rs, int arg1) throws SQLException {
		
		EmployePojo e = new EmployePojo();
		
		e.setEid(rs.getInt("eid"));
		e.setEname(rs.getString("ename"));
		e.setEsal(rs.getDouble("esal"));
		e.setEdesg(rs.getString("edesg"));
		
		
		return e;
	}
	
	
	

}
