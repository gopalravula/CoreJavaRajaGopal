package com.One.RelationByPojo;

public class Course
{

	private int cid;
	private String cname;
	private double cfee;
	
	
	public int getCid()
	{
		return cid;
	}
	public void setCid(int cid)
	{
		this.cid = cid;
	}
	public String getCname()
	{
		return cname;
	}
	public void setCname(String cname)
	{
		this.cname = cname;
	}
	public double getCfee()
	{
		return cfee;
	}
	public void setCfee(double cfee)
	{
		this.cfee = cfee;
	}
	@Override
	public String toString()
	{
		return "Course [cid=" + cid + ", cname=" + cname + ", cfee=" + cfee + "]";
	}
	
	
	public Course(int cid, String cname, double cfee)
	{
		super();
		this.cid = cid;
		this.cname = cname;
		this.cfee = cfee;
	}
	
	public Course()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
