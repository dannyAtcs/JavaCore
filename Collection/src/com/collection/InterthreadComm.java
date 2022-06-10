package com.collection;

import java.util.Scanner;

//Tshirts 
public class InterthreadComm {
    
    int Stock= 200;

    synchronized void getStock(int Stock)
    {
        if(this.Stock < Stock)
        {
           
            try {
               
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.Stock -= Stock;
        System.out.println("Tshirts Stock Sold successfully ");
        System.out.println("Remaining Stock : " + this.Stock);
        return ;
    }

    synchronized void PurchaseStock(int Stock)
    {
            this.Stock +=  Stock;
            System.out.println(); 
            System.out.println("Tshirts Stock purchased successfully ");
            System.out.println("Remaining Stock : " + this.Stock);
            notify();
    }

    public static void main(String[] args) {
        final InterthreadComm ob = new InterthreadComm();
       // Scanner sc = new Scanner(System.in);
       System.out.println("Enter Stock to buy: ");
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
        Thread t5 = new Thread(()->{
                
            ob.getStock(n);
            
        });
        t5.start();
        Thread t6 = new Thread(()->{
            
            ob.PurchaseStock(100);   
        });
       
        t6.start();
        sc.close();
      
        
    }
}
