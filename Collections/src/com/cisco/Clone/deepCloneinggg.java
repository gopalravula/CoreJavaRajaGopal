package com.cisco.Clone;

public class deepCloneinggg {

	
	public static void main(String[] args) {
		
		
		
		Employe e = new Employe();
		
		e.setEid(1);
		e.setEname("Birava");
		e.setEsal(34.45);
		e.setEdesg("se");
		
		depertment  d = new depertment();
		
		d.setDid(101); d.setDloc("hyd");
		
		//it take department Object //
		e.setDep(d);
		
		//Original Objects //
		System.out.println("Original Object address="+e);
		System.out.println("Original Object Values="+e.getEid()+"----"+e.getEname()
											+"----"+e.getEsal()+"----"+e.getEdesg()
											+"-----"+e.getDep().getDid()+"-----"+e.getDep().getDloc());
		
		System.out.println("Depertment Object Original="+e.getDep());
		
		System.out.println("---------------------------------");
		
		
		//Cloneed Objects //
		
		Employe e1 = (Employe) e.clone();
		
		
		System.out.println("Clone Address ="+e1);
		//What ever Changes we done it does"t reflect to Original Object //
		System.out.println("Clone Object Values="+e1.getEid()+"----"+e1.getEname()
													+"----"+e1.getEsal()+"----"+e1.getEdesg()
													+"----"+e1.getDep().getDid()+"---"+e1.getDep().getDloc());
		
		System.out.println("Depertment Object Deep Clone="+e1.getDep());
		
		System.out.println("-----Changes made in Cloned Object-----");
		
		
		System.out.println("---------------------------------");
		
		//Changing Values is //
		e1.setEdesg("java");
		
		//Now i am changing the Cloneing in departrment Object //
		
		e1.getDep().setDloc("sed");
		
		
	
		
	System.out.println("-------After Changes ------");
	
	
	
	//This is Called shallow Clonning  Object Class methods Only give shallow Cloneing it doesn"t have deep cloneing //
	System.out.println("Original Object After Changes Values="+e.getEid()+"----"+e.getEname()
												+"----"+e.getEsal()+"----"+e.getEdesg()
												+"-----"+e.getDep().getDid()+"-----"+e.getDep().getDloc());
	
	
	
	System.out.println("Clone Object After Changes Values="+e1.getEid()+"----"+e1.getEname()
											+"----"+e1.getEsal()+"----"+e1.getEdesg()
											+"----"+e1.getDep().getDid()+"---"+e1.getDep().getDloc());

	
	
	
	System.out.println("---------------------------------");
	
	System.out.println("Depertment Object Original="+e.getDep());
	System.out.println("Depertment Object Deep Clone="+e1.getDep());
		
	}
}
