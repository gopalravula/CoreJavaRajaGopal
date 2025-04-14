package com.Annotation.AnnRelations;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Mobile")
public class MobileEntity
{

	@Id
	private int mid;
	private long mnum;
	private String msim;
	
	
	
	public int getMid()
	{
		return mid;
	}
	public void setMid(int mid)
	{
		this.mid = mid;
	}
	public long getMnum()
	{
		return mnum;
	}
	public void setMnum(long mnum)
	{
		this.mnum = mnum;
	}
	public String getMsim()
	{
		return msim;
	}
	public void setMsim(String msim)
	{
		this.msim = msim;
	}
	
	
	@Override
	public String toString()
	{
		return "mid=" + mid + ", mnum=" + mnum + ", msim=" + msim ;
	}
	
	
	public MobileEntity(int mid, long mnum, String msim)
	{
		super();
		this.mid = mid;
		this.mnum = mnum;
		this.msim = msim;
	}
	
	
	public MobileEntity()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
