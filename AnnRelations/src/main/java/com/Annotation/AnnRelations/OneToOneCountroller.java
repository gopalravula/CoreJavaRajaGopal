package com.Annotation.AnnRelations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("OneToOne")
public class OneToOneCountroller
{
	@Autowired
	private OneToOneService si;
	
	// http://localhost:8080/OneToOne/savep //
	@PostMapping("savep")
	public  ResponseEntity<PersonEntity>  saveorupdate(@Valid @RequestBody PersonEntity per) throws Exception
	{
		System.out.println("This is Controller Class = "+per);
		si.saveorupdate(per);
		return new ResponseEntity<PersonEntity>(per,HttpStatus.OK); 
	}
	
	//------------------------------------------------------------//
	
	// http://localhost:8080/OneToOne/findByPname/Akhil //
	@GetMapping("findByPname/{pname}")
	public  ResponseEntity<List<PersonEntity>> findByPname(@PathVariable("pname") String pname) throws Exception
	{
		
		System.out.println("This is Controller Class "+pname);
		List<PersonEntity>	sos =    	si.findByPname(pname);
		return  new ResponseEntity<List<PersonEntity>>(sos, HttpStatus.OK); 
	}
	
	//------------------------------------------------------------//
	
	// 
	@DeleteMapping("delete/{pid}")
	public ResponseEntity<Object>   deleteByid(@PathVariable("pid") int pid) throws Exception
	{
		System.out.println("This is Controller Class : "+pid);
		si.deleteByid(pid);
		return new ResponseEntity<Object>("Data Deleted Succefully", HttpStatus.OK);
	}
	
	//------------------------------------------------------------//
	
	// http://localhost:8080/OneToOne/Getbyid/4   //
	@GetMapping("Getbyid/{pid}")
	public ResponseEntity<PersonEntity>   GetById(@PathVariable("pid") int pid) throws Exception
	{
		System.out.println("This is Controller Class : "+pid);
			PersonEntity	ps=	si.GetById(pid);
		 return new ResponseEntity<PersonEntity>(ps, HttpStatus.OK);
	}
	
	//------------------------------------------------------------//
	
	// http://localhost:8080/OneToOne/GetAll //
	@GetMapping("GetAll")
	public ResponseEntity<List<PersonEntity>>  GetAll() throws Exception
	{
		System.out.println("This is Controller Class ");
		List<PersonEntity>sos = si.GetAll();
		return new ResponseEntity<List<PersonEntity>>(sos, HttpStatus.ACCEPTED);
	}

	//------------------------------------------------------------//
	
	
	
}
