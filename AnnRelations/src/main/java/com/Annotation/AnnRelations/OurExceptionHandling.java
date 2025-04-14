package com.Annotation.AnnRelations;

import java.sql.SQLException;

import org.springframework.dao.DuplicateKeyException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class OurExceptionHandling
{

	@ExceptionHandler(DuplicateKeyException.class)
	public ResponseEntity<String> duplicateIssue(DuplicateKeyException s)
	{
		System.out.println(" I am duplicate Entry"+s.getMessage());
		return new ResponseEntity<String>("We got the Duplicate data"+s.getMessage(),HttpStatus.BAD_REQUEST);
	}
	
	//----------------------------------------------------------------------------------//
	
	
	@ExceptionHandler(SQLException.class)
	public ResponseEntity<String>DatabaseException(SQLException e)
	{
		
		System.out.println(" This is Index Bounds "+e);
		return new ResponseEntity<String>(" SQL Query Exception "+e.getMessage(),HttpStatus.BAD_REQUEST);
	}
	
	//----------------------------------------------------------------------------------//
	
	@ExceptionHandler(ArithmeticException.class)
	public ResponseEntity<String>ArithematicExcept(ArithmeticException e)
	{
		
		System.out.println(" The data 10/0 Aritghematice Exception"+e);
		return new ResponseEntity<String>("The data 10/0 Aritghematice Exception "+e.getMessage(),HttpStatus.BAD_REQUEST);
	}

	//----------------------------------------------------------------------------------//
	
	@ExceptionHandler(NullPointerException.class)
	public ResponseEntity<String>NullPointerExcept(NullPointerException e)
	{
		
		System.out.println(" The data is Null Pointing "+e);
		return new ResponseEntity<String>("The data is Null Pointing "+e.getMessage(),HttpStatus.BAD_REQUEST);
	}
	
	//----------------------------------------------------------------------------------//
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String>CommonExcept(Exception e)
	{
		
		System.out.println(" Common Exception  "+e);
		return new ResponseEntity<String>("Common Exception  "+e.getMessage(),HttpStatus.BAD_REQUEST);
	}
	
	//----------------------------------------------------------------------------------//
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<String>MethodArgument(MethodArgumentNotValidException e)
	{
		
		System.out.println(" MethodArgumentNotValid  "+e);
		return new ResponseEntity<String>("MethodArgumentNotValid "+e.getMessage(),HttpStatus.BAD_REQUEST);
	}
	
	//----------------------------------------------------------------------------------//
	
	@ExceptionHandler(NoDataPresent.class)
	public ResponseEntity<String>UserDefined(NoDataPresent e)
	{
		
		System.out.println(" Used Defined  "+e);
		return new ResponseEntity<String>("Used Defined"+e.getMessage(),HttpStatus.BAD_REQUEST);
	}
}
