package com.absinte;
//abstract method is not defined in class where it has declared
//in abstract class can have both abstract methods or non abstract methods
abstract class cal
{
	abstract int addition();
	
	int multiply()
	{
		int a = 10;
		int b=20;
		System.out.println(a*b);
		return a*b;
		
	}
}

public class AbstractDemo extends cal {

	int addition() {

		int a = 10;
		int b = 20;
		System.out.println(a + b);
		return 0;
	}

	public static void main(String[] args) {

		AbstractDemo ob = new AbstractDemo();
		ob.addition();
		ob.multiply();
	}

}
