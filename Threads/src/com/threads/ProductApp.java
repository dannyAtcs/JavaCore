package com.threads;


class Tshirt
{
	int Total_Stocks=2000;
	
	synchronized void BookTshirt(int stock)
	{
		if(stock>Total_Stocks)
		{
			System.out.println(stock + " Out of Stock ");
			System.out.println("Only " + Total_Stocks + " Tshirts are available");
		}
		else
		{
			System.out.println(stock + " Tshirts Successfully purchased");
			Total_Stocks = Total_Stocks - stock;
			System.out.println("Remaining Tshirts " + Total_Stocks);
		}
		
	}
}

public class ProductApp extends Thread
{
	static Tshirt m;
	int Stock;
	public void run()
	{
		m.BookTshirt(Stock);
	}
	public static void main(String[] args) {
		
		m = new Tshirt();
		ProductApp t1 = new ProductApp();
		t1.Stock = 1000;
		t1.start();
		ProductApp t2 = new ProductApp();
		t2.Stock = 500;
		t2.start();
		ProductApp t3 = new ProductApp();
		t3.Stock = 600;
		t3.start();
	
	}
}