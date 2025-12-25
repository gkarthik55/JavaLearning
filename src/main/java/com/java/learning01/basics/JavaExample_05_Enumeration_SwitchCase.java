package com.java.learning01.basics;

import java.util.Scanner;

enum Day 
{
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

class DayMood 
{
	Day day;

	public DayMood(Day day) 
	{
		this.day = day;
	}

	// Prints a line about Day using switch 
	public void dayIsLike() 
	{
		switch (day) 
		{
			case MONDAY:
				System.out.println("Mondays are bad.");
				break;
			case FRIDAY:
				System.out.println("Fridays are better.");
				break;
			case SATURDAY:
			case SUNDAY:
				System.out.println("Weekends are best.");
				break;
			default:
				System.out.println("Midweek days are so-so.");
				break;
		}
	}
}

public class JavaExample_05_Enumeration_SwitchCase 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the Day");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		// Using the valueOf() method of Enum.
		DayMood d1 = new DayMood(Day.valueOf(str));
		d1.dayIsLike();

		sc.close();
	}
}
