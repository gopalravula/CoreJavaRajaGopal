package com.cisco.Logical;

import java.util.Scanner;

public class SwappingTwoNumberswithThreadVariable
{

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("The First Number is :- ");
		
		int a = sc.nextInt();
		
		
		System.out.println("The Second Number is :- ");
		
		int b = sc.nextInt();
		
		
		System.out.println("Before swapping of a is :- "+a+"  and b is :-  "+b);
		
		
		
		int temp = a;  // temp =5 and a = 5
		
		a=b; // a=10 and b =10
		
		b = temp; // temp =5 and b=5
		
		
		System.out.println("After Swapping of a is :-  "+a+ "  and b is :- "+b );
		
		

	}

}
