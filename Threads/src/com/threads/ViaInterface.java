package com.threads;
class Demo1 implements Runnable
{

	public void run() {
		
		System.out.println("Thread is running...");
		
	}
	
}
public class ViaInterface {
	
	public static void main(String[] args) {
		
		Demo1 ob = new Demo1();
		
		Thread t2 = new Thread(ob);
		Thread t1 = new Thread(ob);
		t2.start();
		
		t1.start();
	}
	
}
