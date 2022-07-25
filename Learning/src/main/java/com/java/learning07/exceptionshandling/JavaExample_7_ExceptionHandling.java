package com.java.learning07.exceptionshandling;

//Program of Exception Propagation

public class JavaExample_7_ExceptionHandling
{
	void m()
	{  
		int data=50/0;  
	}  
		  
	void n()
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
		JavaExample_7_ExceptionHandling obj=new JavaExample_7_ExceptionHandling();  
		obj.p();  
		
	    System.out.println("Rest of the code...");  
	}  
}	         
