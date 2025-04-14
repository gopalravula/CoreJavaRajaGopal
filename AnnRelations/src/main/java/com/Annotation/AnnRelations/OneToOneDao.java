package com.Annotation.AnnRelations;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OneToOneDao
{
	@Autowired
	private PersonCurd pcurd;

	public PersonEntity saveorupdate(PersonEntity per) throws Exception
	{
		System.out.println("This is Dao Class");
		PersonEntity ps =	pcurd.save(per);
		System.out.println(ps);
		return ps;
	}

	public int deleteByid(int pid) throws Exception
	{
		System.out.println("This is Dao Class "+pid);
		 pcurd.deleteById(pid);	
		return pid;
	}

	public PersonEntity GetById(int pid) throws Exception
	{
		System.out.println("This is Dao Class "+pid);
		Optional<PersonEntity> ps =	pcurd.findById(pid);
		
		System.out.println(ps.get());
		return ps.get();
	}

	public List<PersonEntity> GetAll() throws Exception
	{
		System.out.println("This is Dao Classs");
		List<PersonEntity>	psall =	pcurd.findAll();
		
		Iterator<PersonEntity>	das=	psall.iterator();
		
			while(das.hasNext())
			{
				System.out.println(das.next());
			}
		
		return psall;
	}

	public List<PersonEntity> findByPname(String pname) throws Exception
	{
		System.out.println("This is Dao Class "+pname);
		
			List<PersonEntity>	data= pcurd.findByPname(pname);
			
			Iterator<PersonEntity> dass1 =	data.iterator();
			
			while(dass1.hasNext())
			{
				System.out.println(dass1.next());
			}
		return data;
	}

}
