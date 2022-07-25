package com.java.learning15.javadatastructures.arrays;

import java.util.Arrays;
import java.util.List;

public class JavaExample_01_ArrayClassFeatures
{
	public static void main(String[] args) 
	{
	    String[] arr = new String[] {"Java","C++","C#","Python","Java"}; 

	    for (int i = 0; i < arr.length; i++) 
	    {
		    System.out.println("Element at index " + i + " : "+ arr[i]);   
	    }
	    
	    //Convert Array to List. We have a feature in Array class.
	    List<String> list = Arrays.asList(arr);
	    
	    for(String s: list)
	    {
	    	 System.out.println(s);
	    }
	 } 
}	         
