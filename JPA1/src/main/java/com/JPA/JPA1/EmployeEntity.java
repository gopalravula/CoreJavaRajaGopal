package com.JPA.JPA1;

import java.sql.Date;

import org.hibernate.validator.constraints.Range;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Pattern;

@Entity
public class EmployeEntity
{
	@Id
	private int eid;
	@Nonnull
	@NotEmpty
	private String ename;
	
	@Range(min = 10000, max = 1000000)
	private double esal;
	@NotBlank
	private String edesg;
	@NotEmpty
	private String eloc;
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
	private Date doj;
	@Future
	private Date doexpy;
	
	
	
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
	public String getEloc()
	{
		return eloc;
	}
	public void setEloc(String eloc)
	{
		this.eloc = eloc;
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
	public Date getDoj()
	{
		return doj;
	}
	public void setDoj(Date doj)
	{
		this.doj = doj;
	}
	public Date getDoexpy()
	{
		return doexpy;
	}
	public void setDoexpy(Date doexpy)
	{
		this.doexpy = doexpy;
	}
	
	
	@Override
	public String toString()
	{
		return "eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", edesg=" + edesg + ", eloc="
				+ eloc + ", epan=" + epan + ", email=" + email + ", dob=" + dob + ", doj=" + doj + ", doexpy=" + doexpy
				;
	}
	
	
	
	public EmployeEntity(int eid, String ename, double esal, String edesg, String eloc, String epan, String email,
			Date dob, Date doj, Date doexpy)
	{
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.edesg = edesg;
		this.eloc = eloc;
		this.epan = epan;
		this.email = email;
		this.dob = dob;
		this.doj = doj;
		this.doexpy = doexpy;
	}
	
	
	public EmployeEntity()
	{
		super();
	}
	
	
	
	
	
	
}
