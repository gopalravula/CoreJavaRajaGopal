package com.cisco;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.cisco")
public class ourConfiguration {

	
	@Bean
	public String name()
	{
		String a = new String("Slokam Technologyes");
		
		return a;
	}
	
	
	
	@Bean
	public String nameone()
	{
		
		String a = new String("SR Nagar");
		
		return a;
	}
	
	
	// We can give name means we want to call with that bean name Only. //
	@Bean(name ="One")
	public List<String> ArrayOne()
	{
		ArrayList<String> a = new ArrayList<>();
		
		a.add("Siva");
		a.add("Lakshmi");
		a.add("Birava");
		
		return a;
	}
	
	
	@Bean(name ="two")
	public List<String> ArrayTwo()
	{
		ArrayList<String> b = new ArrayList<>();
		
		b.add("One");
		b.add("Two ");
		b.add("Three");
		
		return b;
	}
	
	
	@Bean
	public Manager manager()
	{
		return new Manager();
	}
	
	
	
	@Bean
	public Teamlead teamlead()
	{
		return new Teamlead();
	}
	
	
	
	@Bean
	public Devloper devloper()
	{
		return new Devloper();
	}
	
	
	
	
}
