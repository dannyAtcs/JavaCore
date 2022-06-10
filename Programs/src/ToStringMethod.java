
public class ToStringMethod {

	private int age;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

	@Override
	public String toString() {
		return "ToStringMethod [age=" + age + ", "
				+ (name != null ? "name=" + name : "") + "]";
	}

	public static void main(String[] args) {
		ToStringMethod ob = new ToStringMethod();
		ob.setAge(23);
		ob.getAge();
		ob.setName("Rahul");
		ob.getName();
		System.out.println(ob);
	}
}
