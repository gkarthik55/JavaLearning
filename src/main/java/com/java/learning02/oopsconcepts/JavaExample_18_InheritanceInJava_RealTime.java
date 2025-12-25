package com.java.learning02.oopsconcepts;

//Java program to illustrate the concept of inheritance.

enum PatientType
{
	INPATIENT, OUTPATIENT, EMERGENCY; 
}

enum Orders
{
	RXORDER, HXORDER, PROPOSAL, NONMEDICATION, SINGLEINGREDIENT, PROFILEORDER; 
}

class Patient
{
	int patientId;
	String patientName;
	PatientType patientType;

	Patient(int pId, String pName, PatientType pType)
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

	Inpatient(int pId, String pName, PatientType pType, int wardNo)
	{
		super(pId,pName,pType);
		this.wardNo = wardNo;	
	}
	
	public String toString()
	{
		return "Patient Details: "+patientId+", "+patientName+", "+patientType+", "+wardNo;
	}
}

class EmergencyPatient extends Patient
{
	String emergencyDescription;

	EmergencyPatient(int pId, String pName, PatientType pType, String eDescription) 
	{
		super(pId, pName, pType);
		this.emergencyDescription = eDescription;
	}

	@Override
	public String toString() 
	{
		return "Patient Details: "+patientId+", "+patientName+", "+patientType+", "+emergencyDescription; 
	}
}

public class JavaExample_18_InheritanceInJava_RealTime 
{
	public static void main(String[] args)
	{
		Patient p = new Patient(10, "Karthik G", PatientType.INPATIENT);
		System.out.println(p.toString());	

		Patient p1 = new Inpatient(20, "Ranjan R", PatientType.OUTPATIENT, 102);
		System.out.println(p1.toString());	
		
		Patient p2 = new EmergencyPatient(30, "Prajwal A", PatientType.EMERGENCY, "Hit in Elbow during Gym.");
		System.out.println(p2.toString());
	}
}
