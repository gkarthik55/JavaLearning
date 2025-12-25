package com.java.learning02.oopsconcepts;

abstract class Patient1
{
	int patientId;
	String patientName;
	String patientType;
	
	Patient1(int pId, String pName, String pType)
	{
		patientId = pId;
		patientName = pName;
		patientType = pType;
	}

	abstract void treatPatient();

	public String toString()
	{
		return "Patient Details: "+patientId+", "+patientName+", "+patientType;
	}
}

class Inpatient1 extends Patient1
{
	int wardNo;

	Inpatient1(int pId, String pName, String pType, int wardNo)
	{
		super(pId,pName,pType);
		this.wardNo = wardNo;	
	}

	@Override
	void treatPatient()
	{
		System.out.println("Treatment of Patient in Normal Ward.");	
	} 
	
	@Override
	public String toString()
	{
		return "Patient Details: "+patientId+", "+patientName+", "+patientType+", "+wardNo;
	}
}

class EmergencyPatient1 extends Patient1
{
	int emergencyWardNo;

	EmergencyPatient1(int pId, String pName, String pType, int eWard)
	{
		super(pId,pName,pType);
		this.emergencyWardNo = eWard;	
	}
	
	@Override	
	void treatPatient()
	{	
		System.out.println("Treatment of Patient in Emergency Ward.");
	}
	
	@Override
	public String toString()
	{
		return "Patient Details: "+patientId+", "+patientName+", "+patientType+", "+emergencyWardNo;
	}
}

public class JavaExample_20_Abstraction_RealTime 
{
	public static void main(String args[])
	{
		Patient1 p1 = new Inpatient1(10, "Kavya", "Inpatient",102);
		System.out.println(p1.toString());
		p1.treatPatient();

		Patient1 p2 = new EmergencyPatient1(20, "Karthik", "EmergencyPatient", 103);
		System.out.println(p2.toString());	
		p2.treatPatient();
	}		
}
