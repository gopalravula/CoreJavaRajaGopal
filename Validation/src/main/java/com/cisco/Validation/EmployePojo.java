package com.cisco.Validation;

import java.sql.Date;

import org.hibernate.validator.constraints.Range;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Pattern;

public class EmployePojo
{

	@NotNull
	private int eid;
	
	@NotNull
	@NotEmpty
	@NotBlank
	private String ename;
	
	@Min(21)
	private int eage;
	
	@Range(min = 1000, max = 20000)
	private double esal;
	
	@NotBlank
	private String edesg;
	
	  
	@Pattern(
				regexp = "[A-Z]{5}[0-9]{4}[A-Z]{1}",
				message = "Invalid PAN Card format"
			)
	private String epan;
	
	@Pattern( regexp = "^[A-Za-z0-9._%+-]+@gmail\\.com$", 
	          message = "Invalid Gmail address. Please enter a valid Gmail ID."
	         )
	private String email;
	
	@Past
	private Date dob;
	
	@PastOrPresent
	private Date Jdate;
	
	@Future
	private Date edate;
	
	
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
	public int getEage()
	{
		return eage;
	}
	public void setEage(int eage)
	{
		this.eage = eage;
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
	public String getEpan()
	{
		return epan;
	}
	public void setEpan(String epan)
	{
		this.epan = epan;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public Date getDob()
	{
		return dob;
	}
	public void setDob(Date dob)
	{
		this.dob = dob;
	}
	public Date getJdate()
	{
		return Jdate;
	}
	public void setJdate(Date jdate)
	{
		Jdate = jdate;
	}
	public Date getEdate()
	{
		return edate;
	}
	public void setEdate(Date edate)
	{
		this.edate = edate;
	}
	
	
	@Override
	public String toString()
	{
		return "EmployePojo [eid=" + eid + ", ename=" + ename + ", eage=" + eage + ", esal=" + esal + ", edesg=" + edesg
				+ ", epan=" + epan + ", email=" + email + ", dob=" + dob + ", Jdate=" + Jdate + ", edate=" + edate
				+ "]";
	}
	
	
	public EmployePojo(int eid, String ename, int eage, double esal, String edesg, String epan, String email, Date dob,
			Date jdate, Date edate)
	{
		super();
		this.eid = eid;
		this.ename = ename;
		this.eage = eage;
		this.esal = esal;
		this.edesg = edesg;
		this.epan = epan;
		this.email = email;
		this.dob = dob;
		Jdate = jdate;
		this.edate = edate;
	}
	
	public EmployePojo()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
	
	
}
