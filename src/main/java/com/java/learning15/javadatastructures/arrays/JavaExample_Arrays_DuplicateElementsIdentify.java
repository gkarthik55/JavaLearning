package com.java.learning15.javadatastructures.arrays;

public class JavaExample_Arrays_DuplicateElementsIdentify 
{
	// Find Duplicate Elements in an Array - Brute Force Method
	// Time complexity of this solution is O(n*n)

	public static void main(String[] args) 
	{
		int count =0;
		int arr[] = { 5, 3, 2, 1, 1, 5};

		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i+1; j < arr.length; j++) 
			{
				if (arr[i] == arr[j])
				{
					System.out.println("The duplicate element is " + arr[i]);
				}
			}
		}

		System.out.println("Count :"+ count);
	}
}
