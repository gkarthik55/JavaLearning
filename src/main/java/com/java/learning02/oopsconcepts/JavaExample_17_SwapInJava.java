package com.java.learning02.oopsconcepts;

// A Java program to show that we can change members using 
// reference if we do not change the reference itself. 
class Number 
{
	int num;

	Number(int n)
	{
		num = n;
	}

	Number()
	{
		num = 0;
	}
}

class JavaExample_17_SwapInJava 
{ 
	 public static void main(String[] args) 
	 { 
	     //Here 'n1' is a Reference 
		 Number n1 = new Number(5); 
	
	     // Reference is passed here and a copy of reference is created in change().
	     change(n1);
	
	     // New value of n1 is printed 
	     System.out.println("Value of Num:"+n1.num); 
	 }
	
	 // This change() method doesn't change the reference, it only 
	 // changes member of object referred by reference 
	 public static void change(Number n) 
	 { 
		 n.num = 10; 
	 }
} 