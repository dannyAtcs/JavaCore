package com.collection;

//1st way to use thread by extending Thread
// public class ThreadPractice extends Thread {
    
//     public void run()
//     {
//         System.out.println("Thread is running....");
//     }

//     public static void main(String[] args) {
        
//         ThreadPractice ob = new ThreadPractice();
//         ob.start();
//     }

// }

// 2nd by using runnable interface

// public class ThreadPractice implements Runnable
// {

//     @Override
//     public void run() {
      
//         System.out.println("By using Runnable interface..");
        
//     }

//     public static void main(String[] args) {
        
//         ThreadPractice ob = new ThreadPractice();
//         Thread obj = new Thread(ob);
//         obj.start();
//     }
// }

public class ThreadPractice 
{
    public static void main(String[] args) {
        
        Thread t1 = new Thread(()->{
            System.out.println("Thread 1 is Running..");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
               
                e.printStackTrace();
            }
            System.out.println("Exiting Thread 1..");
        });

        Thread t2 = new Thread(()->{
            System.out.println("Thread 2 is Running..");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
               
                e.printStackTrace();
            }
            System.out.println("Exiting Thread 2..");
        });

        Thread t3 = new Thread(()->{
            System.out.println("Thread 3 is Running..");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
               
                e.printStackTrace();
            }
            System.out.println("Exiting Thread 3..");
        });

        try {
            System.out.println("Waiting for Thread 1 to start...");
            t1.start();
            
            t1.join(500);

            System.out.println("Waiting for Thread 2 to start...");
            t2.start();

            t2.join(500);

            System.out.println("Waiting for Thread 3 to start...");
            t3.start();

            t3.join();

        } catch (Exception e) {
            System.out.println("Exception occurs");
        }

    }
}