package com.java.learnings6.iostreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

public class JavaExample_9_XSLFileReadExample 
{
    public static void main( String[] args )
    {
    	/*
    	 
    	    POIFSFileSystem fs = new POIFSFileSystem(new FileInputStream(file));
    	    HSSFWorkbook wb = new HSSFWorkbook(fs);
    	    HSSFSheet sheet = wb.getSheetAt(0);
    	    HSSFRow row;
    	    HSSFCell cell;

    	    int rows; // No of rows
    	    rows = sheet.getPhysicalNumberOfRows();

    	    int cols = 0; // No of columns
    	    int tmp = 0;

    	    // This trick ensures that we get the data properly even if it doesn't start from first few rows
    	    for(int i = 0; i < 10 || i < rows; i++) {
    	        row = sheet.getRow(i);
    	        if(row != null) {
    	            tmp = sheet.getRow(i).getPhysicalNumberOfCells();
    	            if(tmp > cols) cols = tmp;
    	        }
    	    }

    	    for(int r = 0; r < rows; r++) {
    	        row = sheet.getRow(r);
    	        if(row != null) {
    	            for(int c = 0; c < cols; c++) {
    	                cell = row.getCell((short)c);
    	                if(cell != null) {
    	                    // Your code here
    	                }
    	            }
    	        }
    	    }
    	} catch(Exception ioe) {
    	    ioe.printStackTrace();
    	}*/
    }
}
