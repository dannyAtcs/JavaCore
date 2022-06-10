package com.Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Employee {

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
	public String toString() {
		return "Employee [" + (name != null ? "name=" + name + ", " : "")
				+ "id=" + id + "]";
	}
	
	public static void main(String[] args) {
		
		Map<Integer, Employee> map = new HashMap<>();
		
		map.put(101, new Employee("Rakesh", 1101));
		
		map.put(102, new Employee("Rahul", 1102));
		map.put(103, new Employee("Rohit", 1103));
		map.put(104, new Employee("Raman", 1104));
		
		System.out.println(map.values());
		
		System.out.println(map.keySet());
		
		map.remove(101);
		System.out.println(map.values());
		
		System.out.println(map.keySet());
		
		map.putIfAbsent(101, new Employee("Tarun", 1105));
		
		System.out.println(map.values());
		
		System.out.println(map.keySet());
		
	}
	
}
