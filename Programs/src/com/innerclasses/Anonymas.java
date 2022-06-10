package com.innerclasses;
abstract class outer
{
	abstract void show();
}
public class Anonymas {

	public static void main(String[] args) {
		
		outer ob = new outer()
		{
			void show()
			{
				System.out.println("This is anonynmous inner class where we do not have to write a class java"
						+ "just create a class itself");
			}
		};
		
		ob.show();
		
	}
}
