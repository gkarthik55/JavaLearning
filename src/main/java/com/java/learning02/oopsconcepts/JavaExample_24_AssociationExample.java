package com.java.learning02.oopsconcepts;

//Java program to illustrate the concept of Association.

class Bank  
{ 
	 private String bName; 
	   
	 Bank(String bName) 
	 { 
	     this.bName = bName; 
	 } 
	   
	 public String getBankName() 
	 { 
	     return this.bName; 
	 } 
}  

class Employee 
{ 
	 private String eName; 
	   
	 Employee(String eName)  
	 { 
	     this.eName = eName; 
	 } 
	   
	 public String getEmployeeName() 
	 { 
	     return this.eName; 
	 }  
} 

public class JavaExample_24_AssociationExample 
{
	public static void main(String args[])
	{
		Bank bankObj = new Bank("Axis"); 
	    Employee empObj = new Employee("Neha"); 
	      
	    System.out.println(empObj.getEmployeeName() + " is employee of " + bankObj.getBankName()); 

		// In above example two separate classes Bank and Employee are associated 
		// through their Objects. Bank can have many employees, 
		// So it is a one-to-many relationship.
	}
}
