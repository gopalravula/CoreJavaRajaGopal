package com.cisco.Supplierr;

import java.util.function.Supplier;

public class Testinggg
{

	public static void main(String[] args)
	{
		
		//Anonymous Class //
		Supplier<employe> a1 = new Supplier<employe>()
		{
			
			@Override
			public employe get()
			{
				employe e = new employe();
				
				e.setEid(1);
				e.setEname("Birava");
				e.setEsal(56.67);
				e.setEdesg("dev");
				
				return e;
			}
		};
		
			employe ee	=	a1.get();
			System.out.println(ee);
			
			System.out.println("-------------------");
			
			
		//Lamuda Expressions //
		Supplier<employe> a2 = () -> 
		{
			
			employe e = new employe();
			
			e.setEid(1);
			e.setEname("Birava");
			e.setEsal(56.67);
			e.setEdesg("dev");
			
			return e;
			
		};
		
			employe	ff=	a2.get();
			System.out.println(ff);
			
			System.out.println("-------------------");
			
			// Method References //
		Supplier<employe> a3 = implementingg :: gettting;
					employe gg	=	a3.get();
					
					System.out.println(gg);
					
					System.out.println("-------------------");
	}

}
