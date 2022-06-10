package com.String;

public class ABC {
    public static void main(String[] args) {
		
    	char ch[] = {'s','t','r','i','n','g'};
    	String s = new String(ch);
    	System.out.println(s);
    	
    	String s1 = "This is a java programming training";
    	System.out.println(s1.trim());
    	System.out.println(s1.charAt(3));
    	
    	System.out.println(s1.concat(" Provided by ATCS through IA LABS"));
    	System.out.println(s1);
    	System.out.println(s1.substring((s1.length()-8),(s1.length())));
    	
    	System.out.println(s1.isEmpty());
    	
	}
}
