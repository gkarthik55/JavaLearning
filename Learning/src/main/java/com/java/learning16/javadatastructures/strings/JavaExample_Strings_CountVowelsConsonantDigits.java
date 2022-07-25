package com.java.learning16.javadatastructures.strings;

//Program to count vowels, consonant, digits and special characters in string.
//Ascii values : A-Z = 65-90, a-z= 97-122, 0-9 = 48-57

public class JavaExample_Strings_CountVowelsConsonantDigits
{
	public static void main(String[] args) 
	{
		String str = "Geeks@123";
		int vowels = 0;
		int consonants = 0;
		int digits = 0;
		int special = 0;
		
		char charArr[] = str.toLowerCase().toCharArray();
		
		for(int i=0,len=str.length()-1; i<len ;i++)
		{
			if(charArr[i] >= 'a' && charArr[i] <= 'z')
			{
				if(charArr[i] == 'a' || charArr[i] ==  'e' || charArr[i] == 'i' 
						||charArr[i] == 'o' ||charArr[i] ==  'u')
				{
					vowels++;
				}
				else
				{
					consonants++;
				}
			}
			else if(charArr[i] >= '0' && charArr[i] <= '9')
			{
				digits++;
			}
			else 
			{
				special++;
			}
		}
		
		System.out.println("vowels count :"+vowels);
		System.out.println("consonants count :"+consonants);
		System.out.println("digits count :"+digits);
		System.out.println("special character count :"+special);
	} 
}	         
