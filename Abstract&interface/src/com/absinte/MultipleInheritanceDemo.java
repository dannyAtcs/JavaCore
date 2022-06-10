package com.absinte;
class A1
{
	void display()
	{
		System.out.println("Parent class");
	}
}
interface B1
{
	void print();
}
public class MultipleInheritanceDemo  extends A1 implements B1{

	public void print() {
		System.out.println("Interface method");
		
	}

	public static void main(String[] args) {
		MultipleInheritanceDemo ob = new MultipleInheritanceDemo();
		ob.display();
		ob.print();
	}
}
