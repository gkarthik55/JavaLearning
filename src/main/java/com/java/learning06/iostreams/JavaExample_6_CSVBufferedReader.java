package com.java.learning06.iostreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class JavaExample_6_CSVBufferedReader 
{
    public static void main(String[] args)
    {
    	try
    	{
        	// .csv comma seperated values.
    		String file = "C:\\CSVFiles\\file.csv";
    		
    		BufferedReader br = new BufferedReader(new FileReader(file)); 
    		
    		String line = br.readLine(); 
    		// Reading header, Ignoring 
    		
    		while ((line = br.readLine()) != null && !line.isEmpty()) 
    		{
    			String[] fields = line.split(","); 
    			
    			String name = fields[0]; 
    			String rollno = fields[1]; 
    			String department = fields[2];
    			String result = fields[3]; 
    			String cgpa = fields[4];
    			
    			student student = new student(name, rollno, department, result, cgpa);
    			
    			System.out.println(student.toString());
    		}
    		
    		br.close();
    		
    		String fileoutput = "C:\\CSVFiles\\outputfile.csv";
    		BufferedWriter bw = new BufferedWriter(new FileWriter(fileoutput));
    		String str = "name , rollno, department, result, cgpa";
    		
    		bw.write(str);
    		bw.close();
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
}
