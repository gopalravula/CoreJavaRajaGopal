package com.One.RelationByPojo;

public class PassportPojo
{
	
	private int passid;
	private String passnumb;
	private int passexpdate;
	
	
	public int getPassid()
	{
		return passid;
	}
	public void setPassid(int passid)
	{
		this.passid = passid;
	}
	public String getPassnumb()
	{
		return passnumb;
	}
	public void setPassnumb(String passnumb)
	{
		this.passnumb = passnumb;
	}
	public int getPassexpdate()
	{
		return passexpdate;
	}
	public void setPassexpdate(int passexpdate)
	{
		this.passexpdate = passexpdate;
	}
	
	
	@Override
	public String toString()
	{
		return "passid=" + passid + ", passnumb=" + passnumb + ", passexpdate=" + passexpdate ;
	}
	public PassportPojo(int passid, String passnumb, int passexpdate)
	{
		super();
		this.passid = passid;
		this.passnumb = passnumb;
		this.passexpdate = passexpdate;
	}
	public PassportPojo()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
