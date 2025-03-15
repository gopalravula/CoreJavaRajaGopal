package com.cisco.Validation;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Service
{
	@Autowired
	private Dao di;

	public void save(EmployePojo emp) throws Exception
	{
		System.out.println(" This is service Class :- "+emp);
		di.save(emp);
		
	}

	public void updatedata(int eid, double esal, String edesg) throws Exception
	{
		System.out.println(" This is service Class :- "+eid);
		di.updatedata(eid,esal,edesg);
		
	}

	public void delete(int eid) throws Exception
	{
		System.out.println(" This is Service Class "+eid);
		di.delete(eid);
		
	}

	public EmployePojo GetById(int eid) throws Exception
	{
		System.out.println(" this is Service Class = "+eid);
		return di.GetById(eid);
		
	}

	public List<Map<String, Object>> GetByName(String ename) throws Exception
	{
		System.out.println(" This is service Class "+ename);
		
		return di.GetByName(ename);
	}

	public List<EmployePojo> GetAll()
	{
		System.out.println(" This is service Class");
		return di.GetAll();
	}

}
