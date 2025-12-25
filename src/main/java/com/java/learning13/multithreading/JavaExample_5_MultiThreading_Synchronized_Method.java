package com.java.learning13.multithreading;

class Printer
{
	//Using the synchronized method
	synchronized public void printDoc(String docName, int num)
	{
		for(int i=1; i<= num; i++)
		{
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Printing the document "+ docName +" " +i+ " time.");	
		}
	}
}

class ThreadA extends Thread
{
	Printer pref;
	
	ThreadA(Printer p)
	{
		pref = p;
	}
	
	public void run()
	{
			 pref.printDoc("Karthik Profile", 10);
	}
}

class ThreadB extends Thread
{
	Printer pref;
	
	ThreadB(Printer p)
	{
		pref = p;
	}
	
	public void run()
	{
			pref.printDoc("Pradeep Profile", 10);
	}
}

public class JavaExample_5_MultiThreading_Synchronized_Method
{
	public static void main(String args[])
	{
	    System.out.println("Begin of Main Thread");
	    
	    //Printer du onde object erbeku, adakke
	    
	    //We have only one single object of Printer class.
	    Printer obj = new Printer();
	    
	    //We have a scenario where we have multiple threads working on the same object. 
	    // i.e. a single printer is used by multiple people.
	    ThreadA t1 = new ThreadA(obj);
	    ThreadB t2 = new ThreadB(obj);
	    
	    t1.start();
	    t2.start();
	    
	    System.out.println("End of Main Thread");
	}
}
