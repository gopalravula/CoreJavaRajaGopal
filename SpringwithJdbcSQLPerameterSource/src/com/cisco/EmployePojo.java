package com.cisco;

public class EmployePojo {

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
	public String toString() {
		return "EmployePojo [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", edesg=" + edesg + "]";
	}
	
	
	public EmployePojo(int eid, String ename, double esal, String edesg) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.edesg = edesg;
	}
	
	
	public EmployePojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
	
}
