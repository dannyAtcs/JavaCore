package com.exception;

import java.util.Scanner;

//
//Given a string find the character in particular location in the string
//This exercise contains a class named CharacterFinder with the following method:
//+characterLocator(String, String) : character  
//   - Should take two String values as input and return a character as result
//   - Should also handle exception thrown by logic using try and catch 

class CharNotFound extends Exception
{
	public CharNotFound()
	{
		System.out.println("CharNotFound Exception");
	}
}
public class CharacterFinder {
	
	public void characterLocator(String str1, String str2)
	{
		int countCommon = 0;
		for(int i=0;i<str2.length();i++)
		{
			char c = str2.charAt(i);
			int countOccurance = 0;
			
			for(int j=0;j<str1.length();j++)
			{
				if(str1.charAt(j)==c)
				{
					countOccurance++;
					countCommon++;
					if(countOccurance<2)
						System.out.println("Commom characters :" + c);
					else
						continue;	
				}
				
			}
		
		}
		try
		{
			if(countCommon <= 0)
				throw new CharNotFound();
			else
				System.out.println("Commom characters count :" + countCommon);
		}
		catch(CharNotFound e)
		{
			e.printStackTrace();
		}
		finally{
			System.out.println("Exception handled successfully");
		}
	}
	
	public static void main(String[] args) {
		
		CharacterFinder ob = new CharacterFinder();
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		ob.characterLocator(str1,str2);
	}

}
