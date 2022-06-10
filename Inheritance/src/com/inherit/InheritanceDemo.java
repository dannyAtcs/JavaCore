package com.inherit;

class RBI
{
	RBI()
	{
		System.out.println("Rules and Regolations defined by RBI");
	}
}

class Bank extends RBI
{
	int p,t;
	float r;
	double SI;
	public void simpleInterest(int p , int t, float r )
	{
		this.p =p;
		this.r =r;
		this.t =t;
		SI = ((p*r*t)/100);
	}
	
	public void getSimpleInterest()
	{
		System.out.println("Simple interest is  " + SI);
	}
}
class SBI extends Bank
{
	SBI()
	{
		System.out.println("SBI BANK BACKED BY RBI");
	}
	void Facility()
	{
		System.out.println("It provides large facility like loan disbursement, net banking, CreditCards etc. ");
	}
}

class Axis extends Bank
{
	Axis()
	{
		System.out.println("AXIS BANK BACKED BY RBI");
	}
	void Facility()
	{
		System.out.println("Provides facilities like : high interest rate on deposited money, fast withdrawn, high creditcard limites ");
	}
}
  
public class InheritanceDemo
{
	public static void main(String[] args) {
		
	Axis ob = new Axis();
	ob.simpleInterest(1000, 2, 5);
	ob.getSimpleInterest();
	ob.Facility();
	
	SBI ob1 = new SBI();
    ob1.simpleInterest(1000, 2, 7);
    ob1.getSimpleInterest();
    ob1.Facility();
}
}


  

