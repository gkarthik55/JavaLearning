package com.java.learnings7.exceptionshandling;

public class JavaExample_ExceptionHandling_Tricky3
{
	public static void main(String[] args) 
	{
		//along with try block, we also enclose exception code in a catch block.
		try  
	    {  
	        int data1=50/0; //may throw exception   
	    }  
	    catch(Exception e)  
	    {  
	        // generating the exception in catch block  
	        int data2=50/0; //may throw exception   
	    }  
	    
		System.out.println("rest of the code");  
	 }   
}	         
