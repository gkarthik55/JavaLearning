package com.java.learning15.javadatastructures.arrays;

import java.util.HashSet;
import java.util.Set;

public class JavaExample_Arrays_DuplicateElementsIdentify2 
{
	// Find the Duplicate Name in an Array.

	// Second solution : use HashSet data structure to find duplicates
	// Time complexity of this solution is O(n) and Space complexity of O(n)

	public static void main(String[] args) {
		String[] names = { "Java", "C++", "C", "Scala", "Java", "Java8", "C++", "C#" };

		Set<String> namesSet = new HashSet<String>();

		for (int i = 0; i < names.length; i++) {
			if (namesSet.add(names[i]) == false) {
				System.out.println("Duplicate Element is " + names[i]);
			}
		}
	}
}
