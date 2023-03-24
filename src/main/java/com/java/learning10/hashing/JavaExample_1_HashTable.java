package com.java.learning10.hashing;

import java.util.Hashtable;

public class JavaExample_1_HashTable 
{
	public static void main(String[] args) 
	{
		Hashtable<Integer, String> hashTable = new Hashtable<Integer, String>();
		
        // Input the values 
		hashTable.put(1, "Geeks"); 
		hashTable.put(12, "forGeeks"); 
		hashTable.put(15, "A computer"); 
		hashTable.put(3, "Portal"); 
  
        // Printing the Hashtable 
        System.out.println(hashTable); 
	}  
}

