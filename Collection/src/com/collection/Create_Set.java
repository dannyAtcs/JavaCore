package com.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Create_Set {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();
		
		//set doesnt contains duplicate values
		set.add(1);
		set.add(3);
		set.add(5);
		set.add(3);
		set.add(7);
		set.add(5);
		
		System.out.println(set);
		
		set.remove(3);
		System.out.println(set);
		
		set.removeAll(set);
		System.out.println(set);
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(12);
		list1.add(15);
		list1.add(18);
		System.out.println(list1);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(12);
		list2.add(21);
		list2.add(24);
		System.out.println(list2);
		
		//Random order
		Set<Integer> set1 = new HashSet<>(list1);
		set1.addAll(list2);
		System.out.println(set1);
		set1.remove(12);
		System.out.println(set1);
		set1.removeAll(set1);
		System.out.println(set1);
		
		
		//Sorted order
		Set<Integer> set2 = new TreeSet<>(list1);
		set2.addAll(list2);
		System.out.println(set2);
		
		for(int it : set2)
		{
			System.out.print(it + " ");
		}
		
		
	}
	
}
