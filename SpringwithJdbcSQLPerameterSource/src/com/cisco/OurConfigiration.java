package com.cisco;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

@Configuration
@ComponentScan("com.cisco")
public class OurConfigiration {
	
	
	
	@Bean
	public DataSource dataSource()
	{
		
		BasicDataSource bs = new BasicDataSource();
		
		bs.setDriverClassName("com.mysql.cj.jdbc.Driver");
		bs.setUrl("jdbc:mysql://localhost:3306/gopal");
		bs.setUsername("root");
		bs.setPassword("root");
		return bs;
	}
	
	
	
	@Bean
	public NamedParameterJdbcTemplate  namedParameterJdbcTemplate()
	{
		NamedParameterJdbcTemplate a = new NamedParameterJdbcTemplate(dataSource());
		return a;
	}
	

}
