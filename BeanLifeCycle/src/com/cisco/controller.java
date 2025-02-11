package com.cisco;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class controller
{
    
    @Autowired
    private Service si;
    
    
    
    public EmployePojo getbyid(int eid)
    {
	System.out.println("This is Controller Class---"+eid);
	return si.getbyid(eid);
    }

}
