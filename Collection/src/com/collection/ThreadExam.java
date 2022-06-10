package com.collection;

import java.util.Scanner;

public class ThreadExam {
    
    public static void main(String[] args) {
        System.out.println("Please Enter The value of timer");
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        Thread t1 = new Thread(()->{
            for(int i=1;i<=n;i++)
            {
                try {
                    Thread.sleep(1000);
                    System.out.println(i + " Seconds Completed");
                } catch (InterruptedException e) {
                   
                    e.printStackTrace();
                }
            }
            
        });

        t1.start();
        sc.close();
    }
}
