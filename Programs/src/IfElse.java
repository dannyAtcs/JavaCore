
public class IfElse {

	public static void main(String[] args)
	{
		
		int a= 10;
		int b=20;
		int c =5;
		int age = 20;
		String country = "USA";
		//if else
		if(a>b)
		{
			System.out.println("Maximum Out of 2 is " + a);
		}
		else
		{
			System.out.println("Maximum Out of 2 is  " + b);
		}
		
		//if else if
		if(a>b && a > c)
		{
			System.out.println("Maximum Out of 3 is " + a);
		}
		else if(b>a && b>c)
		{
			System.out.println("Maximum Out of 3 is  " + b);
		}
		else
		{
			System.out.println("Maximum Out of 3 is  " + c);
		}
		
		
		//nested if
		
		if(country == "India")
		{
			if(age>=18)
			{
				System.out.println("Eligible for Voting ");
			}
			else
			{
				System.out.println("Not Eligible for Voting ");
			}
		}
		else
		{
			System.out.println("Invalid Country");
		}
		
		
	}
}
