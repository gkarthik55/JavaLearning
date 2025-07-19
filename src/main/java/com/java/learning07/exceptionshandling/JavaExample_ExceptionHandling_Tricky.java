package com.java.learning07.exceptionshandling;

public class JavaExample_ExceptionHandling_Tricky
{
	public static void main(String[] args) 
	{
		//an example to resolve the exception in a catch block.
		
		int i=50;  
	    int j=0;  
	    int data;  
	     
	    try  
	    {  
	       data=i/j; //may throw exception   
	    }  
	    // handling the exception  
	    catch(Exception e)  
	    {  
	    	// resolving the exception in catch block  
	        System.out.println(i/(j/2));  
	    }  
	}		
}	         
