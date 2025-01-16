package com.cisco.GarbageCollectosMain;

public class Testing {

	/*
	 * Garbage Collector it will do un-necessary things it will do.
	 * -->Main thread is created by jvm it will start when the application is created.
	 * ->Garbage Collector is also One Thread it will run On the BackGround.
	 * --> how it identify when ever Object is there is doesn"t refer any thing it will remove immediately remove data.
	 * i)nullifying the reference.
	 * ii)
	 */
	
	
	public void m1()
	{
		
		
	}
	public static void main(String[] args) {
	
		
		/*
		employe e = new employe();
		-> it is un-referenced Objects 
		e=null; */
		
		
		//----------------------------------------------------//
		
		
		//These is way Two this is Cyclic refrence. //
		employe e1 = new employe();
		employe e2 = new employe();
		employe e3 = new employe();
		
			System.out.println("1St Object Address="+e1.hashCode());
			System.out.println("2nd Object Address="+e2.hashCode());
			System.out.println("3rd Object Address="+e3.hashCode());
			
			System.out.println("---------------------------");
			e1 =e2=e3;
			//Every One is refering to e3 Only.
			System.out.println("1St Object Address="+e1.hashCode());
			System.out.println("2nd Object Address="+e2.hashCode());
			System.out.println("3rd Object Address="+e3.hashCode());

	}

}
