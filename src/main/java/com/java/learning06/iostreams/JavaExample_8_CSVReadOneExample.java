package com.java.learning06.iostreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

public class JavaExample_8_CSVReadOneExample 
{
    public static void main( String[] args )
    {
    	/*try
    	{
        	// .csv comma seperated values.
    		String file = "C:\\CSVFiles\\file.csv";
    		
            // Create an object of file reader class with CSV file as a parameter. 
    		FileReader fileReader = new FileReader(file);
    		
            // For Custom separator, CSVParser with specific parser character is created.
			CSVParser parser = new CSVParserBuilder().withSeparator('|').build();
			
			// Create CSVReader object passing file reader, csv parser as a parameter. 
			CSVReader reader = new CSVReaderBuilder(fileReader).withCSVParser(parser).build();
			
			String[] nextRecord; 
			  
	        // we are going to read data line by line 
	        while ((nextRecord = reader.readNext()) != null) 
	        { 
	            for (String cell : nextRecord) 
	            { 
	                System.out.print(cell + "\t"); 
	            } 
	            
	            System.out.println(); 
	        } 
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}*/
    }
}
