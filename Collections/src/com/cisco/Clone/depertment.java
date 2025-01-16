package com.cisco.Clone;

public class depertment implements Cloneable{
/* 
 * 		Interview Questions 
 * 
 *  	i)What is Clone ?
 *  	A)it making Exact copy of Object that is Clone.
 *  	How is ?
 *  	A)In Object Class we have method call clone if some bady calling that 
 *  		 method it will throw clone not found Exception.
 *  	-->which ever Object you want to Clone make that Class implements Clonable.
 *  	-->I want to Clone simple employe implements Clonable.
 *  	--> Overide Clonable Method.
 *  
 *  Q)Why should i Overide?
 *  A)it"s a protected method i am Overide that method i am Callig inside.Clone 
 *  	method it is gives shallow Cloneing.
 *  
 *  Q)What is shallow Clonnig ?
 *  A)Employe Class Consists of not Only values Other Class references also.those Object 
 *  	won"t clone by Object Class references so, i am Calling as Shallow Cloneing.
 *  
 *  Q)i will go to deep Cloneing ?
 *  A)i will make it seperately Clone and i will give it to the another Class and asign to
 *  	seperate Class we Can do n number of times.
 *  
 *  
 */
	
	private int did;
	private String dloc;
	
	
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDloc() {
		return dloc;
	}
	public void setDloc(String dloc) {
		this.dloc = dloc;
	}
	
	
	//Deep Cloning we Create a Clone Object in department.  //
	public depertment clone()
	{
		depertment dep = null;
		
		try {
			//Cloning the Department Object //
				dep = (depertment) super.clone();
			} 
		catch (CloneNotSupportedException e) 
			{
				e.printStackTrace();
			}
		
		return dep;
	}

	
	
	
	
}
