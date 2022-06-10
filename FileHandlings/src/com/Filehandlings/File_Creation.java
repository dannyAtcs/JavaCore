package com.Filehandlings;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_Creation {
   
	public static void main(String[] args) {
		
		//file creation
		File ob = new File("C:\\Users\\danny.gupta\\Desktop\\FileHandling\\demo.txt");
		
		try
		{
			if(ob.createNewFile())
				System.out.println("File successfully created " + ob.getName());
			else
				System.out.println("File already exist");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		//file writing
		try {
			FileWriter writer = new FileWriter("C:\\Users\\danny.gupta\\Desktop\\FileHandling\\demo.txt");
			writer.write("This is file has been created by me itself.\n ");
			writer.write("I wrote in this file via filewriter class. ");
			writer.write("Now it displaying in the file ");
			
			//input from user
			Scanner sc = new Scanner(System.in);
			String data1  =  sc.nextLine();
			writer.write(data1);
			
			
			System.out.println("Successfully written into the file ");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//file reading
		File ob2 = new File("C:\\Users\\danny.gupta\\Desktop\\FileHandling\\demo.txt");
		
		try {
			Scanner Sc = new Scanner(ob2);
			
			while(Sc.hasNextLine())
			{
				String data = Sc.nextLine();
				System.out.println(data);
			}
			Sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//get Information of file
		
		File ob3  = new File("C:\\Users\\danny.gupta\\Desktop\\FileHandling\\demo.txt");
		
		if(ob3.exists())
		{
			System.out.println("File Name: " + ob3.getName());
			
			System.out.println("Path of File: " + ob3.getAbsolutePath());
			
			System.out.println("CanWrite: " + ob3.canWrite());
			
			System.out.println("CanRead: " + ob3.canRead());
			
			System.out.println("Size of file in bytes: " + ob3.length() );
		}
	
		
	}
	
}
