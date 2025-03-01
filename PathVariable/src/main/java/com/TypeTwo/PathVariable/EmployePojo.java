package com.TypeTwo.PathVariable;

public class EmployePojo
{

	
	private Integer eid;
	private String ename;
	private Double esal;
	private String edesg;
	
	
	public Integer getEid()
	{
		return eid;
	}
	public void setEid(Integer eid)
	{
		this.eid = eid;
	}
	public String getEname()
	{
		return ename;
	}
	public void setEname(String ename)
	{
		this.ename = ename;
	}
	public Double getEsal()
	{
		return esal;
	}
	public void setEsal(Double esal)
	{
		this.esal = esal;
	}
	public String getEdesg()
	{
		return edesg;
	}
	public void setEdesg(String edesg)
	{
		this.edesg = edesg;
	}
	
	
	@Override
	public String toString()
	{
		return "eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", edesg=" + edesg ;
	}
	
	
	public EmployePojo(Integer eid, String ename, Double esal, String edesg)
	{
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.edesg = edesg;
	}
	
	
	
	public EmployePojo()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
}
