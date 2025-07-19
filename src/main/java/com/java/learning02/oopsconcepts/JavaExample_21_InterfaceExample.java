package com.java.learning02.oopsconcepts;

interface MyShape
{
	double area();
}

class MyCircle implements MyShape
{
	int radius;
	double area;
	
	MyCircle(int r)
	{
		radius = r;
	}
	
	public double area()
	{
		area = Math.PI * Math.pow(radius,2);
		
		return area;
	}
}

class MyRectangle implements MyShape
{
	int length, breadth;
	
	MyRectangle(int l, int b)
	{
		length = l;
		breadth = b;
	}
	
	public double area()
	{
		return length * breadth;
	}
}


public class JavaExample_21_InterfaceExample 
{
	public static void main(String[] args) 
	{
		MyShape ob1 = new MyCircle(3);
		System.out.println(ob1.area());
		
		MyShape ob2 = new MyRectangle(2,5);
		System.out.println(ob2.area());
		
    }
}
