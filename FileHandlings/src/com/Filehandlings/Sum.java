package com.Filehandlings;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//This is a mainclass Sum.java
public class Sum {

    public static void main(String[] args) {

        // Reading a file
        File ob = new File("C:\\Users\\danny.gupta\\Desktop\\FileHandling\\list.txt");

        // use try catch block because if it does not find file list.txt then it will
        // throw an exception
        try {
            // reading a file using scanner class
            Scanner Sc = new Scanner(ob);

            int Sum = 0;
            int count = 0;
            // this loop will run only 6 times
            while (count < 6) {

                // it will data one by one and add into sum
                int data = Sc.nextInt();
                System.out.println("Number is : " + data);
                Sum += data;
                count++;

            }

            // print the sum of 6 numbers
            System.out.println("Sum of 6 numbers is : " + Sum);
            Sc.close();

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }
    }
}
