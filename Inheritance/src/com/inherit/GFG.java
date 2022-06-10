package com.inherit;

public class GFG
{
    public static class superclass
    {
        static void print ()
        {    
            //print in superclass
            System.out.println ("Hi!");
        }
        
        void display()
        {
        	System.out.println("Parent class");
        }
    }
    public static class subclass extends superclass
    {
    	//Static method cant be overridden but we can defined static method in child class  
    	//what it does just hide the derived class method and calls base class method
        static void print ()
        {    
            //print in subclass
            System.out.println ("Hello!");
        }
        
        //non static method can be override
        void display()
        {
        	System.out.println("Child class");
        }
    }

    public static void main (String[]args)
    {
        superclass A = new superclass ();
        superclass B = new subclass ();
        A.print ();
        B.print();
        
        A.display();
        B.display();
    }
    //can static method be overridden if not write the c
}