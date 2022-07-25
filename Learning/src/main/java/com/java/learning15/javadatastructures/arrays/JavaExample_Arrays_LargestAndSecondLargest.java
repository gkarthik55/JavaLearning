package com.java.learning15.javadatastructures.arrays;

//Time complexity of this solution is O(n).

public class JavaExample_Arrays_LargestAndSecondLargest 
{
	public static void main(String[] args) 
	{
		int numbers[] = new int[] { 12,93,5,12,22,38,38,5,9,94 };

		int largest = 0;
		int secondLargest = 0;
		int len = numbers.length;

		for (int i = 0; i < len; i++) 
		{
			if (numbers[i] > largest) 
			{
				secondLargest = largest;
				largest = numbers[i];
			}

			if (numbers[i] > secondLargest && numbers[i] < largest) 
			{
				secondLargest = numbers[i];
			}
		}

		// Second Approach
		//		for (int i = 0; i < len; i++) 
		//		{
		//			if (numbers[i] > largest) 
		//			{
		//              secondlargest = largest; 
		//				largest = numbers[i];
		//			}
		//
		//			if (numbers[i] > secondLargest && numbers[i] < largest) 
		//			{
		//				secondLargest = numbers[i];
		//			}
		//		}

		System.out.println("Largest Element is " + largest);
		System.out.println("Secong Largest Element is " + secondLargest);

		// Second Approach using Arrays.sort()
//		int numbers1[] = new int[]{55,32,4,45,98,123,82,11,9,39,50};
//		Arrays.sort(numbers1);
//		System.out.println("Smallest Element is "+ numbers1[0]);
//		System.out.println("Largest Element is "+ numbers1[numbers1.length-1]);

	}
}
