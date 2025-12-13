package com.cisco.Logical;

public class CountingAndReverse
{

	public static void main(String[] args)
	{
		// Step 1 :- it will Create An Empty Array //
		int[] arr = new int[6];
		
		System.out.println("This is Normal Order");
		
		// Step 2:- It will apply Conditions
		for(int i =0; i<=5; i++)
		{
			// Step 3:- Asaing Values to arr[i]

			arr[i]=i+1;
			
			// Step 4:- It will print Each One .//
			System.out.println(arr[i]);
		}
		
		System.out.println("This is Reverse Order");
		
	//	Step 5:- Giving Condition To Print Revese Order.
		for(int j=5; j>=0; j--)
		{
			// Step 6 :- Each One It will Be Print in Reverse Order
			System.out.println(arr[j]);
			
		}
	}
}
