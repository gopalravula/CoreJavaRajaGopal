package com.cisco.RelationController;

public class MobilePojo
{
	
	private int mid;
	private long mnumb;
	private String msim;
	
	
	public int getMid()
	{
		return mid;
	}
	public void setMid(int mid)
	{
		this.mid = mid;
	}
	public long getMnumb()
	{
		return mnumb;
	}
	public void setMnumb(long mnumb)
	{
		this.mnumb = mnumb;
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
		return "MobilePojo [mid=" + mid + ", mnumb=" + mnumb + ", msim=" + msim + "]";
	}
	
	
	public MobilePojo(int mid, long mnumb, String msim)
	{
		super();
		this.mid = mid;
		this.mnumb = mnumb;
		this.msim = msim;
	}
	
	
	public MobilePojo()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
	

}
