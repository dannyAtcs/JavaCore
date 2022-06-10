package com.exception;
class MinBalanceException extends Exception
{
    public MinBalanceException ()
    {
        System.out.println ("InsufficientFundException");
    }
}
public class InsufficientFundException
{
    public static void main (String[]args)
    {
        try
        {

            int acc[] = { 100, 101, 102, 103, 104, 105 }; // input can be got from runtime too 
            double balance[] = { 2000 ,900,  1500, 1560, 1765.50 };
            System.out.println ("Account No\t" + "Balance\t");
            for (int i = 0; i < 5; i++)
            {
               System.out.println (acc[i] + "\t\t" + balance[i] + "\t");
               if (balance[i] < 1000)
               {
                   throw new MinBalanceException (); //throwing user defined exception
               }
            }
        }
        catch (MinBalanceException e)
        {
           e.printStackTrace();
        }
        finally
        {
        	System.gc();
        }
    }
}
