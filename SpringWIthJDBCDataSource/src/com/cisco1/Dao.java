package com.cisco1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dao {


	@Autowired
	private DataSource dataSource;
	
	public void save(EmployePojo emp)
	{
		System.out.println("dao Dbms Operation validation");
		
		try {
			/* Got the Connection Object Based On the Connection Pull. 
			
	PreparedStatement ps =
		con.prepareStatement("insert into gopal.employe values(1,'Birava',56.67,'se');");
				
			*/
				Connection con 	=	dataSource.getConnection();
				
		PreparedStatement ps	=	con.prepareStatement("insert into gopal.employe values(?,?,?,?)");
		
					ps.setInt(1, emp.getEid());
					ps.setString(2, emp.getEname());
					ps.setDouble(3, emp.getEsal());
					ps.setString(4, emp.getEdesg());
					
					int row  = ps.executeUpdate();
				
				System.out.println("Row is : "+row);
				
				System.out.println(con);
			}
		catch (SQLException e) 
		{
			
			e.printStackTrace();
		}
		
		
	}

	public void update(double esal, String edesg, int eid) 
	{
		System.out.println("dao Dbms Operation validation : "+eid);
		
			try 
			{
					Connection con	=	dataSource.getConnection();
					
	PreparedStatement ps =
			con.prepareStatement("update gopal.employe set esal=?,edesg=? where eid = ?;");
	
				ps.setDouble(1, esal);
				ps.setString(2, edesg);
				ps.setInt(3, eid);
				
				int row = ps.executeUpdate();
				
				System.out.println("The Row is : "+row);
				
		
			}
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		
		
	}

	public void delete(int eid) {

		System.out.println("dao Dbms Operation validation : "+eid);
		
		try {
			Connection con		=	dataSource.getConnection();
						
			PreparedStatement ps = con.prepareStatement("delete from gopal.employe where eid = ?; ");
			
			ps.setInt(1, eid);
			
			int rows = ps.executeUpdate();
			
			System.out.println("Delete the Row : "+rows);
			}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		
	}

	public void getbyid(int eid) {
		
		
		System.out.println("dao Dbms Operation validation : "+eid);
		
			try {
				Connection con	= dataSource.getConnection();
				
				PreparedStatement ps =
							con.prepareStatement("select * from gopal.employe where eid = ?");
				
				ps.setInt(1, eid);
				
			ResultSet rs = ps.executeQuery();
			
				while(rs.next())
				{
					System.out.println(
							rs.getInt("eid")+"----"+rs.getString("ename")+"---"+
							rs.getDouble("esal")+"------"+rs.getString("edesg"));
				}
				
				System.out.println("------Based On the id it is Displaying ------");
			
				} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		
		
	}

	public void getAll() {
		
		System.out.println("dao Dbms Operation validation : ");
	
		
			try
			{
				Connection con	=	dataSource.getConnection();
				
				PreparedStatement ps =
								con.prepareStatement("select * from gopal.employe ;");
				
				ResultSet rs = ps.executeQuery();
				
				while(rs.next())
				{
					System.out.println(rs.getInt("eid")+"-----"+rs.getString("ename")+"------"+
										rs.getDouble("esal")+"------"+rs.getString("edesg"));
				}
				
				
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		
		
	}
	
	
}
