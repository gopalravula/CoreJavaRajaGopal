package com.Annotation.AnnRelations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OneToOneService
{
	@Autowired
	private OneToOneDao dao;

	public PersonEntity saveorupdate(PersonEntity per) throws Exception
	{
		
		System.out.println("This is Service Class = "+per );
		return dao.saveorupdate(per);
	}

	public int deleteByid(int pid) throws Exception
	{
		System.out.println("This is Service Class "+pid);
		return dao.deleteByid(pid);
	}

	public PersonEntity GetById(int pid) throws Exception
	{
		System.out.println("This is Service Class "+pid);
		return dao.GetById(pid);
	}

	public List<PersonEntity> GetAll() throws Exception
	{
		System.out.println("This is Service Class");
		return dao.GetAll();
	}

	public List<PersonEntity> findByPname(String pname) throws Exception
	{
		System.out.println("This is Service Class "+pname);
		return dao.findByPname(pname);
	}

}
