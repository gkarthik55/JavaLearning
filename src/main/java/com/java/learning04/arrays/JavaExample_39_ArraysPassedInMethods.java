package com.java.learning04.arrays;

public class JavaExample_39_ArraysPassedInMethods
{
	public int findSum(int arr[])
	{
		int sum = 0;
		for(int i:arr)
		{
			sum = sum + i;
		}
		return sum;
	}

	public static void main(String[] args) 
	{
		JavaExample_39_ArraysPassedInMethods obj = new JavaExample_39_ArraysPassedInMethods();
		
		int singleArr[] = new int[]{10, 58, 35, 46, 8};
		
		System.out.println("Single Dimension Array :");
		System.out.println("Sum of Array is "+ obj.findSum(singleArr));
		
	 } 
}	         
