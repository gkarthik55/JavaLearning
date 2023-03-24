package com.java.learning02.oopsconcepts;

interface MyPatient
{
	public abstract void showInformation();
	public abstract void treatPatient();
}

class MyInpatient implements MyPatient
{
	int patientId;
	String patientName;
	String patientType;
	int wardNo;

	MyInpatient(int pId, String pName, String pType, int wNo)
	{
		patientId = pId;
		patientName = pName;
		patientType = pType;
		wardNo = wNo;	
	}

	@Override
	public void treatPatient()
	{
		System.out.println("Treatment of MyPatient in Normal Ward.");	
	} 
	
	@Override
	public void showInformation()
	{
		System.out.println("MyPatient Details: "+patientId+", "+patientName+", "+patientType+", "+wardNo);
	}
}

class MyEmergencyPatient implements MyPatient
{
	int patientId;
	String patientName;
	String patientType;
	int emergencyWardNo;

	MyEmergencyPatient(int pId, String pName, String pType, int ewardNo)
	{
		patientId = pId;
		patientName = pName;
		patientType = pType;
		emergencyWardNo = ewardNo;	
	}
	
	@Override	
	public void treatPatient()
	{	
		System.out.println("Treatment of MyPatient in Emergency Ward.");
	}
	
	@Override
	public void showInformation()
	{
		System.out.println("MyPatient Details: "+patientId+", "+patientName+", "+patientType+", "+emergencyWardNo);
	}
}

public class JavaExample_21_InterfaceExample2 
{
	public static void main(String[] args) 
	{
		MyPatient p1 = new MyInpatient(10, "Kavya", "MyInpatient",102);
		p1.showInformation();
		p1.treatPatient();

		MyPatient p2 = new MyEmergencyPatient(20, "Karthik", "MyEmergencyPatient", 103);
		p2.showInformation();	
		p2.treatPatient();	
    }
}
