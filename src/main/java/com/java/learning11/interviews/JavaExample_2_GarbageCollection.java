package com.java.learning11.interviews;

public class JavaExample_2_GarbageCollection
{
	public static void main(String[] args) 
	{
		JavaExample_2_GarbageCollection t1 = new JavaExample_2_GarbageCollection(); 
		JavaExample_2_GarbageCollection t2 = new JavaExample_2_GarbageCollection(); 
	          
	    // Nullifying the reference variable 
	    t1 = null; 
	          
	    // requesting JVM for running Garbage Collector 
	    System.gc(); 
	          
	    // Nullifying the reference variable 
	    t2 = null; 
	          
	    // requesting JVM for running Garbage Collector 
	     Runtime.getRuntime().gc(); 
	  } 
	      
	    @Override
	    // finalize method is called on object once before garbage collecting it 
	    protected void finalize() throws Throwable 
	    { 
	        System.out.println("Garbage collector called"); 
	        System.out.println("Object garbage collected : " + this); 
	    } 
}
