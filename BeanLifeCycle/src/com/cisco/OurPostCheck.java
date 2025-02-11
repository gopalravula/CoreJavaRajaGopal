package com.cisco;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class OurPostCheck implements BeanPostProcessor
{

    // After Calling the init method. //
    @Override
    public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException
    {
	System.out.println("postProcessAfterInitialization-----*****="+arg1);
	return arg0;
    }


    // Before calling the init method . //
    @Override
    public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException
    {
	System.out.println("postProcessBeforeInitialization------****="+arg1);
	return arg0;
    }


}
