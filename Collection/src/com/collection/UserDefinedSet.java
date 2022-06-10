package com.collection;

import java.util.HashSet;
import java.util.Set;

public class UserDefinedSet {

	String name;
	int rollNo;
	int  id;
	public UserDefinedSet(String name, int rollNo, int id) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.id = id;
	}
	
	
	@Override
	public String toString() {
		return " [" + (name != null ? "name=" + name + ", " : "")
				+ "rollNo=" + rollNo + ", id=" + id + "]";
	}


	public static void main(String[] args) {
		
		UserDefinedSet ob1 = new UserDefinedSet("Naman", 12, 1101);
		UserDefinedSet ob2 = new UserDefinedSet("Rekha", 13, 1104);
		UserDefinedSet ob3 = new UserDefinedSet("Rocky", 19, 1109);
		UserDefinedSet ob4 = new UserDefinedSet("Naman", 12, 1101);
		
		Set<UserDefinedSet> s = new HashSet<>();
		s.add(ob1);
		s.add(ob2);
		s.add(ob3);
		s.add(ob4);
		
		
	   for(UserDefinedSet it1 : s)
	   {
		   System.out.println(it1);
	   }
		
	}
}
