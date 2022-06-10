package com.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

import java.util.Set;

public class Student {
    
    int rollNo;
    String name;
    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", rollNo=" + rollNo + "]";
    }
    
    public static void main(String[] args) {
        
        Student ob1 = new Student(101, "Raman");
        Student ob2 = new Student(102, "Raghav");
        Student ob3 = new Student(103, "Rohit");
        Student ob4 = new Student(104, "Ricky");

        Set<Student> s = new HashSet<>();
        s.add(ob1);
        s.add(ob2);
        s.add(ob3);
        s.add(ob4);

        
        Set<Student> set = new LinkedHashSet<>(5);
        set.addAll(s);
        set.add(new Student(104, "Raju"));
        set.add(new Student(107, "Rekha"));
        for(Student it  : set)
            System.out.println(it);

    }
    
}
