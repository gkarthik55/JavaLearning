package com.java.learning06.iostreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class SerializableDemo implements Serializable
{
	// Normal variables 
    int i = 10, j = 20; 
  
    // Transient variables 
    transient int k = 30; 
  
    // A static field is implicitly transient (when serializing a static field, its value will be lost anyway). 
    // So indeed, no need to declare both.
    transient static int l = 40; 
  
    // Use of transient has no impact for final variable. 
    transient final int m = 50; 
}

public class JavaExample_5_SerializationDeSerialization  
{   
	public static void main(String[] args) throws Exception 
	{
		SerializableDemo inputobj = new SerializableDemo(); 
		  
        // serialization 
        FileOutputStream fos = new FileOutputStream("C:\\CSVFiles\\file.txt"); 
        ObjectOutputStream oos = new ObjectOutputStream(fos); 
        oos.writeObject(inputobj); 
  
        // de-serialization 
        FileInputStream fis = new FileInputStream("C:\\CSVFiles\\file.txt"); 
        ObjectInputStream ois = new ObjectInputStream(fis); 
        
        SerializableDemo outputobj = (SerializableDemo)ois.readObject(); 
        System.out.println("i = " + outputobj.i); 
        System.out.println("j = " + outputobj.j); 
        System.out.println("k = " + outputobj.k); 
        System.out.println("l = " + outputobj.l);   
        System.out.println("m = " + outputobj.m); 
	}		
}	         
