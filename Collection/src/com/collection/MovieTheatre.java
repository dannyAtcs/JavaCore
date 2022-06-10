package com.collection;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map.Entry;

public class MovieTheatre {
    
    public static void main(String[] args) {
        
        Map<String,Integer> mp = new TreeMap<>();

        mp.put("Classic", 150);
        mp.put("Gold", 200);
        mp.put("Premium", 300);

        System.out.println(mp.keySet());

        System.out.println();
        System.out.println("Please enter type of Movie ticket: ");
         Scanner sc= new Scanner(System.in);
         String Ticket = sc.next();

         if(mp.containsKey(Ticket))
         {
            System.out.println("Price of Ticket is : " + mp.get(Ticket));
         }
         else
         {
             System.out.println("Not Available: ");
         }
       
       
         mp.remove(Ticket);
         System.out.println("Available Tickets: ");
         for(Entry<String,Integer> entry: mp.entrySet())
         {
             System.out.println(entry.getKey() + " " + entry.getValue());
         }
         sc.close();
    }

    
}
