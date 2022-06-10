package com.exception;

import java.util.Scanner;

public class Exception1 {
 
	public static void main(String[] args) {
		
		try
		{
//			int arr[] = new int[2];
//			System.out.println(arr[4]);
//			
//		
//			System.out.println(300/0);
			
			
			String s  = null;
			System.out.println("Hello " + s.length());
			
			
			

		
		}
		catch(ArithmeticException  e)
		{
			e.printStackTrace();
		}
		catch(NullPointerException e)
		{
			System.out.println(e.toString());
		}
		catch( ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Exception Caught");
			
		}
		
	}
}
