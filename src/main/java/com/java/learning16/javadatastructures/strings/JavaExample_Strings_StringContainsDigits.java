package com.java.learning16.javadatastructures.strings;

//Java program to check if a string contains only digits.

public class JavaExample_Strings_StringContainsDigits
{
	public static void main(String[] args) 
	{
		String str = "48656447";
		
		//+ mean one or more character.
		if(str.matches("[0-9]+") && str.length() > 2)
			System.out.println("It consists of only numbers");
		
	} 
}	         
