package com.java.learning10.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class JavaExample_3_SortingHashMap 
{
	static Map<String, Integer> hashMap = new HashMap<String, Integer>();
	
	public static void sortByKey()
	{
		Map<String, Integer> treeMap = new TreeMap<String, Integer>(hashMap);
		
		System.out.println("Values of the Map after Sorting:");
		
		for(Map.Entry<String, Integer> entry : treeMap.entrySet())
		{
			System.out.println(entry.getKey() + " " + entry.getValue());	
		}
	}
	
	public static void main(String[] args) 
	{
		
		// putting values in the Map 
		hashMap.put("Jayant", 80); 
		hashMap.put("Abhishek", 90); 
		hashMap.put("Anushka", 80); 
		hashMap.put("Amit", 75); 
        hashMap.put("Danish", 40); 
  
        // Calling the function to sortbyKey 
        sortByKey(); 
	}
}
