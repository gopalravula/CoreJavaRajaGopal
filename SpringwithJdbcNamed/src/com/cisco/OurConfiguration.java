package com.cisco;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

@Configuration
@ComponentScan("com.cisco")
public class OurConfiguration {

	
	
	@Bean
	public DataSource datasource()
	{
		BasicDataSource ba = new BasicDataSource();
		
		ba.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ba.setUrl("jdbc:mysql://localhost:3306/gopal");
		ba.setUsername("root");
		ba.setPassword("root");
		
		return ba;
	}
	
	@Bean
	public JdbcTemplate jtemp()
	{
		return new JdbcTemplate(datasource());
	}
	
	@Bean
	public NamedParameterJdbcTemplate njtemp()
	{
		NamedParameterJdbcTemplate a = new NamedParameterJdbcTemplate(datasource());
		
		return a;
	}
}
