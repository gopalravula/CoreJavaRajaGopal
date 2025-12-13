package com.cisco.Logical;

public class CountingNumbers
{

	
	public static void mainTotalSum(String[] args)
	{
		int arr[] = {10,12,14,16,19,65,70,75,80};
		
		int total =0;
		
		for(int i=0;i<=arr.length-1;i++)
		{
			
			total=total+arr[i];
			
		}
		//Total Sum
		System.out.println("The Total sum is = "+total);
		
		// Average
		System.out.println("Average is ="+total/arr.length);
	}
	
	public static void mainBothEven(String[] args)
	{
		int arr[] = {10,12,14,16,19,65,70,75,80};
		
		int count =0;
		
		for(int i=0; i<=arr.length-1;i++)
		{
			// it is Showing that Both Conditions are Even.
			if(arr[i]%2==0 && i%2==0)
			{
				System.out.println(i+":"+arr[i]);
				count++;
			}	
		}
		
		System.out.println("Total Count : "+count);
	}
	
	public static void mainEven(String[] args)
	{
		int arr[] = {10,12,14,16,19,65,70,75,80};
		
		int count=0;
		
		
		for(int i=0;i<=arr.length-1;i++)
		{
			// This is Logic and it is Showing Even Number. //
			if(arr[i]%2==0)
			{
				// it is Showing the Total Count. //
				count++;
				//System.out.println(i+":"+arr[i]);
			}
		}
		
		System.out.println(count);
		
		
	}
	
	public static void mainCondition(String[] args)
	{
		int arr[] = {10,20,30,40,50,60,65,70,75,80};
		
		int count =0;
		for(int i=0; i<=arr.length-1; i++)
		{
			// This is Logic 
			if(arr[i]>=60)
			{
				count++;
			}	
		}
		System.out.println(count);
	}
	
	
	public static void mainCount(String[] args)
	{
		// We taken an Array
		int arr[] = {10,20,30,40,50,60,65,70,75,80};
		
		// Count taken 0
		int count =0;
		
		// itterating Purpuse we Taken
		for(int i=0; i<=arr.length-1;i++)
		{
			count++;
		}
		
		System.out.println(count);
	}
}
