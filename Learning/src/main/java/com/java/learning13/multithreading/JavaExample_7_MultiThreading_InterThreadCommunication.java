package com.java.learning13.multithreading;

//Easy example to remember the Inter-Thead communication - wait and notify method for Interview.

class Customer
{  
	int amount=10000;  
	  
	synchronized void withdraw(int amount)
	{  
		System.out.println("going to withdraw...");  
		  
		if(this.amount<amount)
		{  
			System.out.println("Less balance; waiting for deposit...");  
			try
			{
				wait();
			}
			catch(Exception e)
			{}  
		}  
		this.amount-= amount;  
		System.out.println("withdraw completed...");  
	}  
	  
	synchronized void deposit(int amount)
	{  
		System.out.println("going to deposit...");  
		this.amount+=amount;  
		System.out.println("deposit completed... ");  
		
		notify();  
	}  
}  
public class JavaExample_7_MultiThreading_InterThreadCommunication
{
	public static void main(String args[])
	{
	    System.out.println("Begin of Main Thread");
	    
	    final Customer c=new Customer();
	    
	    new Thread()
	    {  
	    	public void run()
	    	{
	    		c.withdraw(15000);
	    	}  
	    	
	    }.start();  
	    
	    new Thread()
	    {  
	    	public void run()
	    	{
	    		c.deposit(10000);
	    	}  
	    	
	    }.start();  
	    
	    System.out.println("End of Main Thread");
	}
}
