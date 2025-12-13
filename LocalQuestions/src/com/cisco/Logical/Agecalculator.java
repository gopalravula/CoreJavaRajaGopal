package com.cisco.Logical;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Agecalculator
{
	
	public static void main(String[] args)
	{
		// Taken Object Of Scanner Class
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter the DOB (yyyy-mm-dd);");
		
		// Type it On Console. //
		String Input = sc.nextLine();
		
		// Here Given the Console it will Convert To Local date. //
		LocalDate  dob = LocalDate.parse(Input);
		
		// It will display the Corrent Date. //
		LocalDate present = LocalDate.now();
		
		// It will be Calculate the Age
		Period	age = Period.between(dob, present);
		
		
		//Here, The dates Will be Display 
		
		System.out.println(age.getYears()+"  Years  "+
							age.getMonths()+"  Months  "+
							age.getDays()+"  Days ");
		
	}

	
}
