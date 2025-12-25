package com.java.learning16.javadatastructures.strings;

// How do you print duplicate characters from a string?
// Brute force method

public class JavaExample_Strings_FindDuplicateCharacters
{
	public static void main(String[] args) 
	{
	    String str = new String("Geeks");
	    int len = str.length();
	    
	    char charArr[] = new char[len];
	    charArr = str.toCharArray();
	    
	    for(int i=0;i<len;i++)
	    {
	    	char begin = charArr[i];
	    	
	    	for(int j=0;j<len;j++)
	    	{
	    		if(i!=j && charArr[j] == begin)
	    		{
	    			System.out.println("Duplicate character :"+ charArr[j]);
	    		}
	    	}
	    }
	    
	 } 
}	         
