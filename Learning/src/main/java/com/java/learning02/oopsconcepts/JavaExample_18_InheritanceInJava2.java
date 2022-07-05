package com.java.learning02.oopsconcepts;

//Java program to illustrate the concept of inheritance. 

class Patient
{
	int patientId;
	String patientName;
	String patientType;

	Patient(int pId, String pName, String pType)
	{
		patientId = pId;
		patientName = pName;
		patientType = pType;
	}

	public String toString()
	{
		return "Patient Details: "+patientId+", "+patientName+", "+patientType;
	}
}

class Inpatient extends Patient
{
	int wardNo;

	Inpatient(int pId, String pName, String pType, int wardNo)
	{
		super(pId,pName,pType);
		this.wardNo = wardNo;	
	}
	
	public String toString()
	{
		return "Patient Details: "+patientId+", "+patientName+", "+patientType+", "+wardNo;
	}
}
public class JavaExample_18_InheritanceInJava2 
{
	public static void main(String[] args)
	{
		Patient p = new Patient(10, "Karthik", "Outpatient");
		System.out.println(p.toString());	

		Patient p1 = new Inpatient(20, "Kavya", "Inpatient",102);
		System.out.println(p1.toString());	
	}
}
