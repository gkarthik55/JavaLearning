package com.java.learning16.javadatastructures.strings;

//Java program to Reverse a String using swapping of variables. 

//Without using the Recursion

public class JavaExample_Strings_ReverseString
{
	public static void main(String[] args) 
	{
		String str = "Geeks";
		
		char charArr[] = str.toCharArray();
		
		int left = 0;
		int right = str.length()-1;
		
		//Swapping the character 
		while(left < right)
		{
			char temp;
			
			temp = charArr[left];
			charArr[left]= charArr[right];
			charArr[right]= temp;
			
			left++;
			right--;
		}
		
		System.out.println(charArr);
	} 
}	         
