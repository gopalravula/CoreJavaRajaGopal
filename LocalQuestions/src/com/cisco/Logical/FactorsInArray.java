package com.cisco.Logical;

public class FactorsInArray
{
   public static void main(String[] args)
   {
	// Taken One Array
	   int arr[] = {1,2,3,4,5};

	   
	   int primecount=0;
	   
	   
	   // Iterating array
	   for(int j = 0; j < arr.length; j++)
	   {
	       int count = 0;
	       
	       

	       // Checking factors
	       for(int i = 1; i <= arr[j]; i++)
	       {
	           if(arr[j] % i == 0)
	           {
	               count++;
	           }
	       }

	       // Prime check
	       if(count == 2)
	       {
	    	   
	    	   primecount++;
	           System.out.println(arr[j] + " : This is Prime Number");
	       }
	       else
	       {
	           System.out.println(arr[j] + " : This is Not a Prime Number");
	       }
	       
	       
	   }
	   
	   System.out.println("The prime Count is = "+primecount);
   }
}
