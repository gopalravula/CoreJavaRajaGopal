package com.Annotation.AnnRelations;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Course")
public class CourseEntity
{
	
	@Id
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
		return "CourseEntity [cid=" + cid + ", cname=" + cname + ", cfee=" + cfee + "]";
	}
	
	
	public CourseEntity(int cid, String cname, double cfee)
	{
		super();
		this.cid = cid;
		this.cname = cname;
		this.cfee = cfee;
	}
	public CourseEntity()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
