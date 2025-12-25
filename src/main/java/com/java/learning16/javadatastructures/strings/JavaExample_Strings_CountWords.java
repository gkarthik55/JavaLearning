package com.java.learning16.javadatastructures.strings;

public class JavaExample_Strings_CountWords 
{
	public static void main(String[] args) 
	{
		String str = "This is my country India";
		String[] stringArr = str.split(" ");

		System.out.println("The number of words in a sentence :"+stringArr.length);
		
		System.out.println("Removing the whitespace from Sentence:");
		
		for(String s:stringArr)
		{
			System.out.print(s);
		}
	}
}
