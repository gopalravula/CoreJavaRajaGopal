package com.Annotation.AnnRelations;

import java.util.List;

import org.hibernate.validator.constraints.Range;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name ="Person")
public class PersonEntity
{
	@Id
	private int pid;
	private String pname;
	@Range(min=10,max=60)
	private int page;
	private String pqual;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="fkpasid")
	private PassportEntity passenty;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="fkperid")
	private List<MobileEntity> mob;

	
	 @ManyToMany(cascade = CascadeType.ALL)
	    @JoinTable(
	        name = "percou",
	        joinColumns = @JoinColumn(name = "fkpid"),
	        inverseJoinColumns = @JoinColumn(name = "fkcid")
	    )
	private List<CourseEntity> cou;

	 
	 
	 

	public int getPid()
	{
		return pid;
	}


	public void setPid(int pid)
	{
		this.pid = pid;
	}


	public String getPname()
	{
		return pname;
	}


	public void setPname(String pname)
	{
		this.pname = pname;
	}


	public int getPage()
	{
		return page;
	}


	public void setPage(int page)
	{
		this.page = page;
	}


	public String getPqual()
	{
		return pqual;
	}


	public void setPqual(String pqual)
	{
		this.pqual = pqual;
	}


	public PassportEntity getPassenty()
	{
		return passenty;
	}


	public void setPassenty(PassportEntity passenty)
	{
		this.passenty = passenty;
	}


	public List<MobileEntity> getMob()
	{
		return mob;
	}


	public void setMob(List<MobileEntity> mob)
	{
		this.mob = mob;
	}


	public List<CourseEntity> getCou()
	{
		return cou;
	}


	public void setCou(List<CourseEntity> cou)
	{
		this.cou = cou;
	}


	
	@Override
	public String toString()
	{
		return "pid=" + pid + ", pname=" + pname + ", page=" + page + ", pqual=" + pqual + ", passenty="
				+ passenty + ", mob=" + mob + ", cou=" + cou ;
	}


	
	
	public PersonEntity(int pid, String pname, int page, String pqual, PassportEntity passenty, List<MobileEntity> mob,
			List<CourseEntity> cou)
	{
		super();
		this.pid = pid;
		this.pname = pname;
		this.page = page;
		this.pqual = pqual;
		this.passenty = passenty;
		this.mob = mob;
		this.cou = cou;
	}


	public PersonEntity()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
	
}
