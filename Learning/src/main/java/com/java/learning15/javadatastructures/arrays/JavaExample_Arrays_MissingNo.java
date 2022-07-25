package com.java.learning15.javadatastructures.arrays;

public class JavaExample_Arrays_MissingNo 
{
	// Function to find missing number
	static int getMissingNo(int arr[], int n) 
	{
		int sumOfSeries = (n + 1) * (n + 2) / 2;
		int sum = 0;

		for (int i = 0; i < arr.length; i++) 
		{
			sum = sum + arr[i];
		}

		return (sumOfSeries - sum);
	}

	public static void main(String[] args) 
	{
		// How do you find the missing number in a given integer array of 1 to 100?

		int arr[] = { 1, 2, 4, 3, 8, 7, 6 };
		int missingNo = getMissingNo(arr, 7);

		System.out.println(missingNo);

	}
}
