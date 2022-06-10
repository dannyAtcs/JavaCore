package com.absinte;
interface father
{
	interface mother
	{
		interface Gender
		{
			void Son();
			void Daughter();
		}
	
	}
}
public class NestedInterfaces implements father.mother.Gender {

	public void Son() {
	
		System.out.println("Son is born ");
		
	}

	public void Daughter() {
	
		System.out.println("Daughter is born ");
		
	}
    public static void main(String[] args) {
		
    	father.mother.Gender ob = new NestedInterfaces(); //upcasting
		ob.Daughter();
		ob.Son();
			
	}
	

}
