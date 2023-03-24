package com.java.learning07.exceptionshandling;

import java.io.IOException;

//Program which describes that checked exceptions are not propagated
public class JavaExample_8_ExceptionHandling 
{
	void m() throws IOException
	{  
	    throw new java.io.IOException("device error");//checked exception  
	}  
	void n() throws IOException
	{  
	    m();  
	}  
	void p()
	{  
	   try
	   {  
		   n();  
	   }
	   catch(Exception e)
	   {
		   System.out.println("exception handled");
	   }  
	}  
	
	public static void main(String[] args) 
	{
		JavaExample_8_ExceptionHandling obj=new JavaExample_8_ExceptionHandling();  
		obj.p();  
		
	    System.out.println("Rest of the code...");  
	}  
}	         
