package com.exception;
class UnderAge extends Exception
{
	public UnderAge() {
		super("You are underage for voting as per Indian Govt. ");
	}
}
public class Voting {
   
	public static void main(String[] args)  {
		
		int age = 17;
		try
		{
		if(age > 18)
		{
			System.out.println("You can vote now...");
		}
		else
		{  
			//Way of throwing custom exception
			throw new UnderAge();
		}
		}
		catch(UnderAge e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println(" Custom exception is succussfully caught");
		}
	}
}
