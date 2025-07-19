package com.java.learning16.javadatastructures.strings;

import java.util.Arrays;

public class JavaExample_Strings_NonRepeatingCharacter 
{
	public static void main(String[] args) 
	{
		String str = "GeeksForGeeks";
		char[] charArr = str.toCharArray();

		Arrays.sort(charArr);
		
		int len = charArr.length;
		for(int i=0;i<len-1;i++)
		{
			if(charArr[i] != charArr[i+1])
			{
				System.out.println(charArr[i]);
			}
		}

		//print last character.
		System.out.println(charArr[len-1]);
	}
}
