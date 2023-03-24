package com.java.learning06.iostreams;

import java.io.FileReader;
import java.util.List;

public class JavaExample_7_CSVReadAllExample 
{
    public static void main( String[] args )
    {
    	/*try
    	{
        	// .csv comma seperated values.
    		String file = "C:\\CSVFiles\\FileA.csv";
    		
            // Create an object of file reader class with CSV file as a parameter. 
    		FileReader fileReader = new FileReader(file);

            // For Custom separator, CSVParser with specific parser character is created.
			CSVParser parser = new CSVParserBuilder().withSeparator('|').build();
			
			// Create CSVReader object passing file reader, csv parser as a parameter. 
			CSVReader reader = new CSVReaderBuilder(fileReader).withCSVParser(parser)
					.withSkipLines(1).build();
			
            // Read all data at once 
            List<String[]> dataList = reader.readAll();
            
            // Print Data. 
            for (String[] row : dataList) 
            { 
                for (String cell : row) 
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
