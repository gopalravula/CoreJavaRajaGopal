package com.cisco.TestTwo;

import java.util.Objects;

public class DeportmentPojo
{

	private int did;
	private String dname;
	private String dloc;
	
	
	public int getDid()
	{
		return did;
	}
	public void setDid(int did)
	{
		this.did = did;
	}
	public String getDname()
	{
		return dname;
	}
	public void setDname(String dname)
	{
		this.dname = dname;
	}
	public String getDloc()
	{
		return dloc;
	}
	public void setDloc(String dloc)
	{
		this.dloc = dloc;
	}
	
	
	@Override
	public int hashCode()
	{
		return Objects.hash(did, dloc, dname);
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
		DeportmentPojo other = (DeportmentPojo) obj;
		return did == other.did && Objects.equals(dloc, other.dloc) && Objects.equals(dname, other.dname);
	}
	
	
	public DeportmentPojo(int did, String dname, String dloc)
	{
		super();
		this.did = did;
		this.dname = dname;
		this.dloc = dloc;
	}
	public DeportmentPojo()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
}
