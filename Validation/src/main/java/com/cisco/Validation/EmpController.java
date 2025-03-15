package com.cisco.Validation;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ECount")
public class EmpController
{
	@Autowired
	private Service si;
	
	// http://localhost:9090/ECount/Save
	
	@PostMapping("/Save")
	public ResponseEntity<EmployePojo> save(@RequestBody EmployePojo emp) throws Exception
	{
		System.out.println(emp);
			System.out.println(" This is Controller Class :- "+emp);
			si.save(emp);
			
			return new ResponseEntity<EmployePojo>(emp,HttpStatus.ACCEPTED);
	}
	
	//----------------------------------------------------------//
	
	// http://localhost:9090/ECount/update/3/78.78/AWS
	
	@PutMapping("/update/{eid}/{esal}/{edesg}")
	public ResponseEntity<String> updatedata 
	(
		@PathVariable("eid") int eid,
		@PathVariable("esal") double esal,
		@PathVariable("edesg") String edesg
			
	) throws Exception
	{
		
		ResponseEntity<String >  rs = null;
		
		System.out.println(" This is Controller Class "+eid);
		
			si.updatedata(eid,esal,edesg);
		
		return rs = new ResponseEntity<String>("Data is saved Succefully ",HttpStatus.OK);
	}

	
	//----------------------------------------------------------//
	
	//  http://localhost:9090/ECount/delete/7
	@DeleteMapping("/delete/{eid}")
	public ResponseEntity<String> delete(@PathVariable("eid") int eid)  throws Exception
	{
		
		ResponseEntity<String> rs = null;
		System.out.println(" This is Controller Class "+eid);
	
			si.delete(eid);
		return rs = new ResponseEntity<String>(" Data is Deleted Succefully",HttpStatus.OK);
	}
	
	
	//-----------------------------------------------------------------//
	
	// http://localhost:9090/ECount/GetById/3
	@GetMapping("GetById/{eid}")
	public ResponseEntity<EmployePojo> GetById(@PathVariable("eid") int eid) throws Exception
	{
		
		System.out.println(" This is Controller Class = "+eid);
		
		EmployePojo	emp	= si.GetById(eid);	
		
			return new ResponseEntity<EmployePojo>(emp,HttpStatus.OK);

	}
	
	//-----------------------------------------------------------------//
	
	// http://localhost:9090/ECount/GetByName/Anji
	@GetMapping("GetByName/{ename}")
	public ResponseEntity<List<Map<String, Object>>> GetByName(@PathVariable("ename") String ename) throws Exception
	{
		
		 List<Map<String, Object>> empList = si.GetByName(ename);
		 
		 	boolean  flag = empList.isEmpty();
		 	
		 	if(flag)
		 	{
		 		throw new NoDataPresent(" No Data is Present with this Name == "+ename);
		 	}
	  
        System.out.println("Data successfully retrieved");
        return new ResponseEntity<>(empList, HttpStatus.OK);
    

	}
	
	//-----------------------------------------------------------------------//
	
	// http://localhost:9090/ECount/GetAll 
	@GetMapping("GetAll")
	public ResponseEntity<List<EmployePojo>> GetAll() throws Exception
	{
		
		System.out.println("This is Controller Class ");
		
				List<EmployePojo>emp1 = si.GetAll();
		
	return new ResponseEntity<List<EmployePojo>>(emp1,HttpStatus.ACCEPTED);
		
	}
	
}
