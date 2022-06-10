package com.absinte;
//interface only allow abstract methods
interface A
{
	void display();
	int addition();
}
interface B
{
	void print();
	int multiply();
}
//multiple inheritance
class C implements A,B{

	public void display() {
		System.out.println("Interface implementation");
		
	}

	public int addition() {
		int a = 10;
		int b = 20;
		System.out.println(a + b);
		return 0;
		
	}
	public int multiply() {
		int a = 10;
		int b=20;
		System.out.println(a*b);
		return a*b;
	}

	public void print() {

		System.out.println("Another Interface class method");
		
	}
}
     
public class InterfaceDemo extends C {

	public static void main(String[] args) {

		InterfaceDemo ob = new InterfaceDemo();
		ob.display();
		ob.addition();
		ob.print();
		ob.multiply();

		
	}

}
	
	
	

