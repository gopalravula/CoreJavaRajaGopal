package com.cisco;

import javax.annotation.PostConstruct;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;
@Component
public class Dao implements
BeanNameAware ,
BeanFactoryAware,
ApplicationContextAware,
InitializingBean
 //BeanPostProcessor
{
    
    
    public Dao()
    {
	// First Default constector it will be create //
	System.out.println("------------This is Bean Creation  Constrector = 1  ----------- ");
    }
    
    
    
    @Autowired
    public void setJntemp(NamedParameterJdbcTemplate jntemp)
    {
	// This is Second Dependency will be Active it self //
	System.out.println("-----The Second Setter Dependecy will be injected = 2 ------------");
        this.jntemp = jntemp;
    }

    
    
    @Override
    public void setBeanName(String arg0)
    {
	//Three  it will be Create a Bean Name. //
	System.out.println("Bean Name is = This is  3  =="+arg0);
    }
    
    
    

    @Override
    public void setBeanFactory(BeanFactory arg0) throws BeansException
    {
	// Fourth it will be Create a Bean Factory Name . //
	System.out.println("Bean Factory name ----4 ---"+arg0);
	
    }
    

    

    @Override
    public void setApplicationContext(ApplicationContext arg0) throws BeansException
    {
	//Fifth it will be create a Application Context Name. //
	System.out.println("Application Context Name ---- 5 ----"+arg0);
	
    }
    
    
    
    @PostConstruct
    public void ourInit()
    {
	// Sixth it will be calling the init . //
	System.out.println("OurInit --  6 -- it is calling the init ");
    }

    

    
    @Override
    public void afterPropertiesSet() throws Exception
    {
	// it is setting Properties after setting . //
	System.out.println("afterPropertiesSet -- 7 -- ");
	
    }
    
    
//    // After Calling the init method. //
//    @Override
//    public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException
//    {
//	System.out.println("postProcessAfterInitialization-----*****="+arg1);
//	return arg0;
//    }
//
//
//    // Before calling the init method . //
//    @Override
//    public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException
//    {
//	System.out.println("postProcessBeforeInitialization------****="+arg1);
//	return arg0;
//    }

    
    
  
    private NamedParameterJdbcTemplate jntemp;
    
    
    

    public EmployePojo getbyid(int eid)
    {
	
	System.out.println("this is Dao Class ---"+eid);
	
	
	EmployePojo e = new EmployePojo();
	e.setEid(eid);
	
	SqlParameterSource ss = new BeanPropertySqlParameterSource(e);
	
	EmployePojo emp	=
		jntemp.queryForObject("select * from gopal.employe where eid =:eid;", ss, new BeanPropertyRowMapper<EmployePojo>(EmployePojo.class));
	
		System.out.println(emp);
	return emp;
    }





   



   






   

}
