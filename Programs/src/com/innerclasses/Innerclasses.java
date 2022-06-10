package com.innerclasses;
class outer1
{
	int x =10;
    void show()
	{
		System.out.println("Value of x :" + x);
	}
	class innerclass1
	{
		void display()
		{
			System.out.println("Innerclass one! ");
		}
	}
	
	class innerclass2 extends outer1
	{
			//only fields and methods are inherited, but not member Inner Classes
	}
}
public class Innerclasses {
	
	public static void main(String[] args) {
		
		outer1 ob = new outer1();
		outer1.innerclass2 in = ob.new innerclass2();
		
		in.x =20;
		in.show();
		
		//in.display();  this is giving error because we cant inherit member inner classes
		
		
	}

}
