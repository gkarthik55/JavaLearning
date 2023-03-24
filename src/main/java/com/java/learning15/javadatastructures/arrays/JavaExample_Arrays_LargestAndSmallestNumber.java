package com.java.learning15.javadatastructures.arrays;

import java.util.Arrays;

//How do you find the largest and smallest number in an unsorted integer array?

//Time complexity of this solution is O(n).

public class JavaExample_Arrays_LargestAndSmallestNumber 
{
	public static void main(String[] args) 
	{
		// First Approach
		// numbers array
		int numbers[] = new int[] { 55, 32, 45, 98, 82, 11, 9, 39, 50 };

		int smallest = numbers[0];
		int largest = numbers[0];

		for (int i = 0; i < numbers.length; i++) 
		{
			if (numbers[i] < smallest) 
			{
				smallest = numbers[i];
			} 
			else if (numbers[i] > largest) 
			{
				largest = numbers[i];
			}
		}

		System.out.println("Smallest Element is " + smallest);
		System.out.println("Largest Element is " + largest);

		// Second Approach using Arrays.sort()
		// numbers array
		int numbers1[] = new int[] { 55, 32, 4, 45, 98, 123, 82, 11, 9, 39, 50 };
		
		Arrays.sort(numbers1);
		System.out.println("Smallest Element is " + numbers1[0]);
		System.out.println("Largest Element is " + numbers1[numbers1.length - 1]);

	}
}
