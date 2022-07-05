package com.java.learning01.basics;

//Enum declared outside the class.
enum NewColors
{
	Cyan, Magenta, Yellow;
}

enum Orders
{
	Prescription, NonMedication, HxOrder;
}

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


// Enumerations represents a group of named constants in a programming language. 
public class JavaExample_04_Enumeration 
{
	//Enum declaration can be done outside a Class or inside a Class but not inside a Method.
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
		// Enumerations serve the purpose of representing a group of named constants in a programming language
		
		// Ex: For example the 4 suits in a deck of playing cards may be 4 enumerators named Club, Diamond, Heart, and Spade, 
		// belonging to an enumerated type named Suit.
		
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
