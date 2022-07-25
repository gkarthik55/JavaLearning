package com.java.learning16.javadatastructures.strings;

//Java program to Reverse the String using Recursion.

public class JavaExample_Strings_ReverseStringRecussion2
{
	static void reverseArr(char arr[], int left, int right)
	{
		char temp;
		
		if(left >= right)
			return;

		temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
			
		//Using a Recursive function to Reverse.
		reverseArr(arr, left+1, right-1);
	}
	
	public static void main(String[] args) 
	{
		String str = "Geeks";
		
		char charArr[] = str.toCharArray();
		
		int left = 0;
		int right = str.length()-1;
		
		reverseArr(charArr, left, right);
		
		System.out.println(charArr);
		
	} 
}	         
