package com.cisco.TreeMapss;

import java.util.Objects;

public class Employee extends Object
	//implements Comparable<Employee> 
{

/*
	@Override
	public int compareTo(Employee e) 
	{
		return this.ename.compareTo(e.getEname());
	}
	*/
	
	private int eid;
	private String ename;
	private double esal;
	private String edesg;
	
	
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
	
	
	@Override
	public int hashCode() {
		return Objects.hash(edesg, eid, ename, esal);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(edesg, other.edesg) && eid == other.eid && Objects.equals(ename, other.ename)
				&& Double.doubleToLongBits(esal) == Double.doubleToLongBits(other.esal);
	}
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", edesg=" + edesg + "]";
	}
	
	
	public Employee(int eid, String ename, double esal, String edesg) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.edesg = edesg;
	}
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	protected void finalize() throws Throwable 
	{
		
		System.out.println("Object Eligible For Garbage Collector");
	}
	
	
	
	
}
