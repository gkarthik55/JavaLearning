package com.java.learning07.exceptionshandling;

public class JavaExample_1_ExceptionHandling
{
	public static void main(String[] args) 
	{
		int a=6,b=0;
		
		try
		{
			System.out.print("Begin of try block:");
			
			int sum = a/b;
			
			System.out.print("Sum :"+sum);
		}
		catch(Exception e)
		{
			System.out.print("Exception occured"+ e);
		}
		finally
		{
			System.out.print("Finally block executed.");
		}
		
	}		
}	         
