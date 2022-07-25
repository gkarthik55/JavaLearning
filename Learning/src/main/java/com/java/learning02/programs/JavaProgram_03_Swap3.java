package com.java.learning02.programs;

public class JavaProgram_03_Swap3 
{
	public static void main(String[] args) 
	{
		System.out.println("Swap 2 Numbers:");
		
		int a = 4 ;
		int b = 5 ;
		
		System.out.println("Values before Swap:");
		
		System.out.println("Value of a: "+a);
		System.out.println("Value of b: "+b);
		
		System.out.println("Values after Swap:");
		
		a = a + b;
		b = a - b;
		a = a - b;
			
		System.out.println("Value of a: "+a);
		System.out.println("Value of b: "+b);
		
	}
}
