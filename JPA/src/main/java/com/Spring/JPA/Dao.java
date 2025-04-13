package com.Spring.JPA;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dao
{

	@Autowired
	private empCurd ecurd;
	
	
	public void save(EmployeEntity emp)
	{
		System.out.println("This is Dao Class");
		
		ecurd.save(emp);
		
	}


	public void deleteById(Integer eid)
	{
		ecurd.deleteById(eid);
		System.out.println(" Dao Class Id Deleted Succefulyy"+eid);
		
	}


	public void getbyId(Integer eid)
	{
		Optional<EmployeEntity>	emp	=	ecurd.findById(eid);
		System.out.println(emp.get());
		System.out.println("This is Dao Class "+eid);
		
	}


	public void GetAll()
	{
		List<EmployeEntity>  empp = ecurd.findAll();
		
				Iterator<EmployeEntity> data	= empp.iterator();
				
				while(data.hasNext())
				{
					System.out.println(data.next());
				}
		
		System.out.println("This is Dao Class");
		
	}

}
