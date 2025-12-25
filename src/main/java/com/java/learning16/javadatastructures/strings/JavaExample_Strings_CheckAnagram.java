package com.java.learning16.javadatastructures.strings;

import java.util.Arrays;
import java.util.Collections;

//Write a Java program to check whether two strings are anagram or not?

//Two strings are called anagrams if they contain same set of characters but in different order.
//"keep ? peek"

public class JavaExample_Strings_CheckAnagram
{

	public static void main(String[] args) 
	{
        String str1 = " keep";
        String str2 = " peek";
        
        IsAnagrams(str1,str2);
	    
	}

	private static void IsAnagrams(String str1, String str2) 
	{
		boolean isAnagram = true;
		
		if(str1.length() != str2.length())
		{
			isAnagram = false;
		}
		else
		{
			char charArr1[] = str1.toCharArray();
			char charArr2[] = str2.toCharArray();

			Arrays.sort(charArr1);
			Arrays.sort(charArr2);
			
			int len = str1.length();
			
			for(int i=0;i<len;i++)
			{
				if(charArr1[i] != charArr2[i])
				{
					isAnagram = false;
				}
			}
		}
		
		if(isAnagram)
		{
			System.out.println("It is an Anagram");
		}
		else
		{
			System.out.println("It is not an Anagram");
		}
	} 
}	         
