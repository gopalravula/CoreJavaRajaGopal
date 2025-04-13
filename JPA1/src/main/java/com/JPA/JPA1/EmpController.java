package com.JPA.JPA1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("empCount")
public class EmpController
{
	
	@Autowired
	private EmpService si;
	
	// http://localhost:8080/empCount/save
	@PostMapping("save")
	public EmployeEntity save(@Valid @RequestBody EmployeEntity emp)
	{
		System.out.println("This is Controller Class : "+emp);
		return si.save(emp);
	}
	
	//---------------------------------------------------------//
	
	// http://localhost:8080/empCount/Delete/5
	@DeleteMapping("Delete/{eid}")
	public int delete(@Valid @PathVariable("eid") int eid)
	{
		System.out.println("This is Controller Class "+eid);
		return si.delete(eid);
	}
	
	//----------------------------------------------------------//
	
	// http://localhost:8080/empCount/GetById/3
	@GetMapping("GetById/{eid}")
	public EmployeEntity getbyid(@PathVariable("eid") int eid)
	{
		System.out.println("This is Controller Class"+eid);
		return si.getbyid(eid);
	}
	
	//---------------------------------------------------------//
	
	// http://localhost:8080/empCount/GetAll
	@GetMapping("GetAll")
	public List<EmployeEntity> GetAll()
	{
		System.out.println("This is Controller Class");
		return si.GetAll();
	}
	
	//--------------------------------------------------------------//
	
	// http://localhost:8080/empCount/FindByEname/Lakshmi
	@GetMapping("FindByEname/{ename}")
	public List<EmployeEntity>findByEName(@PathVariable("ename")  String ename)
	{
		System.out.println("This is Controller");
		return si.findByEName(ename);
	}
	
	//--------------------------------------------------------------//
	
	// http://localhost:8080/empCount/Gsalary/50000
	@GetMapping("Gsalary/{esal}")
	public 	List<EmployeEntity> findByESalaryGreaterThan(@PathVariable("esal") double esal)
	{
		System.out.println("This is Controller Class");
		return si.findByESalaryGreaterThan(esal);
	}
	
	//--------------------------------------------------------------//
	
	// http://localhost:8080/empCount/Lsalary/50000
	@GetMapping("Lsalary/{esal}")
	public 	List<EmployeEntity> findByESalaryLessThan(@PathVariable("esal")  double esal)
	{
		System.out.println("This is Controller Class");
		return si.findByESalaryLessThan(esal);
	}
	
	
	//--------------------------------------------------------------//
	
	// http://localhost:8080/empCount/Between/40000/55000
	@GetMapping("Between/{min}/{max}")
	public  List<EmployeEntity> findByESalaryBetween(@PathVariable("min") double min, @PathVariable("max") double max)
	{
		System.out.println("This is Controller Class");
		return si.findByESalaryBetween(min,max);
	}
	
	
	//--------------------------------------------------------------//
	
	// http://localhost:8080/empCount/Count/Lakshmi
	@GetMapping("Count/{ename}")
	public int countByEName(@PathVariable("ename") String ename)
	{
		System.out.println("This is Controller Class");
		
		return si.countByEName(ename);
	}
	
	//--------------------------------------------------------------//
	
	// http://localhost:8080/empCount/deleteByEName/Mohan
	@DeleteMapping("deleteByEName/{ename}")
	public  int deleteByEName(@PathVariable("ename") String ename)
	{
		System.out.println("This is Controller Class");
		return si.deleteByEName(ename);
	}

}
