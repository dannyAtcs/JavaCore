class Student {
	int rollNumber;
	String name;
	static String CollegeName = "Jecrc College";

	public Student(int rollNumber, String name) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
	}

	public static void setCollegeName(String CollegeName) {
		Student.CollegeName = CollegeName;
	}

	public static String getCollege() {
		return CollegeName;
	}

	public void Display() {
		System.out.println(rollNumber + " " + name + " " + CollegeName);
	}
}

public class StaticDemo {

	public static void main(String[] args) {

		Student ob = new Student(101, "Ravi");
		Student ob1 = new Student(102, "Rahul");
		
		ob.setCollegeName("Skit College");
		ob.getCollege();
		ob.Display();
		ob1.Display();
		
	}

}
