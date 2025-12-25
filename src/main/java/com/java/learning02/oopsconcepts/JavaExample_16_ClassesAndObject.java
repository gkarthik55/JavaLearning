package com.java.learning02.oopsconcepts;

public class JavaExample_16_ClassesAndObject 
{
	public static void main(String args[]) throws CloneNotSupportedException
	{
		// I have declared the 'Dog' class outside the file to show that the Class
		// can be in different file and same package.
		Dog dogObj = new Dog("dogObj","papillon", 5, "white"); 
	    System.out.println("dogObj object:"+dogObj.toString());
	    System.out.println("--------------------------------------");
	    
	    //Create a dogObj clone object.
	    Dog clone1 = (Dog)dogObj; // Shallow copy
	    clone1.setAge(10);
	    System.out.println("clone1 object:"+clone1.toString());
	    System.out.println(clone1.hashCode());
	    System.out.println("--------------------------------------");
	    System.out.println("dogObj object:"+dogObj.toString());
	    System.out.println(dogObj.hashCode());
	    System.out.println("--------------------------------------");
	    
	    Dog clone2 = new Dog(); // Deep copy	
	    clone2.setName(dogObj.getName());	
	    clone2.setBreed(dogObj.getBreed());	
	    clone2.setAge(dogObj.getAge());
	    clone2.setColor(dogObj.getColor());
	    clone2.setAge(12);
	    System.out.println("clone2 object:"+clone2.toString());
	    System.out.println("--------------------------------------");
	    System.out.println("dogObj object:"+dogObj.toString());
	    System.out.println("--------------------------------------");

	    Dog clone3 = new Dog(); // Clone copy
	    clone3 = dogObj.clone();
	    clone3.setAge(15);
	    System.out.println("clone3 object:"+clone3.toString());
	    System.out.println("--------------------------------------");
	    System.out.println("dogObj object:"+dogObj.toString());
	    System.out.println("--------------------------------------");
	}
}
