package com.java.learning09.collections;

import java.util.List;
import java.util.Vector;

public class JavaExample_68_List_Vector 
{
	public static void main(String[] args) 
	{
		List<String> names = new Vector<String>();
		names.add("Java");
		names.add("C++");
		names.add("Java");
		names.add("C#");
		
		System.out.println("Values of the List - Vector\n");
		for(int i=0, n=names.size(); i<n; i++)
		{
			System.out.println(names.get(i));
		}
	}
}
