package com.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class Employee implements Comparable<Employee> {

	String name;
	int id;
	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public int compareTo(Employee emp) {
		
		return this.getId() - emp.getId();
	}
	@Override
	public String toString() {
		return "Employee [" + (name != null ? "name=" + name + ", " : "")
				+ "id=" + id + "]";
	}
	
	
	public static void main(String[] args) {
		
		TreeSet<Employee> emp = new TreeSet<>();
		
		emp.add(new Employee("Rahul", 101));
		
		emp.add(new Employee("Rakesh", 102));
		emp.add(new Employee("RAHUL", 101));
		
		for(Employee it : emp)
		{
			System.out.println(it);
		}

		emp = new TreeSet<>(Comparator.comparing(Employee::getName));

		emp.add(new Employee("Rahul", 101));
		
		emp.add(new Employee("Rakesh", 102));
		emp.add(new Employee("RAHUL", 103));

		System.out.println(emp.size());

		System.out.println(emp);
	
		//System.out.println(emp.contains(emp.first()));
	}
	
}
