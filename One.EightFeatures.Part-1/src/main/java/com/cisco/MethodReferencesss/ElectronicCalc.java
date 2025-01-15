package com.cisco.MethodReferencesss;

public class ElectronicCalc 
{

	public static int findingfirst(int[] data)
	{
		int lnumber = data[0];
		
		for(int i =1; i<= data.length-1; i++)
		{
			if(data[0] >= data[i])
			{
				lnumber = data[i];
			}
		}
		
		return lnumber;
	}
	
	
	public static int findinglast(int[] data)
	{
		int lnumber = data[0];
		
		for(int i =1; i<= data.length-1; i++)
		{
			if(data[0] <= data[i])
			{
				lnumber = data[i];
			}
		}
		
		return lnumber;
	}
	
	
	
}
