package com.SpringBootDataBase.SpringBootDataBaseOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Service
{
	@Autowired
	private Dao dao;

	public void save(StudentPojo std)
	{
		
		System.out.println(" I am Service Class "+std);
		dao.save(std);
	}

	public void update( Double smarks, String sloc,Integer sid)
	{
	
		System.out.println(" This is Service update Method : "+sid);
		dao.update(smarks,sloc,sid);
		
	}

	public void delete(Integer sid)
	{
		System.out.println(" This is Service Class Delete Method : "+sid);
		dao.delete(sid);
		
	}

	public void getByid(Integer sid)
	{
		
		System.out.println(" This is service Class GetById method "+sid);
		dao.getByid(sid);
	}

	public void getByname(String sname)
	{
		System.out.println(" This is Service Class GetByName Method : "+sname);
		dao.getByname(sname);
		
	}

	
	public void getAlldata()
	{
		System.out.println(" This is Service Class GetALl ");
		dao.getAlldata();
		
	}

}
