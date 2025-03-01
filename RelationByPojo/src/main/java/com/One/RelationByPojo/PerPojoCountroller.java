package com.One.RelationByPojo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("empCount")
public class PerPojoCountroller
{

	
	@GetMapping("savep")
	public PersonPojo savep(@RequestBody PersonPojo per)
	{
		System.out.println("----This is Person Pojo ---"+per);
		return per;
	}
	
	
}
