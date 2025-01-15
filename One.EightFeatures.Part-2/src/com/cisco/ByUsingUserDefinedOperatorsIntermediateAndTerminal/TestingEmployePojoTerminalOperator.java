package com.cisco.ByUsingUserDefinedOperatorsIntermediateAndTerminal;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestingEmployePojoTerminalOperator
{
	/* 
	 * 
	 * Intermediate :- Filter, Map, Sort, Distint, limit, Skip, Peek, Flatmap.
	 * Terminal Method :- 
	 * 	i)ForEach();
	 * 	ii)Collect
	 * 	iii)Count
	 * 	iv)AnyMatch(Predicate)
	 * 	v)AllMatch(Predicate)
	 * 	vi)NoneMatch(Predicate)
	 * 	vii)FindFirst()
	 * 	viii)FindAny()
	 * 	ix) Max(Comparator)
	 * 	X)Min(Comparator)
	 * 
	 */
	
	
	public static void main(String[] args)
	{
		
				EmployePojo e1 = new EmployePojo(1, "Birava", 23, 56.67, "se");
				EmployePojo e2 = new EmployePojo(2, "Siva", 24, 65.46, "dev");
				EmployePojo e3 = new EmployePojo(3, "Lakshmi", 25, 76.56, "aws");
				EmployePojo e4 = new EmployePojo(4, "Raju", 26, 86.56, "Testing");
				EmployePojo e5 = new EmployePojo(5, "Singh", 27, 96.45, "QA");
				EmployePojo e6 = new EmployePojo(6, "Devara", 28, 106.34, "DevOps");
				
				
				
				List<EmployePojo> data =	Arrays.asList(e1,e2,e3,e4,e5,e6);
				
				
				// By using Employe Pojo //
					data.stream().forEach((x)->{System.out.println(x);});
					
		System.out.println("-------------It is By Using For-Each Of data.---------------");
		
		
				
			List<EmployePojo> ldata	=	data.stream().collect(Collectors.toList());
			
			System.out.println(ldata);
			
		System.out.println("-------------It is By Using Collect Operator Of data.---------------");
		
	
	
					long cou = data.stream().count();
					
					System.out.println(cou);
					
	   System.out.println("-------------It is By Using count Operator Of data.---------------");
	   
	
	
			Optional<EmployePojo>	op	= data.stream().findFirst();
			
									
					if(op.isPresent())
						{
							
								EmployePojo ee = op.get();
								
								System.out.println(ee);
						}
					else
					{
						System.out.println("-----No data is Found ----");
					}
						
						
		System.out.println("--------------It is displaying The First One ------------------- ");
				
		
		
					boolean flage = data.stream().anyMatch((x)->{if(x.getEdesg().equals("dev")) return true; else return false;});
					
					System.out.println(flage);
					
					
					System.out.println("---------Checking the AnyMatch it is displayed or not -------");
					
					
					
				boolean flage1 = data.stream().allMatch((x)->{if(x.getEdesg().equals("dev")) return true; else return false;});
					
					System.out.println(flage1);
					
					
					System.out.println("---------Checking the AllMatch it is displayed or not -------");
					
					
					
			boolean flage2 = data.stream().noneMatch((x)->{if(x.getEdesg().equals("dev")) return true; else return false;});
					
					System.out.println(flage2);
					
					
					System.out.println("---------Checking the None-Match it is displayed or not -------");
					
					
			
		
		
	}

	
	
}
