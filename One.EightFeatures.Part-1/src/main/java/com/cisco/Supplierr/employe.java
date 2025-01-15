package com.cisco.Supplierr;

import java.util.Objects;

public class employe
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
		return "employe [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", edesg=" + edesg + "]";
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
		employe other = (employe) obj;
		return Objects.equals(edesg, other.edesg) && eid == other.eid && Objects.equals(ename, other.ename)
				&& Double.doubleToLongBits(esal) == Double.doubleToLongBits(other.esal);
	}
	
	
	

}
