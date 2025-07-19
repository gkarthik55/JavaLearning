package com.java.learning01.basics;

import java.util.Scanner;

//Java program to demonstrate switch case with multiple cases without break statements 

public class JavaExample_12_SwitchCase 
{	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number between 1-7.");
		int day = sc.nextInt();
		String dayOfTheWeek=null;
		String dayType=null;

		switch (day) 
		{
			case 1:
				dayOfTheWeek = "Monday";
				break;
			case 2:
				dayOfTheWeek = "Tuesday";
				break;
			case 3:
				dayOfTheWeek = "Wednesday";
				break;
			case 4:
				dayOfTheWeek = "Thursday";
				break;
			case 5:
				dayOfTheWeek = "Friday";
				break;
			case 6:
				dayOfTheWeek = "Saturday";
				break;
			case 7:
				dayOfTheWeek = "Sunday";
				break;
			default:
				dayOfTheWeek = null;
				break;
		}
		
		switch(dayOfTheWeek)
		{
		case "Monday":
		case "Tuesday":
		case "Wednesday":
		case "Thurday":
		case "Friday": 
			dayType = "Weekday";
			break;
		case "Saturday":
		case "Sunday":
			dayType = "Weekend";
			break;
		default:
			dayType = null;
			break;
		}
		
		System.out.println("Day Of The Week :"+dayOfTheWeek);
		System.out.println("Type Of The Day :"+dayType);
		
		sc.close();
	}
}
