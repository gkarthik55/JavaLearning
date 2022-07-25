package com.java.learning13.multithreading;

class ThreadD implements Runnable 
{
	public void run()
	{
		for(int i=1; i <= 10; i++)
		{
			System.out.println("In Thead Method "+ i);
		}
	}
}

public class JavaExample_2_MultiThreading_ImplementRunnable
{
	public static void main(String args[])
	{
	    System.out.println("Begin of Main Thread");
	    
	    //Creating the Thread Object
	    ThreadD t1 = new ThreadD();
	    
	    Thread obj = new Thread(t1); 
	    obj.start();
	    
	    try {
			obj.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    //See the difference between Join() and without Join() method.
	    
	    System.out.println("End of Main Thread");
	}
}
