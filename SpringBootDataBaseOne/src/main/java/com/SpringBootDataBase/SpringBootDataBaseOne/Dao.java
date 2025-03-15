package com.SpringBootDataBase.SpringBootDataBaseOne;

import java.util.Iterator;
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

	public void save(StudentPojo std)
	{
		
		System.out.println("I am in Dao Class ----"+std);
		System.out.println("jdbcTemplete Object---"+jtemp);
		
		jtemp.update(" insert into  ganeshwar.studentpojo values(?,?,?,?,?)",std.getSid(),std.getSname(),std.getSage(),std.getSmarks(),std.getSloc());
		
		System.out.println(" Data is inserted Succefully "+std);
	}

	
	
	public void update( Double smarks, String sloc,Integer sid)
	{
		
		System.out.println(" This is Dao Class Of Update : "+sid);
		
		jtemp.update("update ganeshwar.studentpojo set smarks=?,sloc=? where sid=?",smarks,sloc,sid);
		
		System.out.println(" It is Succefully Updated " +sid);
		
	}

	
	
	public void delete(Integer sid)
	{
		System.out.println(" This is Dao Class Delete Method : "+sid);
		
		jtemp.update("delete from ganeshwar.studentpojo where sid = ?;",sid);
		
		System.out.println(" it is deleted Succefully "+sid);
	}
	
	
	

	public void getByid(Integer sid)
	{
		
		System.out.println(" This is Dao Class get By id method : "+sid);
		
		StudentPojo std =
		jtemp.queryForObject("select * from ganeshwar.studentpojo where sid = ?;", new BeanPropertyRowMapper<StudentPojo>(StudentPojo.class),sid);
		System.out.println(std);
		
	}

	
	
	
	
	public void getByname(String sname)
	{
		System.out.println(" This i Dao Claa get name method : "+sname);
		List<StudentPojo> namedata = 	
		jtemp.query("select * from ganeshwar.studentpojo where sname = ?",new BeanPropertyRowMapper<StudentPojo>(StudentPojo.class),sname);
		
			Iterator<StudentPojo>	data=	namedata.iterator();
			
			while(data.hasNext())
			{
				System.out.println(data.next());
			}
	
	}

	
	
	
	public void getAlldata()
	{
		System.out.println(" This is Dao Class get the data ");
		
		   List<Map<String, Object>> data1 =
		            jtemp.queryForList("SELECT * FROM ganeshwar.studentpojo");

				Iterator<Map<String, Object>>	ohms =	data1.iterator();
				
				 for (Map<String, Object> row : data1) {
			            System.out.println(row);
		
	}
	}

}
