package com.threads;
class Demo extends Thread
{
	public void run()
	{
		System.out.println("Thread is running ....");
	}
}
public class ViaClass {

	public static void main(String[] args) {
		Demo ob = new Demo();
		
		ob.start();
		ob.run();
	}
}
