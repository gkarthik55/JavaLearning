package com.java.learning08.interfacesandabstractclasses;

//A simple Java program to demonstrate multiple inheritance through default methods. 

interface Writer 
{ 
 // default method 
 default void show() 
 { 
     System.out.println("I am a Writer"); 
 } 
} 

interface BoldWriter 
{ 
 // Default method 
 default void show() 
 { 
     System.out.println("I am a Bold Writer"); 
 } 
} 

class Pen implements Writer, BoldWriter
{
	// Overriding default show method 
	@Override
    public void show() 
    { 
        // use super keyword to call the show method of Writer interface 
    	Writer.super.show(); 
  
        // use super keyword to call the show method of BoldWriter interface 
    	BoldWriter.super.show(); 
    } 
}

// If we remove implementation of default method from �TestClass�, 
// we get compiler error. 

public class JavaExample_46_DefaultMethods_UsingInterfaces_Java8
{
	public static void main(String[] args) 
	{
		Pen p = new Pen();
		p.show();
	}
}
