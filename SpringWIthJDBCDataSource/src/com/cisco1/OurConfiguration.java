package com.cisco1;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.cisco1")
public class OurConfiguration {
	
	
	
	@Bean
	public DataSource dataSource()
	{
		BasicDataSource a = new BasicDataSource();
		
		
		a.setDriverClassName("com.mysql.cj.jdbc.Driver");
		a.setUrl("jdbc:mysql://localhost:3306/gopal");
		a.setUsername("root");
		a.setPassword("root");
		
		return a;
}

}