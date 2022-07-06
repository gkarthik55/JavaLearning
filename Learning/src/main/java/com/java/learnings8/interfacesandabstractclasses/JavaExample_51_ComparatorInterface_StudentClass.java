package com.java.learnings8.interfacesandabstractclasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student 
{ 
	 int rollno; 
	 String name; 
	
	 public Student(int rollno, String name) 
	 { 
	     this.rollno = rollno; 
	     this.name = name; 
	 } 
	
	 public String toString() 
	 { 
	     return this.rollno + " " + this.name; 
	 } 
} 

class SortbyRollNo implements Comparator<Student>
{ 
	 // Used for sorting in ascending order of roll number. 
	 @Override
	 public int compare(Student a, Student b) 
	 { 
		 //return positive means swap, negative means don't swap.
	     return a.rollno - b.rollno; 
	 } 
} 

class SortbyName implements Comparator<Student> 
{ 
	 // Used for sorting in ascending order of name. 
	 public int compare(Student a, Student b) 
	 { 
	     return a.name.compareTo(b.name); 
	 } 
} 

public class JavaExample_51_ComparatorInterface_StudentClass 
{
	public static void main(String[] args) 
	{
		ArrayList<Student> ar = new ArrayList<Student>(); 
        ar.add(new Student(111, "Karthik G")); 
        ar.add(new Student(131, "Srikanth Rp")); 
        ar.add(new Student(121, "Pavan Kumar Kn")); 
  
        System.out.println("Unsorted"); 
        for (int i=0; i<ar.size(); i++) 
            System.out.println(ar.get(i)); 
  
        Collections.sort(ar, new SortbyRollNo()); 
  
        System.out.println("\nSorted by rollno"); 
        for (int i=0; i<ar.size(); i++) 
            System.out.println(ar.get(i)); 
  
        Collections.sort(ar, new SortbyName()); 
  
        System.out.println("\nSorted by name"); 
        for (int i=0; i<ar.size(); i++) 
            System.out.println(ar.get(i)); 
	}
}
