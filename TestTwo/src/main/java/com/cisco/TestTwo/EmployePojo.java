package com.cisco.TestTwo;

import java.util.Objects;

public class EmployePojo
{

	
	private int eid;
	private String ename;
	private double esal;
	private String edesg;
	
	
	public int getEid()
	{
		return eid;
	}
	public void setEid(int eid)
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
	public double getEsal()
	{
		return esal;
	}
	public void setEsal(double esal)
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
		return "EmployePojo [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", edesg=" + edesg + "]";
	}
	
	public EmployePojo(int eid, String ename, double esal, String edesg)
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
		
	}
	
	
	@Override
	public int hashCode()
	{
		return Objects.hash(edesg, eid, ename, esal);
	}
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployePojo other = (EmployePojo) obj;
		return Objects.equals(edesg, other.edesg) && eid == other.eid && Objects.equals(ename, other.ename)
				&& Double.doubleToLongBits(esal) == Double.doubleToLongBits(other.esal);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
