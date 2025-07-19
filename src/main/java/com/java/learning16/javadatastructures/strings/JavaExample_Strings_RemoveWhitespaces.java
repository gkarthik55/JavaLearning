package com.java.learning16.javadatastructures.strings;

public class JavaExample_Strings_RemoveWhitespaces 
{
	public static void main(String[] args) 
	{
		//Here they check difference between String and String Buffer.
		
		//String variable
		String str1 = "This is a nice day.";
		
		//New Variable should be created for new Variable. 
		String s1 = str1.replaceAll("\\s","");
		System.out.println(s1);
	}
}
