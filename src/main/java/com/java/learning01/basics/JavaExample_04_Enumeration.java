package com.java.learning01.basics;

//Enum declared outside the class.
enum PaymentType
{
	CASH("cash"),
	UPI("upi"),
	CREDIT("credit"),
	DEBIT("debit");
	
	String paymentType;
	
	PaymentType(String pType)
	{
		paymentType = pType;
	}
}

// Enumeration is a user-defined type that represents a group of named constants.
// Its nothing but internally creating a static final objects of it.
public class JavaExample_04_Enumeration 
{
	//Enum declaration can be done outside the Class or inside a Class but not inside a Method.
	enum Colors
	{
		RED, GREEN, BLUE;
	}
	
	/* internally above enum Color is converted to
	class Color
	{ 
	     public static final Color RED = new Color();
	     public static final Color BLUE = new Color();
	     public static final Color GREEN = new Color();
	}*/
	
	public static void main(String[] args) 
	{	
		Colors c = Colors.RED;
		System.out.println("The selected color is " + c);

		if (c == Colors.RED)
		{
			System.out.println("Since the color is Red change it to Green");
			c = Colors.GREEN;
		}

		System.out.println("The selected color is " + c);
	}
}
