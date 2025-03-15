package com.SpringBootDataBase.SpringBootDataBaseOne;

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
@RequestMapping("/SCount")
public class Controller
{
	
	@Autowired
	private Service si;
	
	/*
	 * 	spring.datasource.url=jdbc:mysql://localhost:3306/Ganeshwar
		spring.datasource.username=root
		spring.datasource.password=root
		# MySQL Driver
		spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
		server.port=9090
	 * 
	 */
	
	
	
	// http://localhost:9090/SCount/save //
	
	
	// By using Response Entity we Can send status code or body it will be send. //
	@PostMapping("/save")
	public ResponseEntity<String> savedata(@RequestBody StudentPojo std)
	{
      System.out.println(" I am Countroller Class---"+std);
	
      ResponseEntity< StudentPojo> rs = null;
      try 
      {
    	  // it will be display this message. //
          si.save(std); 
          return new ResponseEntity<>("Data is Saved Succefully", HttpStatus.CREATED);
      } 
      catch (Exception e)
      {
    	  // when Exception Occurs it will be Come to this Block .
    	  							//	e.getMessage();	e.toString();
          return new ResponseEntity<>("Data is not saved"+e.toString(), HttpStatus.BAD_REQUEST);
          // Status  :- httpStatus.BAD_REQUEST,CREATED,OK
          //Body Status
          //Header body status
      }
 
	}
	
	//-------------------------------------------------------------------//
	
	//     @PutMapping("/{value}/{location}/{id}")

	// http://localhost:9090/SCount/update/67.78/kachiguda/4
	@PutMapping("/update/{smarks}/{sloc}/{sid}")
	public ResponseEntity<Object> update
	(

		@PathVariable("smarks") Double smarks,
		@PathVariable("sloc") String sloc,
		@PathVariable("sid") Integer sid
			
	)
	{
		ResponseEntity<Object> rs = null;
		System.out.println(" This is Controller update method : "+sid);
		try
		{
		si.update(smarks,sloc,sid);
		}
		catch(Exception e)
		{
			return rs = new ResponseEntity<Object>("Data is not Update"+e.getMessage(),HttpStatus.BAD_REQUEST);
		}
		
		return rs = new ResponseEntity<Object>("Data is Updated Succefully ",HttpStatus.CREATED);
	}
	
	
	//---------------------------------------------------------------------------//
	
	// http://localhost:9090/SCount/delete/4 
	@DeleteMapping("delete/{sid}")
	public ResponseEntity<Object> delete(@PathVariable("sid") Integer sid)
	{
		
		ResponseEntity<Object> rs = null;
		System.out.println(" This is Controller Delete Method : "+sid);
		try
		{
		si.delete(sid);
		}
		catch (Exception e) 
		{
			return rs = new ResponseEntity<Object>("Data is not deleted"+e.getMessage(),HttpStatus.BAD_REQUEST);
		}
		
		return rs = new ResponseEntity<Object>("Data is deleted Succefully",HttpStatus.CREATED);
	}
	
	//------------------------------------------------------------------//
	
	
	// http://localhost:9090/SCount/getbyid/1
	@GetMapping("getbyid/{sid}")
	public void getByid(@PathVariable("sid") Integer sid)
	{
		System.out.println(" This is Controller Based On id : "+sid);
		si.getByid(sid);
	}
	
	
	
	//  http://localhost:9090/SCount/getByName/Birava
	@GetMapping("getByName/{sname}")
	public void getByname(@PathVariable("sname") String sname)
	{
		System.out.println(" This is Controller Based On Name : "+sname);
		si.getByname(sname);
	}
	
	
	
	// 
	@GetMapping("/getAll")
	public void getAlldata()
	{
		System.out.println(" I am a Controller Class---");
		si.getAlldata();
	}
	
	
	
	
	

}
