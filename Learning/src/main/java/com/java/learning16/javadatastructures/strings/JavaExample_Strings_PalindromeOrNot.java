package com.java.learning16.javadatastructures.strings;

//How do you check if a given string is a palindrome or not?

public class JavaExample_Strings_PalindromeOrNot
{
	public static void main(String[] args) 
	{
        String str1 = "radars"; 
        String revStr = "";
        
        for(int len=str1.length(),i=len-1; i>=0; i--)
        {
        	revStr = revStr + str1.charAt(i);
        }
        
        if(str1.equals(revStr))
        	System.out.println("It's a Palindrome");
        else 
         	System.out.println("It's not a Palindrome");
	 } 
}	         
