package com.java.learning15.javadatastructures.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

// How are duplicates removed from a given array in Java? Good Design

// Time complexity is O(n)

public class JavaExample_Arrays_DuplicateElementsRemove3 
{
	public static void main(String[] args) 
	{
		int arr[] = { 1, 2, 6, 3, 2, 3 };

		Arrays.sort(arr);

		removeDuplicateElement(arr);
	}

	static void removeDuplicateElement(int[] arr) 
	{
		int len = arr.length;

		int i = 0;
		int j = 0;

		while (i < len-1) 
		{
			if (arr[i] != arr[i + 1]) 
			{
				arr[j] = arr[i];
				j++;
			}
			
			i++;
		}

		// Adding the last element to the array
		arr[j++] = arr[len - 1];

		while (j < len)
		{
			arr[j] = 0;
			j++;
		}

		System.out.println("Elements of the Array:");
		for (int a : arr) 
		{
			System.out.print("\t " + a);
		}

		System.out.println("");
	}
}
