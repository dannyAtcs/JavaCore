package com.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

class StockInsufficient extends Exception
{
	public StockInsufficient()
	{
		System.out.println("OutofStockException");
	}
}
public class Product {

	String ProductName;
    int Stock;
    int Qty;
	public Product(String productName, int stock) {
		
		ProductName = productName;
		Stock = stock;
	}
	
    
    int takeQty(int qty)
    {
    	Stock = Stock - qty;
    	return Stock;
    }
	
    
    
    public static void main(String[] args) {
		
    	Product p = new Product("Tshirts",20);
    
    	System.out.print("Enter quantity to purchase: ");
    	
    	
    	 
    	try
    	{
    		Scanner sc = new Scanner(System.in);
        	int quantity = sc.nextInt();
        	int purchased = p.takeQty(quantity);
    		if(purchased < 0)
    			throw new StockInsufficient();
    		else
    		{   System.out.println("Successfully Purchased");
    			System.out.println("Remaining Stock : " + purchased);
    			System.exit(0);
    		}	
    	}
    	catch(StockInsufficient e)
    	{
    		e.printStackTrace();
    		System.exit(0);
    	}
    	catch(InputMismatchException e)
    	{
    		e.printStackTrace();
    		System.exit(0);
    	}
    	finally
    	{
    		
    		System.out.println("Custom Exception caught");
    	}
    	
    
}
}
