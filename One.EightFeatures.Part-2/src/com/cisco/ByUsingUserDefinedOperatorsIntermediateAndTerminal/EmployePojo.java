package com.cisco.ByUsingUserDefinedOperatorsIntermediateAndTerminal;

import java.util.Objects;

public class EmployePojo
{
	
	private Integer eid;
	private String ename;
	private Integer eage;
	private Double esal;
	private String edesg;
	
	

	public EmployePojo()
	{
		super();
	}

	
	
	public EmployePojo(Integer eid, String ename, Integer eage, Double esal, String edesg)
	{
		super();
		this.eid = eid;
		this.ename = ename;
		this.eage = eage;
		this.esal = esal;
		this.edesg = edesg;
	}

	
	
	@Override
	public String toString()
	{
		return "EmployePojo [eid=" + eid + ", ename=" + ename + ", eage=" + eage + ", esal=" + esal + ", edesg=" + edesg
				+ "]";
	}

	
	
	@Override
	public int hashCode()
	{
		return Objects.hash(eage, edesg, eid, ename, esal);
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
		return Objects.equals(eage, other.eage) && Objects.equals(edesg, other.edesg) && Objects.equals(eid, other.eid)
				&& Objects.equals(ename, other.ename) && Objects.equals(esal, other.esal);
	}
	
	
	
	
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
	public Integer getEage()
	{
		return eage;
	}
	public void setEage(Integer eage)
	{
		this.eage = eage;
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


}
