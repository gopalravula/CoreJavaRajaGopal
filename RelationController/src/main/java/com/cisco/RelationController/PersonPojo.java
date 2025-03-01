package com.cisco.RelationController;

import java.util.List;

public class PersonPojo
{
	
	private int pid;
	private String pname;
	private int page;
	private String pqual;
	private PassportPojo pt;
	
	private List<MobilePojo> mob;
	
	private List<Course> course;

	public int getPid()
	{
		return pid;
	}

	public void setPid(int pid)
	{
		this.pid = pid;
	}

	public String getPname()
	{
		return pname;
	}

	public void setPname(String pname)
	{
		this.pname = pname;
	}

	public int getPage()
	{
		return page;
	}

	public void setPage(int page)
	{
		this.page = page;
	}

	public String getPqual()
	{
		return pqual;
	}

	public void setPqual(String pqual)
	{
		this.pqual = pqual;
	}

	public PassportPojo getPt()
	{
		return pt;
	}

	public void setPt(PassportPojo pt)
	{
		this.pt = pt;
	}

	public List<MobilePojo> getMob()
	{
		return mob;
	}

	public void setMob(List<MobilePojo> mob)
	{
		this.mob = mob;
	}

	public List<Course> getCourse()
	{
		return course;
	}

	public void setCourse(List<Course> course)
	{
		this.course = course;
	}
	
	
	

}
