package com.cisco.Threaddes;

public class Testingg  implements Runnable
{

	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
	
	
	public static void main(String[] args)
	{
		
		
		Thread t1 = new Thread(new Runnable()
		{
			
			@Override
			public void run()
			{
				System.out.println(Thread.currentThread().getName());
				
			}
		});	
		
		t1.start();
		
		
		Runnable t = new Testingg();
		
		Thread th = new Thread(t);
		
		th.start();
		
		
		Runnable R1 = () -> {System.out.println(Thread.currentThread().getName());};
		
		Thread t2 = new Thread(R1);
		
		t2.start();
		
		

	}

}
