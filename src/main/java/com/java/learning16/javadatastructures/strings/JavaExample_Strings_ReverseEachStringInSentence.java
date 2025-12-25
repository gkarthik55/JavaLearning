package com.java.learning16.javadatastructures.strings;

public class JavaExample_Strings_ReverseEachStringInSentence 
{
	public static void main(String[] args) 
	{
		String str = "Today is a Nice Day";
		
		String strArr[] = str.split(" ");
		
		for(String s: strArr)
		{
			StringBuffer sb = new StringBuffer(s);
			sb.reverse();
			System.out.println(sb);
		}
	}
}
