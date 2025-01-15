package com.cisco.IntermediateOperators;

public class MethodReferenceWay1
{
	
	
	public static boolean evennumber(int a)
	{
		if(a%2==0)
			return true;
		else
			return false;
	}
	
	
	public static boolean oddnumber(int b)
	{
		if(b%2==0)
			return false;
		else
			return true;
	}
	
	
	public static void getall(int a)
	{
		System.out.println("Even Number="+a);
	}

	
	public static Integer squareAll(int c)
	{
		return c*c;
	}
	
	
	
	
}
