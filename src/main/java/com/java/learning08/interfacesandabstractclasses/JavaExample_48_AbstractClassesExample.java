package com.java.learning08.interfacesandabstractclasses;

abstract class Write 
{ 
	Write()
	{
		System.out.println("Constrcutor of Writer"); 
	}

	// abstract method 
	public abstract void display(); 
} 

class Penn extends Write
{
	@Override
	public void display()
	{
		System.out.println("I am a Pen");
	}
}

public class JavaExample_48_AbstractClassesExample 
{
	public static void main(String[] args) 
	{
		Penn obj = new Penn();
		obj.display();
	}
}
