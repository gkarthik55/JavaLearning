package com.java.learning15.javadatastructures.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// How do you reverse an array in place in Java?

// Time complexity is O(n)

public class JavaExample_Arrays_ReverseAnArray {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 6, 3, 2, 3 };

		reverseArrayElement(arr);

		// We also have a feature in Collections. i.e.
		//
		// List<Integer> arrayList = new ArrayList<Integer>();
		// arrayList = Arrays.asList(arr);
		// Collections.reverse(arrayList);
		//
		// System.out.println("Elements of the Array:");
		// for(int a:arrayList)
		// {
		// System.out.print("\t "+a);
		// }
	}

	static void reverseArrayElement(int[] arr) 
	{
		int len = arr.length;
		int temp[] = new int[len];
	
		int j = 0;
		for (int i = len - 1; i >= 0; i--) 
		{
			temp[j] = arr[i];
			j++;
		}

		System.out.println("Elements of the Array:");
		for (int a : temp) {
			System.out.print("\t " + a);
		}
	}
}
