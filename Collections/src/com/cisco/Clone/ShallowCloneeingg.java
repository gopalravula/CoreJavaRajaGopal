package com.cisco.Clone;


public class ShallowCloneeingg 
	{

		public static void main(String[] args) 
		{
		
				//Shallow Cloneing //
				Employe e = new Employe();
				
				e.setEid(1);
				e.setEname("Birava");
				e.setEsal(34.45);
				e.setEdesg("se");
				
				System.out.println("Original Object address="+e);
				System.out.println("Original Object Values="+e.getEid()+"----"+e.getEname()+"----"+e.getEsal()+"----"+e.getEdesg());
				

				
				System.out.println("---------------------------------");
				//System.out.println(e.getClass());
				
				//This employe Class clone is Calling Object Class Clone.//
				
				Employe e1 = (Employe) e.clone();
				System.out.println("Clone Address ="+e1);
				//What ever Changes we done it does"t reflect to Original Object //
				System.out.println("Clone Object Values="+e1.getEid()+"----"+e1.getEname()+"----"+e1.getEsal()+"----"+e1.getEdesg());
				
	
				
				System.out.println("-----Changes made in Cloned Object-----");
				
				//Changing Values is :-- //
					e1.setEdesg("java");
				
				System.out.println("After Changes ------------------------");
				
				//This is Called shallow Clonning  Object Class methods Only give shallow Cloneing it doesn"t have deep cloneing //
				System.out.println("Original Object Values="+e.getEid()+"----"+e.getEname()+"----"+e.getEsal()+"----"+e.getEdesg());
				
				
				System.out.println("Clone Object Values="+e1.getEid()+"----"+e1.getEname()+"----"+e1.getEsal()+"----"+e1.getEdesg());

				
				
				
				
	}

}
