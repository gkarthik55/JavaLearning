package com.java.learning01.basics;

import java.util.Scanner;

enum Order
{
	Prescription, NonMedication, HxOrder;
}

//Best Example for Interview
enum Payment
{
	CASH("The payment is made through Cash."),
	DEBIT("The payment is made through Debit Card."),
	UPI("The payment is made through UPI payment.");
	
	String descrption; 
	
	Payment(String desc)
	{
		descrption = desc;
	}
}

public class JavaExample_04_Enumeration_Interview 
{
	public static void main(String[] args) 
	{
		System.out.println("Print the values of ENUM:");
		System.out.println("------------------------------------");
		for(Payment p : Payment.values())//Using values() method
		{
			System.out.println(p);
			System.out.println(p.descrption);
			System.out.println("------------------------------------");
		}
		
		System.out.println("Select the Mode of Payment");
		System.out.println("1.CASH");
		System.out.println("2.UPI");
		System.out.println("3.DEBIT");
		
		Scanner sc = new Scanner(System.in);
		int mode = sc.nextInt();
		
		Payment pay = null; 
		switch(mode)
		{
			case 1: pay = Payment.CASH;
					break;
			case 2: pay = Payment.UPI;
					break;
			case 3: pay = Payment.DEBIT;
					break;
			default:
					pay = null;
					break;
		}
				
		if(pay == Payment.CASH)
		{
			System.out.println("Thanks for using CASH.");
		}
		else if(pay == Payment.UPI)
		{
			System.out.println("Thanks for using UPI.");
		}
		else if(pay == Payment.DEBIT)
		{
			System.out.println("Thanks for using DEBIT Card.");
		}
		else
		{
			System.out.println("Payment not complete.");
		}
		
		sc.close();
	}
}
