
class demo2
{
	public int add()
	{
		int a =10;
		int b=10;
		int c = a+b;
		System.out.println(c);
		return c;
	}
	
	public static int sub()
	{
		int a =10;
		int b =10;
		int c = a-b;
		System.out.println(c);
		return c;
	}
}

public class demo1 {
   
	public static void main(String[] args) {
		
		demo2 ob = new demo2();
		ob.add();
		demo2.sub();
	}
}
