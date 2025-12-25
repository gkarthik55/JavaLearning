package com.java.learning13.multithreading;

class ThreadC extends Thread
{
	public void run()
	{
		for(int i=1; i <= 10; i++)
		{
			System.out.println("In Thead Method "+ i);
		}
	}
}

public class JavaExample_1_MultiThreading_ExtendThread
{
	public static void main(String args[])
	{
	    System.out.println("Begin of Main Thread");
	    
	    ThreadC obj = new ThreadC();
	    obj.start();
	    
	    try {
			obj.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    //See the difference between Join() and without Join() method.
	    
	    //Other methods used in the Thread
	    ThreadC t1 = new ThreadC();
	    t1.setName("My Thread 1");
	    ThreadC t2 = new ThreadC();
	    t2.setName("My Thread 2");
	    
	    //Get the name of Thread
	    System.out.println(t1.getName());
	    System.out.println(t2.getName());
	    
	    //Get the current thread and its name.
	    System.out.println(Thread.currentThread().getName());
	    
	    //Set the priority of Thread
	    t1.setPriority(Thread.MIN_PRIORITY);
	    t2.setPriority(Thread.MAX_PRIORITY);
	    
	    //Get the priority of Thread
	    System.out.println(t1.getPriority());
	    System.out.println(t2.getPriority());
	    
	    System.out.println("End of Main Thread");
	}
}
