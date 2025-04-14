package com.Annotation.AnnRelations;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name ="Passport")
public class PassportEntity
{

	@Id
	private int passid;
	private String passnum;
	@NotNull
	@NotBlank
	@NotEmpty
	private String pexpydate;
	
	
	public int getPassid()
	{
		return passid;
	}
	public void setPassid(int passid)
	{
		this.passid = passid;
	}
	public String getPassnum()
	{
		return passnum;
	}
	public void setPassnum(String passnum)
	{
		this.passnum = passnum;
	}
	public String getPexpydate()
	{
		return pexpydate;
	}
	public void setPexpydate(String pexpydate)
	{
		this.pexpydate = pexpydate;
	}
	@Override
	public String toString()
	{
		return "PassportEntity [passid=" + passid + ", passnum=" + passnum + ", pexpydate=" + pexpydate + "]";
	}
	public PassportEntity(int passid, String passnum, String pexpydate)
	{
		super();
		this.passid = passid;
		this.passnum = passnum;
		this.pexpydate = pexpydate;
	}
	public PassportEntity()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
