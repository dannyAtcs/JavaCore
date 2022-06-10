package com.access;

public class Modifier {

	public int a;
	public int b;
	
	public int mul(int a,int b)   //default methods is works in same package same as protected
	{
		this.a=a;
		this.b=b;
		int c = a*b;
		System.out.println(c);
		return c;
			
	}
	
	public static void main(String[] args) {
		
		Modifier ob = new Modifier();
		ob.mul(4, 5);
	}
}
