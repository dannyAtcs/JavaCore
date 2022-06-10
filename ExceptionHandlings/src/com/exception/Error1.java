package com.exception;

public class Error1 {

	public static void main(String[] args) {
		
		Recursion(6);
	}

	private static void Recursion(int i) {
		
		while(i!=0)
		{
			i++;
			Recursion(i);    //StackoverflowError
		}
		
	}
}
