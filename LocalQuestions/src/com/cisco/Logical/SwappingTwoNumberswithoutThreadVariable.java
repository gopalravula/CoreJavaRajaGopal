package com.cisco.Logical;

import java.util.Scanner;

public class SwappingTwoNumberswithoutThreadVariable
{

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter the First Number :- ");
		
		int a = sc.nextInt();
		
		
		System.out.println("Please Enter the Second Number :- ");
		
		int b = sc.nextInt();
		
		
		System.out.println("Before Swapping A  = "+a+" and B = "+b);
		
		
		a = a+b; // a=30, b=20;
		
		b = a-b; // a=30, b=10;
		
		a = a-b; // a=20, b=10;
		
		
		System.out.println("After Swapping  A = "+a+" and B = "+b);
		
		

	}

}
