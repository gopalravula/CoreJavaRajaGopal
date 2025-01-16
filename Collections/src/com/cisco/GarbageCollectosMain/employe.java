package com.cisco.GarbageCollectosMain;

public class employe  extends Object
{
	
	/*
	 * Garbage Collector it will do un-necessary things it will do.
	 * 
	 */
	
	private int eid;
	private String ename;
	private int eage;
	
	
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
	public int getEage() {
		return eage;
	}
	public void setEage(int eage) {
		this.eage = eage;
	}
	
	
	@Override
	public String toString() {
		return "employe [eid=" + eid + ", ename=" + ename + ", eage=" + eage + "]";
	}
	public employe() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public employe(int eid, String ename, int eage) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eage = eage;
	}
	
	@Override
	@Deprecated(since="9", forRemoval=true)
    protected void finalize() throws Throwable 
	{
		
		System.out.println("---Hi some body invoked Garbage Collector---");
	}

}
