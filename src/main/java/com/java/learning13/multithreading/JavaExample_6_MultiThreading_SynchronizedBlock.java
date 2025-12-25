package com.java.learning13.multithreading;

class MyThreadA extends Thread
{
	Printer pref;
	
	MyThreadA(Printer p)
	{
		pref = p;
	}
	
	public void run()
	{
		//Using the synchronized block.
		synchronized(pref)
		{
			 pref.printDoc("Karthik Profile", 10);
		}
	}
}

class MyThreadB extends Thread
{
	Printer pref;
	
	MyThreadB(Printer p)
	{
		pref = p;
	}
	
	public void run()
	{
		//Using the synchronized block.
		synchronized(pref)
		{
			pref.printDoc("Pradeep Profile", 10);
		}
	}
}

public class JavaExample_6_MultiThreading_SynchronizedBlock
{
	public static void main(String args[])
	{
	    System.out.println("Begin of Main Thread");
	    
	    //Printer du onde object erbeku, adakke
	    
	    //We have only one single object of Printer class.
	    Printer obj = new Printer();
	    
	    //We have a scenario where we have multiple threads working on the same object. 
	    // i.e. a single printer is used by multiple people.
	    MyThreadA t1 = new MyThreadA(obj);
	    MyThreadB t2 = new MyThreadB(obj);
	    
	    t1.start();
	    t2.start();
	    
	    
	    
	    System.out.println("End of Main Thread");
	}
}
