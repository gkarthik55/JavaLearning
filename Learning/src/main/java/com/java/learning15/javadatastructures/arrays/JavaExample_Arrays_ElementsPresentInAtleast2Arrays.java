package com.java.learning15.javadatastructures.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class JavaExample_Arrays_ElementsPresentInAtleast2Arrays 
{
	static Map<Integer, Integer> ElementsAndCount = new HashMap<>();

	public static void calculateElementCount(int[] arr) 
	{
		for (int i = 0; i < arr.length; i++) 
		{
			Integer element = arr[i];
			Integer count = ElementsAndCount.get(element);

			if (count == null) 
			{
				ElementsAndCount.put(element, 1);
			} 
			else 
			{
				ElementsAndCount.put(element, ++count);
			}
		}

	}

	public static void main(String[] args) 
	{
		int[] arr1 = new int[] { 1, 2, 3, 9, 8, 7 };
		int[] arr2 = new int[] { 4, 1, 2, 10, 15 };
		int[] arr3 = new int[] { 5, 1, 2, 4, 10 };

		calculateElementCount(arr1);
		calculateElementCount(arr2);
		calculateElementCount(arr3);

		Set<Map.Entry<Integer, Integer>> mapEntries = ElementsAndCount.entrySet();

		for (Map.Entry<Integer, Integer> entry : mapEntries) 
		{
			if (entry.getValue() >= 2) 
			{
				System.out.println("Entry Name :" + entry.getKey() + "| Entry Value :" + entry.getValue());
			}
		}
	}
}
