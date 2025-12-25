package com.java.learning01.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JavaExample_15_SortingInJava 
{
	public static void main(String[] args) 
	{
		// Java program to demonstrate working of Arrays.sort(). 
		// Its by default sorts in ascending order.
		int intArr[] = {56, 25, 13, 87, 66, 46};
		
		System.out.println("Value of Array:"+Arrays.toString(intArr));
		
		Arrays.sort(intArr);
		System.out.println("Sorted Array:" + Arrays.toString(intArr));

		// Java program to demonstrate working of Collections.sort(). 
		// Create a list of strings and sort it.
		List<String> stringArr = new ArrayList<>();
		stringArr.add("Karnataka");
		stringArr.add("Bengaluru");
		stringArr.add("Mysuru"); 
		stringArr.add("Are");
		stringArr.add("Is"); 
		stringArr.add("A"); 
		stringArr.add("State"); 
		stringArr.add("District"); 
		
        /* Collections.sort method is sorting the elements of ArrayList in ascending order. */
        Collections.sort(stringArr);
        // Let us print the sorted list 
        System.out.println("List after the use of" + " Collection.sort() :\n" + stringArr);

        Collections.reverse(stringArr);
        // Let us print the reverse list 
        System.out.println("List after the use of" + " Collection.reverse() :\n" + stringArr);

        // Java program to sort an array in descending order using Arrays.sort().
        // Note that we have Integer here instead of int[] as Collections.reverseOrder doesn't work for primitive types. 
        Integer intArr2[] = {13, 7, 6, 45, 21, 9, 2, 100}; 
  
        // Sorts intArr2[] in descending order
        Arrays.sort(intArr2);
        Arrays.sort(intArr2, Collections.reverseOrder()); 
        System.out.println("Sorted Array using Arrays.sort() method:" + Arrays.toString(intArr2)); 
        
        // Java program to demonstrate working of Collections.sort() to descending order. 
        // Create a list of strings 
        List<String> stringArr2 = new ArrayList<>(); 
		stringArr.add("Karnataka");
		stringArr.add("Bengaluru");
		stringArr.add("Mysuru"); 
		stringArr.add("Are");
		stringArr.add("Is"); 
		stringArr.add("A"); 
		stringArr.add("State"); 
		stringArr.add("District"); 
  
        /* Collections.sort method is sorting the elements of ArrayList in descending order. */
        Collections.sort(stringArr2, Collections.reverseOrder()); 
  
        // Let us print the sorted list 
        System.out.println("Sorted Array using Collections.sort() method:" + stringArr2); 
		
        // Java program to sort a subarray using Arrays.sort(). Our arr contains 8 elements 
        int[] intArr3 = { 13, 7, 6, 45, 21, 9, 2, 100 }; 
  
        // Sort subarray from index 1 to 4, i.e., only sort subarray {7, 6, 45, 21} and
        // keep other elements as it is. 
        Arrays.sort(intArr3, 1, 5);
        
        System.out.println("Sorted subarray using Arrays.sort() method:" + Arrays.toString(intArr3)); 
	}
}
