package com.String;



import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println("The Lowercases in the string are follows");
		for(int i=0;i<s.length();i++)
		{
			int j=(int)s.charAt(i);
			if((j>=65)&&(j<=122))
			{
			    if((j>=65)&&(j<=91))
				System.out.println((char)(s.charAt(i)+32));
			    
			    else
			    System.out.println((char)(s.charAt(i)-32)); 	
			}
		}
		sc.close();
	}

}
