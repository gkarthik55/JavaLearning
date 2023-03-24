package com.java.learning04.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class JavaExample_41_ConcurrentModificationExceptionInArrayList
{
	public static void main(String[] args) 
	{
		 
		List<String> listOfPhones=new ArrayList<String>(Arrays.asList(
				"iPhone 6S","iPhone 6", "iPhone 5","Samsung Galaxy 4","Lumia Nokia"));
			    
		System.out.println("list of phones: "+listOfPhones);
				
		//Iterating and removing objects from list//This is wrong way, will throw ConcurrentModificationException
		for(String phone: listOfPhones)
		{
			if(phone.startsWith("iPhone"))
			{
				//listOfPhones.remove(phone);//will throw exception
			}
		}
			  
		//The Right way,iterating elements using Iterator's remove() method 
		Iterator<String> it = listOfPhones.iterator();
		while(it.hasNext())
		{ 
			String phone = it.next(); 
			if(phone.contains("iPhone"))
			{ 
				//listOfPhones.remove(phone); // wrong again 
				it.remove(); // right call 
			} 
		} 
		
		System.out.println("list after removal: " + listOfPhones); 
	 }  
}	         
