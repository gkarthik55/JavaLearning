package com.java.learning11.javadatastructures;

public class JavaExample_01_LinkedListExample
{
	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();
		list.insert(5);
		list.insert(12);
		list.insert(3);
		
		list.insertAtStart(25);
		list.insertAtPos(0,18);
		
		//Delete
		list.deleteAtPos(2);
		
		list.show();
	}
}
