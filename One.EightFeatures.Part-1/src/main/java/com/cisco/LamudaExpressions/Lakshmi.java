package com.cisco.LamudaExpressions;

public class Lakshmi {

	public static void main(String[] args) {
		
		//Created a sub Class internally//
		//Created object for Class internally //
		//it Overide it self internally //
		//Here, we have to give Our Own implementation //
			//	method referenece      implementation   //
		I2 a = () -> {System.out.println("Hello");};	
		a.m1();
		
		
		I31 aha = (a1, b1) ->{return a1*b1;}; 
		int one = aha.mul(10, 5);
		System.out.println(one);
		
		
	}

}
