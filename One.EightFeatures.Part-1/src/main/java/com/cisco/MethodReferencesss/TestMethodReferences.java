package com.cisco.MethodReferencesss;

public class TestMethodReferences
{

	public static void main(String[] args)
	{
		System.out.println("------Started------");
		
		int[] data = {23,2,45,4,1,34};
		//it creating a sub Class Object ac //
		//it is Overide the findleast method //
		
		interfacess a = ElectronicCalc :: findinglast;
		
		int aha =a.Findleast(data);
		
		System.out.println(aha);
		System.out.println("-------Ended-------");
		
		
		 
		

	}

}
