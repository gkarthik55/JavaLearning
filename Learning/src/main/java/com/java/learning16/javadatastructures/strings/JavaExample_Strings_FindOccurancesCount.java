package com.java.learning16.javadatastructures.strings;

//Java program to count the occurrences of each character
public class JavaExample_Strings_FindOccurancesCount
{
	static final int NoOfChar = 256;
	
	static void fillCharCounts(String str, int count[])
	{
		str.charAt(0);
		for(int i=0; i<str.length(); i++)
		{
			count[str.charAt(i)]++;
		}
	}
	
	static void findOccurance(String str)
	{
		//Create a count array to maintain the count for the characters. 
		int count[] = new int[NoOfChar];
		
		fillCharCounts(str, count);
		
		for(int i=0; i<str.length(); i++)
		{
			char c = str.charAt(i);
			int occurance = count[c];
			
			System.out.printf("%c , occurance = %d\n", c, occurance);
		}
	}
       
	public static void main(String[] args) 
	{
        String str = "Geeks"; 
        findOccurance(str); 
	 } 
}	         
