package com.java.learning07.exceptionshandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class JavaExample_ExceptionHandling_Tricky6
{
	public static void main(String[] args) 
	{
		//Let's see an example to handle checked exception.
		PrintWriter pw;  
        try 
        {  
            pw = new PrintWriter("file.txt"); //may throw exception   
            pw.println("saved");  
        }  
		catch (FileNotFoundException e) 
        {  
            System.out.println(e);  
        }         
        System.out.println("File saved successfully");  
	}
}	         
