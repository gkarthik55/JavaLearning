package com.java.learning02.oopsconcepts;

//Java program to illustrate the concept of inheritance. 
class Bicycle  
{ 
	 // the Bicycle class has two fields 
	 private int gear; 
	 private int speed; 
	       
	 // the Bicycle class has one constructor 
	 public Bicycle(int gear, int speed) 
	 { 
	     this.gear = gear; 
	     this.speed = speed; 
	 } 
	       
	 // the Bicycle class has three methods 
	 public void applyBrake(int decrement) 
	 { 
	     speed = speed - decrement; 
	 } 
	       
	 public void speedUp(int increment) 
	 { 
	     speed = speed - increment; 
	 } 
	   
	 // toString() method to print info of Bicycle 
	 public String toString()  
	 { 
	     return("No of gears are "+ gear +"\n" + " Speed of bicycle is "+speed); 
	 }  
} 

//Sub class 
class MountainBike extends Bicycle  
{ 
	 // the MountainBike subclass adds one more field 
	 public int seatHeight; 
	
	 // the MountainBike subclass has one constructor 
	 public MountainBike(int gear, int speed, int startHeight) 
	 { 
	     // invoking base-class(Bicycle) constructor 
	     super(gear, speed); 
	     seatHeight = startHeight; 
	 }  
	       
	 // the MountainBike subclass adds one more method 
	 public void setHeight(int newValue) 
	 { 
	     seatHeight = newValue; 
	 }  
	   
	 // overriding toString() method of Bicycle to print more info 
	 @Override
	 public String toString() 
	 { 
	     return ( super.toString()+"\n Seat height is "+seatHeight); 
	 } 
} 

class TouringBike extends Bicycle
{
	public TouringBike(int gear, int speed) 
	{
		super(gear, speed);
	}
}

class HybridBike extends TouringBike
{
	public HybridBike(int gear, int speed) 
	{
		super(gear, speed);
	}
}

public class JavaExample_18_InheritanceInJava 
{
	public static void main(String[] args)
	{
		Bicycle bicycle = new MountainBike(3, 100, 25); 
        System.out.println(bicycle.toString()); 
	}
}
