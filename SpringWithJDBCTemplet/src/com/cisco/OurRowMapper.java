package com.cisco;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.tree.RowMapper;

public class OurRowMapper implements org.springframework.jdbc.core.RowMapper<EmployePojo> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public EmployePojo mapRow(ResultSet rs, int arg1) throws SQLException {
		
		EmployePojo emp = new EmployePojo();
		
		emp.setEid(rs.getInt("eid"));
		emp.setEname(rs.getString("ename"));
		emp.setEsal(rs.getDouble("esal"));
		emp.setEdesg(rs.getString("edesg"));
		return emp;
	}

}
