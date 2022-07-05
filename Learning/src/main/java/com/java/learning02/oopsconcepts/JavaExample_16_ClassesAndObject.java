package com.java.learning02.oopsconcepts;

public class JavaExample_16_ClassesAndObject 
{
	public static void main(String args[]) throws CloneNotSupportedException
	{
		// I have declared the 'Dog' class outside the file to show that the Classes can be in different file and
		// same package.
		Dog tuffy = new Dog("tuffy","papillon", 5, "white"); 
	    System.out.println(tuffy.toString());
	    
	    //Create a Tuffy clone object.
	    
	    Dog clone1 = (Dog)tuffy; // Shallow copy
	    clone1.setAge(10);
	    System.out.println(clone1.toString());
	    System.out.println(tuffy.toString());

	    Dog clone2 = new Dog(); // Deep copy	
	    clone2.setName(tuffy.getName());	
	    clone2.setBreed(tuffy.getBreed());	
	    clone2.setAge(tuffy.getAge());
	    clone2.setColor(tuffy.getColor());
	    clone2.setAge(12);
	    System.out.println(clone2.toString());
	    System.out.println(tuffy.toString());

	    Dog clone3 = new Dog(); // Clone copy
	    clone3 = tuffy.clone();
	    clone3.setAge(15);
	    System.out.println(clone3.toString());
	    System.out.println(tuffy.toString());
	}
}
