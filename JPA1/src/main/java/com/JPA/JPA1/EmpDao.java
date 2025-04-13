package com.JPA.JPA1;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
@Component
public class EmpDao
{
	
	@Autowired
	private EmpCurd ecurd;

	public EmployeEntity save(@Valid EmployeEntity emp)
	{
		System.out.println("This is Dao Class : "+emp);
		return ecurd.save(emp);
	}

	
	public int delete(int eid)
	{
		System.out.println("This is Service Class : "+eid);
		ecurd.deleteById(eid);
		return eid ;
	}


	public EmployeEntity getbyid(int eid)
	{
		System.out.println("This is Dao Class "+eid);
		
		Optional<EmployeEntity>	empp = ecurd.findById(eid);
		
		System.out.println(empp);
		return empp.get();
	}


	public List<EmployeEntity> GetAll()
	{
		System.out.println("This is Dao Class");
		List<EmployeEntity>	data=ecurd.findAll();
		System.out.println(data);
		return data;
	}


	public List<EmployeEntity> findByEName(String ename)
	{
		System.out.println("This is Dao Classs"+ename);
		
		List<EmployeEntity>	 empp= ecurd.findByEname(ename);
		
		Iterator<EmployeEntity>	data = empp.iterator();
		
		while(data.hasNext())
		{
			System.out.println(data.next());
		}
		return empp;
	}


	public List<EmployeEntity> findByESalaryGreaterThan(double esal)
	{
	
		System.out.println("This is Dao Class"+esal);
						
		List<EmployeEntity> empp=ecurd.findByesalGreaterThan(esal);
		
		Iterator<EmployeEntity>	data = empp.iterator();
				
		while(data.hasNext())
		{
			System.out.println(data.next());
		}
		return empp;
	}


	public List<EmployeEntity> findByESalaryLessThan(double esal)
	{
		System.out.println("This is Dao Class"+esal);
		
		List<EmployeEntity> empp =ecurd.findByesalLessThan(esal);
		
		
		Iterator<EmployeEntity>	data = empp.iterator();
		
		while(data.hasNext())
		{
			System.out.println(data.next());
		}
		return empp;
	}


	public List<EmployeEntity> findByESalaryBetween(double min, double max)
	{
		System.out.println("This is Dao Class ");
		
		List<EmployeEntity> empp = ecurd.findByesalBetween(min,max);
		
		Iterator<EmployeEntity>	data = empp.iterator();
		
		while(data.hasNext())
		{
			System.out.println(data.next());
		}
		return empp;
	}


	public int countByEName(String ename)
	{
		System.out.println("This is Dao Class");
			int data = ecurd.countByEname(ename);

			System.out.println(data);
		return data;
	}



    @Transactional
	public int deleteByEName(String ename)
	{
		System.out.println("This is Dao Class");
		
		int data=	ecurd.deleteByename(ename);
		System.out.println(data);
		return data;
	}

}
