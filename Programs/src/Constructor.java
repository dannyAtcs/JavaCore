class parent {
	
	public parent() {
		System.out.println("Parent class constructor called every time when create an object of child class");
	}
	public parent(int a,int b)
	{
	
		int c = a+b;
		System.out.println(c);
	}
	
}
public class Constructor extends parent {

	private int a;
	private int b;
	private int c;
	enum week
	{
		monday,tuesday,wednesday,thursday,friday,saturday,sunday;

		public String valueOf(week text) {
			// TODO Auto-generated method stub
			return null;
		}
	}
	week day;
	public Constructor()
	{
		System.out.println("Default Constructor");
	}
	
	public Constructor(week day) {
		super();
		this.day = day;
		System.out.println("Weekday is " + day);
	}

	public Constructor(int a, int b)
	{
		this(a,b,a+b);  //constructor chaining call another constructor from other cons.
		this.a = a;
		this.b = b;
		int c = a+b;
		
		System.out.println("Addition of 2 numbers " + c);
	 
		
	}
	//constructor overloading
	public Constructor(int a, int b, int c)
	{
		
		this.a = a;
		this.b = b;
		this.c = c;
		int d = a+b+c;
		System.out.println("Addition of 3 numbers " + d);
		
	}
    //copy constructor
	public Constructor(Constructor c)
	{
		
		this.a = c.a;
		this.b = c.b;
		int d = a+b;
	    System.out.println(c);
	}
	
	

	@Override
	public String toString() {
		return "Constructor [a=" + a + ", b=" + b + "]";
	}

	public static void main(String[] args) {
		String text = "monday";
		Constructor ob  = new Constructor();
		Constructor ob1  = new Constructor(13,56);
		//Constructor ob2  = new Constructor(45,78,34);
		Constructor ob3  = new Constructor(ob1);
        Constructor ob4 = new Constructor(week.valueOf(text));
	}

	
}
