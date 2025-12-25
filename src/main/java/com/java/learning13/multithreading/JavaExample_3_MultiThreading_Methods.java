package com.java.learning13.multithreading;

public class JavaExample_3_MultiThreading_Methods
{
	public static void main(String args[])
	{
	    System.out.println("Begin of Main Thread");
	    
	    ThreadC t1 = new ThreadC();
	    
	    ThreadC t2 = new ThreadC();
	    
	    ThreadC t3 = new ThreadC();
	    
	    
	    System.out.println("End of Main Thread");
	}
}
