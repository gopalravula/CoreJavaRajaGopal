package com.cisco.Clone;
//jvm is Cloneing we give the implementation //
				//Step :- 1 //
public class Employe  extends Object implements Cloneable
{

	
	private int eid;
	private String ename;
	private double esal;
	private String edesg;
	private depertment dep;
	
	
	public depertment getDep() {
		return dep;
	}
	public void setDep(depertment dep) {
		this.dep = dep;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getEsal() {
		return esal;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}
	public String getEdesg() {
		return edesg;
	}
	public void setEdesg(String edesg) {
		this.edesg = edesg;
	}


	public Employe(int eid, String ename, double esal, String edesg, depertment dep) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.edesg = edesg;
		this.dep = dep;
	}
	
	
	public Employe() {
		super();
		
	}
	
	
	//This Class is a sub Class Of Object Class //
	//You should be sub Class //
	
	//Step :- 2 //
	@Override
	 public Employe clone()
	 {
		//i taken Employe is null //
		Employe Emp = null; 
		
		 try {
				 //jvm it is Cloning and giving in the form of Objects. //
				 Emp =	(Employe) super.clone();
				 
				 //Now i am adding for deep Clonning for this line /
			 
				 		depertment k = Emp.getDep();
				 
				 		depertment dep = k.clone();
				 
				 //Passing this department Clone to Employe Object //
				 		Emp.setDep(dep);
			 
	 		} 
		 catch (CloneNotSupportedException e)
			 {
				e.printStackTrace();
			 }
		 
		 return Emp;
	 }

	
	
	
	
}
