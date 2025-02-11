package com.cisco;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

@Configuration
@ComponentScan("com.cisco")
public class OurConfiguration
{
    
    
    
    @Bean
    public DataSource dataSource()
    {
	BasicDataSource b = new BasicDataSource();
	
	b.setDriverClassName("com.mysql.cj.jdbc.Driver");
	b.setUrl("jdbc:mysql://localhost:3306/gopal");
	b.setUsername("root");
	b.setPassword("root");
	
	return b;
    }
    
    
    
    @Bean
    public NamedParameterJdbcTemplate namedParameterJdbcTemplate()
    {
	
	NamedParameterJdbcTemplate a = new NamedParameterJdbcTemplate(dataSource());
	
	return a;
    }
    

}
