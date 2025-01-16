package com.cisco.GarbageCollectosMain;

public class TestinfFinalise {

	/*
	 * What is finalize method will do ?
	 * A) Every time one object is creating it calls the finalize method before
	 * 		making chose to garbage Collector.
	 * 
	 * @Deprecated(since="9", forRemoval=true)
    	protected void finalize() throws Throwable { }
    
    	-> Cleanning the un-refrenced Objects.
    			i)null.
    			ii)making changes in references.
    			iii)Cyclic reference.
    			iv)method task is Completed The Object defaults ly Calls Garbage Colector.
    			main One when ever it is deleting it calls finalize method in Object class.
	 */
	public void m1()
	{
		
		employe e = new employe();
		//before method call this Object is Eliguble for gc();
		e = null;
		
	}
	
	public static void main(String[] args) {
		
		
		System.out.println("---- i am Testing Class---");
		
		//employe e1 = new employe();
		//employe e2 = new employe();
		
		//nullifying it //
		//e1= null;
		
		//e1=e2=null;
		TestinfFinalise e = new TestinfFinalise();
		
		e.m1();
		
		System.out.println("--After the method Call is Completed");
		
		System.out.println();
		System.gc();
		
		for(int i =1; i<= 100; i++)
		{
			
		}
		
		System.out.println("---Ended----");
		

	}

}
