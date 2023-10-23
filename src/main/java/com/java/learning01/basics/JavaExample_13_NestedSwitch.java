package com.java.learning01.basics;

import java.util.Scanner;

public class JavaExample_13_NestedSwitch 
{
	public static void main(String[] args) 
	{
		int year = 0;
		String branch;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the year from 1-2.");
		//year = sc.nextInt(); <- It does not work here.
		year = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter the Branch name.");
		branch = sc.nextLine();
		
		//Scanner skips nextLine() after use of other next functions.
		//Fix that Issue
		
		// This issue occurs because, when nextInt() method of Scanner class 
		// is used to read the year, it returns the value 1 to the variable year, as expected.
		// But the cursor, after reading 1, remains just after it. 
		// Ex: 1_ // Cursor is here
		
		switch (year) 
		{
			case 1:
				System.out.println("elective courses : Advance english, Algebra");
				break;
			case 2:
				switch (branch) // nested switch
				{
				case "CSE":
				case "CCE":
					System.out.println("elective courses : Machine Learning, Big Data");
					break;
				case "ECE":
					System.out.println("elective courses : Antenna Engineering");
					break;
				default:
					System.out.println("Elective courses : Optimization");
				}
		}

		sc.close();
	}
}