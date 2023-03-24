package com.java.learning10.hashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JavaExample_4_SortingHashMapUsingArrayList 
{
	 // This map stores unsorted values 
    static Map<String, Integer> hashMap = new HashMap<>(); 
  
	private static void sortByKey() 
	{
        List<String> sortedKeys = new ArrayList<String>(hashMap.keySet());
        
        Collections.sort(sortedKeys);  
  
        // Display the TreeMap which is naturally sorted 
        for (String key : sortedKeys)
        {
        	System.out.println("Key :" + key + "Value: " + hashMap.get(key));
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
