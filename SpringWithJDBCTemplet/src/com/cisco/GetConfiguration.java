package com.cisco;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@ComponentScan("com.cisco")
public class GetConfiguration {

	
	
	@Bean
	public DataSource datasource()
	{
		BasicDataSource bs = new BasicDataSource();
		
		bs.setDriverClassName("com.mysql.cj.jdbc.Driver");
		bs.setUrl("jdbc:mysql://localhost:3306/gopal");
		bs.setUsername("root");
		bs.setPassword("root");
		
		return bs;
	}
	
	
	@Bean
	public JdbcTemplate jtemp()
	{
		return new JdbcTemplate(datasource());
	}
}
