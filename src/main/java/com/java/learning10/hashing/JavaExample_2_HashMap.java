package com.java.learning10.hashing;

import java.util.HashMap;
import java.util.Map;

public class JavaExample_2_HashMap 
{
	public static void main(String[] args) 
	{
		HashMap<Integer,String> hashMap=new HashMap<Integer,String>();
		
	    System.out.println("Initial list of elements: "+ hashMap);  
	    hashMap.put(100,"C++");    
	    hashMap.put(101,"Java");    
	    hashMap.put(102,"Servlets");
	    
	    System.out.println("After invoking put() method ");  
	    for(Map.Entry entry:hashMap.entrySet())
	    {    
	    	System.out.println(entry.getKey()+" "+entry.getValue());    
	    }  
	        
	    hashMap.putIfAbsent(103, "Jsp");  
	    System.out.println("After invoking putIfAbsent() method ");  
	    
	    for(Map.Entry entry:hashMap.entrySet())
	    {    
	    	System.out.println(entry.getKey()+" "+entry.getValue());    
	    }
	    
	    HashMap<Integer,String> map=new HashMap<Integer,String>();  
	    map.put(104,"Java8");  
	    map.putAll(hashMap);  
	    
	    System.out.println("After invoking putAll() method ");  
	    for(Map.Entry entry:map.entrySet())
	    {    
	    	System.out.println(entry.getKey()+" "+entry.getValue());    
	    }  
	 }  
}  


