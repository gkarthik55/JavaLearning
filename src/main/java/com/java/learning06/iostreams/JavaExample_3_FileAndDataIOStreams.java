package com.java.learning06.iostreams;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class JavaExample_3_FileAndDataIOStreams 
{
	public static void main(String[] args) throws Exception 
	{
		FileOutputStream fos = null;
		DataOutputStream dos = null;

		FileInputStream fis = null;
		DataInputStream dis = null;
		try 
		{
			fos = new FileOutputStream("C:\\CSVFiles\\file.txt");
			dos = new DataOutputStream(fos);
			dos.writeUTF("Writing the Text to the File");

			fis = new FileInputStream("C:\\CSVFiles\\file.txt");
			dis = new DataInputStream(fis);

			String str = dis.readUTF();
			System.out.println(str);

		} 
		catch (FileNotFoundException e) 
		{
			System.out.println(e);
		} 
		finally 
		{
			dos.close();
			fos.close();

			dis.close();
			fis.close();
		}
	}
}
