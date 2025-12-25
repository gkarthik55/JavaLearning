package com.java.learning08.interfacesandabstractclasses;

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
	 public int compare(Student s1, Student s2) 
	 { 
		 //return positive means swap, negative means don't swap.
		 if (s1.rollno > s2.rollno)
			 return 1;
		 else if (s1.rollno < s2.rollno)
			 return -1;
		 else 
			 return 0;
		 
		 //Otherwise simply return using the below statement.
	     //return s1.rollno - s2.rollno;
	 } 
} 

class SortbyName implements Comparator<Student> 
{ 
	 // Used for sorting in ascending order of name.
	 @Override
	 public int compare(Student s1, Student s2) 
	 { 
	     return s1.name.compareTo(s2.name); 
	 }
	 
	 private static final SortbyName sortbyNameObj = new SortbyName();

	 public static SortbyName getInstance()
	 {
		 return sortbyNameObj;
	 }
} 

public class JavaExample_51_ComparatorInterface_StudentClass 
{
	public static void main(String[] args) 
	{
		ArrayList<Student> ar = new ArrayList<Student>(); 
        ar.add(new Student(25, "Karthik G")); 
        ar.add(new Student(8, "Srikanth Rp")); 
        ar.add(new Student(12, "Pavan Kumar Kn")); 
  
        System.out.println("Unsorted"); 
        for (int i=0; i<ar.size(); i++) 
            System.out.println(ar.get(i)); 
  
        Collections.sort(ar, new SortbyRollNo()); 
  
        System.out.println("\nSorted by rollno"); 
        for (int i=0; i<ar.size(); i++) 
            System.out.println(ar.get(i)); 
  
        Collections.sort(ar, SortbyName.getInstance()); 
  
        System.out.println("\nSorted by name"); 
        for (int i=0; i<ar.size(); i++) 
            System.out.println(ar.get(i)); 
	}
}
