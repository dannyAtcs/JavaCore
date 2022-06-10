
 class OuterClasses {

	private int age = 25;
	
	class inner
	{
		void getAge()
		{
			System.out.println("Age is " + age);
		}
	}
	
	static class inner1
	{
		int a = 5;
		void show()
		{
			System.out.println("Value of a " + a);
		}
	}
	
	public static void main(String[] args) {
		OuterClasses ob = new OuterClasses();
		OuterClasses.inner inobject = ob.new inner();
		//how to create inner class object
		//outerclassname.innerClassName  objectName = outerobjectname.new innerClassName()
	
		inobject.getAge();
        OuterClasses.inner1 obj = new OuterClasses.inner1();
        obj.show();
        
        
	}
}

