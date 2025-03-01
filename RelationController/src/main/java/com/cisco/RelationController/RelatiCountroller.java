package com.cisco.RelationController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("relation")
public class RelatiCountroller
{
	
	
	@RequestMapping("GetPerson")
	public PersonPojo getPerson()
	{
	// Only Person . //
		PersonPojo poj = new PersonPojo();
		
		poj.setPid(1);
		poj.setPname("Birava");
		poj.setPage(23);
		poj.setPqual("JavaDevloper");
		
		System.out.println(poj);
		return poj;
	}
	
	
	
	@RequestMapping("GetPassport")
	public PersonPojo GetpersonAndPassport()
	{
		// One To One
		
		PersonPojo poj = new PersonPojo();
		poj.setPid(1);
		poj.setPname("Shiva");
		poj.setPage(34);
		poj.setPqual("SQLDevloper");
		
		PassportPojo p = new PassportPojo();
		p.setPassid(101);
		p.setPassnumb("ABCDE1234R");
		p.setPassexpdate(2025);
		
		poj.setPt(p);
		
		System.out.println(poj);
		return poj;
	}
	
	
	@RequestMapping("GetMobile")
	public PersonPojo getPersonAndMobile()
	{
		// One To Many 
		
		PersonPojo poj = new PersonPojo();
		
		poj.setPid(1);
		poj.setPname("Birava");
		poj.setPage(34);
		poj.setPqual("NetDevloper");
		
		List<MobilePojo> mob = new ArrayList<>();
		
		mob.add(new MobilePojo(10001, 8976643210L, "Aritel"));
		mob.add(new MobilePojo(10002, 6976643450L, "BSNL"));
		mob.add(new MobilePojo(10003, 3976643210L, "JIO"));
		
		poj.setMob(mob);
		
		System.out.println(poj);
		
		return poj;
	}
	
	
	
	@RequestMapping("GetAllOperations")
	public PersonPojo AllOperations()
	{
		// All Operations //
		
		PersonPojo poj = new PersonPojo();
		poj.setPid(1);
		poj.setPname("Birava");
		poj.setPage(23);
		poj.setPqual("JavaDevloper");
		
		PassportPojo pass = new PassportPojo();
		pass.setPassid(121);
		pass.setPassnumb("12345ABCDRR");
		pass.setPassexpdate(2027);
		
		poj.setPt(pass);
		
		List<MobilePojo> mob = new ArrayList<>();
		
		mob.add(new MobilePojo(111, 345678902L, "Aritel"));
		mob.add(new MobilePojo(112, 435678902L, "JIO"));
		mob.add(new MobilePojo(113, 675678902L, "BSNL"));
		
		poj.setMob(mob);
		
		List<Course> cou = new ArrayList<>();
		
		cou.add(new Course(131, "Java", 5000.00));
		cou.add(new Course(132, "Python", 6000.00));
		cou.add(new Course(133, "SQLDevloper", 7000.00));
		
		poj.setCourse(cou);
		System.out.println(poj);
		
		return poj;
	}

}
