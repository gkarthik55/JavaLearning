package com.java.learning02.oopsconcepts;

public class Dog implements Cloneable
{
	    // Instance Variables 
	    String name; 
		String breed; 
	    String color; 
	    int age; 
	    
	    Dog()
	    {}
	    
	    Dog(String dName, String dBreed, int dAge, String dColor)
	    {
	    	this.name = dName;
	    	this.breed = dBreed;
	     	this.age = dAge;
	    	this.color = dColor;
	    }
	    
	    public Dog clone()
	    {
	    	try 
	    	{
				return (Dog)super.clone();
			} 
	    	catch (CloneNotSupportedException e) 
	    	{
				e.printStackTrace();
			}
			return null;
	    }
	    
	    public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public String getBreed() {
			return breed;
		}
		public void setBreed(String breed) {
			this.breed = breed;
		}
		
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		
		@Override
	    public String toString() 
	    { 
	        return("Hi My name is "+ this.getName()+ 
	               ".\nMy breed, age and color are " + 
	               this.getBreed()+ "," + this.getAge()+ ","+ this.getColor()); 
	    } 
}
