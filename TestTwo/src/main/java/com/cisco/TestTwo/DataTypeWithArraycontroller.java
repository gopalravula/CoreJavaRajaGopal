package com.cisco.TestTwo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ArrayObject")
public class DataTypeWithArraycontroller
{
	
	//   http://localhost:8080/ArrayObject/Getnames
	@RequestMapping("Getnames")
	public String[] getnames()
	{
		System.out.println("The String[] Names ");
		String[]  a = {"Anji,Birava,Shiva,Lakshmi"};
		return a;
	}
	
	
	
	
	//  http://localhost:8080/ArrayObject/Getid
	@RequestMapping("Getid")
	public Integer[] getids()
	{
		
		System.out.println("This is Integer[] ids");
		Integer[] a = {45,67,78};
		return a;
	}
	
	
	
	//  http://localhost:8080/ArrayObject/GetMarks
	@RequestMapping("GetMarks")
	public Double[]  GetMarks()
	{
		System.out.println("this is Double[] marks");
		
		Double[] a = {78.89,56.78,34.56};
		return a;
	}

}
