package com.cisco.Logical;

import java.util.Scanner;

public class ByUsingScannerInString
{

	public static void main(String[] args)
	{
		
		//Here we Taken Scanner Class. //
		Scanner sc = new Scanner(System.in);
		
		// We taken First Name .
		System.out.println("Please Enter the First Name :- ");
		String fname = sc.next();
		
		// We Taken Last Name .
		System.out.println("Please Enter the Second Name :- ");
		String lname = sc.next();
		
		// Full Name is 
		String fullname = fname+lname;
		
		System.out.println(fullname);
		
	}
	
}
