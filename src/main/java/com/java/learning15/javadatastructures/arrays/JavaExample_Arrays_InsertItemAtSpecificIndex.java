package com.java.learning15.javadatastructures.arrays;

// How to Insert an item into an array at a specific index java? Good Approach

// Time complexity is O(n)

public class JavaExample_Arrays_InsertItemAtSpecificIndex 
{
	public static void main(String[] args) 
	{
		int arr[] = { 1, 2, 6, 3, 2, 3 };

		insertElementAtPos(arr, 5, 3);
	}

	static void insertElementAtPos(int[] arr, int ele, int pos) 
	{
		int len = arr.length;

		// Creating a new Array with new Size
		int temp[] = new int[len + 1];

		for (int i = 0; i < pos; i++) 
		{
			temp[i] = arr[i];
		}

		// Adding the element at the given position.
		temp[pos] = ele;

		// Continuing the other elements
		for (int j = pos + 1; j <= len; j++) 
		{
			temp[j] = arr[j - 1];
		}

		System.out.println("Elements of the Array:");
		for (int a : temp) 
		{
			System.out.print("\t " + a);
		}

		System.out.println("");
	}
}
