package com.cisco.Logical;

public class Factors
{
	
	public static void main(String[] args)
	{
		int num=12;
		
		int count=0;
		
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		
		
		if(count==2)
		{
			System.out.println("This is Prime");
		}
		else
		{
			System.out.println("This is Not Prime");
		}
	}

}
