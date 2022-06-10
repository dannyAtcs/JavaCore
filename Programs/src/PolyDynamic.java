
interface A1
{
    public int add();
    public void display();
}
class A2 implements A1 {
	   
	public int add()
	   {
		   int a=10,b=10,c=a+b;
		   System.out.println(c);
		   return c;
	   }

	public void display() {
		
		System.out.println("This is a implemented class");
	}
	   
}

class A3 extends A2{
   @Override
   public int add()
   {
	   int a=16,b=10,c=a+b;
	   System.out.println(c);
	   return c;
   }
   
   public void display()
   {
	   System.out.println("This is a extended class");
   }
}
public class PolyDynamic extends A3
{
  public static void main(String[] args) {

	PolyDynamic ob = new PolyDynamic();
	ob.add(); 
	ob.display();        // it print the latest extended class method
	A2 ob1 = new A2();
	ob1.add();
	ob1.display();		 // now we create an object of parent of parent class and we can
					     // call also that class method
	
	
}	
}
