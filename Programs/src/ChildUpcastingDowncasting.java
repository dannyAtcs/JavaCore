class Animal
{
	String name;
	void size()
	{
		System.out.println("Small and medium size animals");
	}
}

public class ChildUpcastingDowncasting extends Animal {
	
	String color;
	
	void size()
	{
		System.out.println(name + " is  a Large size animals " + " has " + color + " color");
		
	}
	
	public static void main(String[] args) {
		//upcasting
		Animal p = new ChildUpcastingDowncasting();
		p.name = "Dog";
	//due to upcasting child class can only access parent class fields and methods and
	//also overridden methods but not access child class fields and methods
	//	p.color;  here color is a child class field so we dont access that
		p.size();  //override the methods
		
//		Child c = new Animal(); //downcasting is not done by compiler implicitly
		
		
		ChildUpcastingDowncasting c = (ChildUpcastingDowncasting)p;
		
		c.name = "Giraffe";
		c.color = "Yellow";
		c.size();
	}
}
