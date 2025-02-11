package com.cisco;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Service
{
    @Autowired
    private Dao di;

    public EmployePojo getbyid(int eid)
    {
	System.out.println("This is Service Class ---"+eid);
	
	
	return di.getbyid(eid);
    }

}
