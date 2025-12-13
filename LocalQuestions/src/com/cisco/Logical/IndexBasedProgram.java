package com.cisco.Logical;

public class IndexBasedProgram
{
	
	public static void main(String[] args)
	{
		int arr[]= {1,2,3,5,6,7,8,10,12};
		
		
		for(int i=0;i<=arr.length-1;i++)
		{
			// This is Logic  and The Condition. //
			if(i%2==0 && arr[i]%2==0)
				System.err.println(i+":"+arr[i]);
		}
	}

}
