package com.java.learning06.iostreams;

public class student 
{
	String name;
	String rollno;
	String department;
	String result;
	String cgpa;
	
	public student(String name, String rollno, String department, String result, String cgpa) 
	{
		this.name = name;
		this.rollno = rollno;
		this.department = department;
		this.result = result;
		this.cgpa = cgpa;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getCgpa() {
		return cgpa;
	}
	public void setCgpa(String cgpa) {
		this.cgpa = cgpa;
	}

	@Override
	public String toString() {
		return "student [name=" + name + ", rollno=" + rollno + ", department=" + department + ", result=" + result
				+ ", cgpa=" + cgpa + "]";
	}
	
}
