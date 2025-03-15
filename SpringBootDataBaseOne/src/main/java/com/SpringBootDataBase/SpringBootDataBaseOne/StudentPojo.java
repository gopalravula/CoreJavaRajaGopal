package com.SpringBootDataBase.SpringBootDataBaseOne;

import java.util.Objects;

public class StudentPojo
{
	
	private int sid;
	private String sname;
	private int sage;
	private double smarks;
	private String sloc;
	
	
	
	public int getSid()
	{
		return sid;
	}
	public void setSid(int sid)
	{
		this.sid = sid;
	}
	public String getSname()
	{
		return sname;
	}
	public void setSname(String sname)
	{
		this.sname = sname;
	}
	public int getSage()
	{
		return sage;
	}
	public void setSage(int sage)
	{
		this.sage = sage;
	}
	public double getSmarks()
	{
		return smarks;
	}
	public void setSmarks(double smarks)
	{
		this.smarks = smarks;
	}
	public String getSloc()
	{
		return sloc;
	}
	public void setSloc(String sloc)
	{
		this.sloc = sloc;
	}
	
	
	
	@Override
	public int hashCode()
	{
		return Objects.hash(sage, sid, sloc, smarks, sname);
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
		StudentPojo other = (StudentPojo) obj;
		return sage == other.sage && sid == other.sid && Objects.equals(sloc, other.sloc)
				&& Double.doubleToLongBits(smarks) == Double.doubleToLongBits(other.smarks)
				&& Objects.equals(sname, other.sname);
	}
	
	
	@Override
	public String toString()
	{
		return "StudentPojo [sid=" + sid + ", sname=" + sname + ", sage=" + sage + ", smarks=" + smarks + ", sloc="
				+ sloc + "]";
	}
	
	
	public StudentPojo(int sid, String sname, int sage, double smarks, String sloc)
	{
		super();
		this.sid = sid;
		this.sname = sname;
		this.sage = sage;
		this.smarks = smarks;
		this.sloc = sloc;
	}
	
	public StudentPojo()
	{
		super();
	}
	
	
	
	
	
	
	
	
	

}
