package com.absinte;

interface Govt {
	
	void Elections();
	void Assembly();
	void SupremeCourt();

}
//if we dont want to implements all the methods in implemented class 
//then we have to  make class an abstract
abstract class Duty implements Govt
{
	abstract void SalaryAccounts();
}

public class Bank extends Duty
{

	public void Elections() {
		System.out.println("Elections is conducted by election comission ");
		
	}

	public void Assembly() {
		System.out.println("ALL the decisions for the country should be taken in the assembly ");
		
	}

	public void SupremeCourt() {
		System.out.println("SuperemeCourt is the highest level of judiciary ");
		
	}

	void SalaryAccounts() {
		System.out.println("All the employees salaries transfer their salary account");
		
	}
	
	public static void main(String[] args) {
		Bank ob = new Bank();
		
		ob.Elections();
		ob.Assembly();
		ob.SupremeCourt();
		ob.SalaryAccounts();
		
	}
	
}
