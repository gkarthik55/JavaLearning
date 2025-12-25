package com.java.learning16.javadatastructures.strings;

public class JavaExample_Strings_StringWithOnlyDigitsInSentence 
{
	public static void main(String[] args) 
	{
		String str = "Welcome123 to the43 world of3 Java789";
		
		String[] strArr = str.split(" ");
		
		for(String s:strArr)
		{
			boolean valid = false;
			
			char[] charArr = s.toCharArray();
			int len = charArr.length;
			
			for(int i=0;i<len;i++)
			{
				if(charArr[i]>48 && charArr[i]<57)
				{
					valid = true;
					break;
				}
			}
			
			if(valid)
			{
				System.out.println(s);
			}
		}
	}
}
