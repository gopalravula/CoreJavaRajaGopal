package com.Noukari.FiledataUploading;

import java.io.File;
import java.io.IOException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("Upload")
public class FileOperationController
{
/*
 * http://localhost:8080/Upload/Resume
 * --> Go to Body and click on row data and give data and Value. //
 * 
 * I want  to send to large files it will show that file is Exceded Error. //
 * Now i want to increase the size a will add it in application Properties to apply. //
 *  server.port=7878 , I can change it in Application Properties on them. //
 *  
 *  # 	Set maximum file size (e.g., 50MB)
		spring.servlet.multipart.max-file-size=1GB
	#   Set maximum request size (e.g., 100MB, for multiple files)
		spring.servlet.multipart.max-request-size=1GB
 */
	@RequestMapping("Resume")
	public void getResume( @RequestParam("filename") MultipartFile mfile)
	{
		System.out.println("I am file upload Class Controller: "+mfile);
		
		System.out.println(mfile.getName());
		System.out.println(mfile.getSize());
		System.out.println(mfile.getContentType());
		System.out.println(mfile.getOriginalFilename());
		
		System.out.println("-----------------------------");
		
		// Now i am strong file in destination path. //
		
		String dfolderpath = "E:\\MovingFiles";
		
		//passing path to file //
		File file = new File(dfolderpath);
		
		
		try
		{
			System.out.println("----Data is transform from file To Noukari----");
			// Now transforing file to Path. //
			mfile.transferTo(file);
			System.out.println(" Succefully it is Transformed ");
		} catch (IllegalStateException | IOException e)
		{
			e.printStackTrace();
		}
	}
}
