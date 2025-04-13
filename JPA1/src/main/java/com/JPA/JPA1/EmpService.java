package com.JPA.JPA1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.validation.Valid;

@Component
public class EmpService
{
	@Autowired
	private EmpDao dao;

	public EmployeEntity save(@Valid EmployeEntity emp)
	{
		System.out.println("This is Service Class : "+emp);
		return dao.save(emp);
		
	}

	public int delete(int eid)
	{
		System.out.println("This is Service Class "+eid);
		return dao.delete(eid);
	}

	public EmployeEntity getbyid(int eid)
	{
		System.out.println("This is Service Class");
		return dao.getbyid(eid);
	}

	public List<EmployeEntity> GetAll()
	{
		System.out.println("This is Service Class");
		return dao.GetAll();
	}

	public List<EmployeEntity> findByEName(String ename)
	{
		System.out.println("This is Service Class "+ename);
		return dao.findByEName(ename);
	}

	public List<EmployeEntity> findByESalaryGreaterThan(double esal)
	{
		System.out.println("This is Service Class "+esal);
		return dao.findByESalaryGreaterThan(esal);
	}

	public List<EmployeEntity> findByESalaryLessThan(double esal)
	{
		System.out.println("This is Service Class "+esal);
		return dao.findByESalaryLessThan(esal);
	}

	public List<EmployeEntity> findByESalaryBetween(double min, double max)
	{
		System.out.println("This is Service Class "+min);
		return dao.findByESalaryBetween(min,max);
	}

	public int countByEName(String ename)
	{
		System.out.println("This is Service calss "+ename);
		return dao.countByEName(ename);
	}

	public int deleteByEName(String ename)
	{
		System.out.println("This is Service Class "+ename);
		return dao.deleteByEName(ename);
	}

}
