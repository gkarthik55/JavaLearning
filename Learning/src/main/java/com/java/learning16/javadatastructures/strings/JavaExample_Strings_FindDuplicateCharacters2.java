package com.java.learning16.javadatastructures.strings;

//How do you print duplicate characters from a string?
//Best Approach

public class JavaExample_Strings_FindDuplicateCharacters2
{
	static final int NoOfChar = 256;
	
	static void fillCharCounts(String str, int count[])
	{
		for(int i=0; i< str.length(); i++)
		{
			count[str.charAt(i)]++;
		}
	}
	
	static void printDups(String str)
	{
		//Create a count array to maintain the count for the characters. 
		int count[] = new int[NoOfChar];
		
		fillCharCounts(str, count);
		
		for(int i=0; i<NoOfChar; i++)
		{
			if(count[i] > 1)
			{
				System.out.printf("%c , count = %d\n",i, count[i]);
			}
		}
	}

       
	public static void main(String[] args) 
	{
        String str = "test string"; 
        printDups(str); 
	    
	 } 
}	         
