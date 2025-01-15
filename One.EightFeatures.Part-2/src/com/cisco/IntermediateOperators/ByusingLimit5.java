package com.cisco.IntermediateOperators;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ByusingLimit5
{

	    public static void main(String[] args) 
	    {
	        Integer[] a = {10, 20, 30, 40, 50}; // Input array

	        List<Integer> data = Arrays.asList(a); // Convert array to list

	        // Consumer to print elements
	        Consumer<Integer> an1 = new Consumer<Integer>()
	        {
	            @Override
	            public void accept(Integer t) 
	            {
	                System.out.println(t);
	            }
	        };

	        // By Using Anonymous Class //
	        
	        // Use limit(3) to display only the first 3 elements
	        data.stream()
	            .limit(3) // Restricts the stream to the first 3 elements
	            .forEach(an1);
	        
	        
	        System.out.println("-------Anonymous-----------");
	        
	        
	       data.stream().limit(3).forEach((x)->{System.out.println(x);});
	       
	       
	       System.out.println("-------Lamuda Expressions-----------");
	       
	       
	       data.stream().limit(3).forEach(MethodReferenceWay1 :: getall);
	       
	       
	       System.out.println("-------By Using Method Refereneces-----------");
	        
	        
	        
	        
	    }
	}



