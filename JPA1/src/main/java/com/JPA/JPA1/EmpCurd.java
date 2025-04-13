package com.JPA.JPA1;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpCurd extends JpaRepository<EmployeEntity, Integer>
{

	
	public abstract List<EmployeEntity>findByEname(String ename);
	
	public abstract	List<EmployeEntity>	findByesalGreaterThan(double esal);
	
	public abstract List<EmployeEntity>  findByesalLessThan(double esal);
	
	public abstract List<EmployeEntity> findByesalBetween(double min, double max);
	
	public abstract int countByEname(String name); 

	
	public abstract int deleteByename(String ename);
}				
