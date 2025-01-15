package com.cisco.ByUsingTerminalOperators;

import java.util.Comparator;

public class MethodReferenceWay1
{
	
	// By Using Predicate //
	public static boolean evennumber(int a)
	{
		if(a%2==0)
			return true;
		else
			return false;
	}
	
	
	
	
	
	
	
	
	// By Using Predicate //
	public static boolean oddnumber(int b)
	{
		if(b%2==0)
			return false;
		else
			return true;
	}
	
	
	
	//By using Consumer  //
	public static void getall(int a)
	{
		System.out.println("Even Number="+a);
	}

	
	
	// By using Functions //
	public static Integer squareAll(int c)
	{
		return c*c;
	}
	
	
	
	
}
