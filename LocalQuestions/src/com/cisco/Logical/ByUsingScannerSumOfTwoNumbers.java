package com.cisco.Logical;

import java.util.Scanner;

public class ByUsingScannerSumOfTwoNumbers
{

	
	public static void main(String[] args)
	{
		// We create a Scanner Class.//
		Scanner sc = new Scanner(System.in);
		
		//Now i will add One Number
		System.out.println("Please Enter the First Number :- ");
		int a = sc.nextInt();
		
		//Now i will add Second Number
		System.out.println("Plese Enter the Second Number :- ");
		int b = sc.nextInt();
		
		//Now i will add Both Numbers. //
		int c =a+b;
		
		System.out.println("The Total Number is :- "+c);
		
		// It will Be Closed
		sc.close();
	}


}
