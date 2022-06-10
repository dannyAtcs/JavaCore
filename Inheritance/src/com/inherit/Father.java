package com.inherit;
class Father {

	private String name;
	private int age;
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
	
}
class Son extends Father
{
	private String College_name;
	public void setCollege(String College_name)
	{
		this.College_name = College_name;
	}
	public String getCollege()
	{
		
		return College_name;
	}
}
class Daughter extends Father
{
	private String College_name;
	public void setCollege(String College_name)
	{
		this.College_name = College_name;
	}
	public String getCollege()
	{
		
		return College_name;
	}
	public static void main(String[] args) {
		
		Daughter d1 = new Daughter();
		d1.setName("Neha");
		d1.setAge(22);
		d1.setCollege("Jecrc Foundation");
		
		Son s1 = new Son();
		s1.setAge(24);
		s1.setName("Naman");
		s1.setCollege("IIT BOMBAY");
		
		
		System.out.println("My name is " + d1.getName() + " and i am " + d1.getAge() + " years old and i am pursuing Btech in " + d1.getCollege() );
		System.out.println("My name is " + s1.getName() + " and i am " + s1.getAge() + " years old and i am pursuing Btech in " + s1.getCollege() );	
	}
}



