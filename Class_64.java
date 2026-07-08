/*
    Prime-Adam number
 */
import java.util.*;
public class Class_64
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if(n>0)
        {
            boolean prime = prime(n);
            if(prime)
            {
               int squarePrime = square(n);
               int copy = n, rev = 0, d = 0;
               while (copy > 0)
               {
                   d = copy % 10;
                   rev = ( rev * 10 ) + d;
                   copy /= 10; 
               }
               int squareReverse = square(rev);
               boolean adam = adam(squarePrime,squareReverse);
               if(prime && adam)
               {
                   System.out.println("The entered number is a Prime-Adam number.");
               }
               else
               {
                   System.out.println("The entered number is not a Prime-Adam number.");
               }
            }
            else
            {
               System.out.println("Not a Prime-Adam number."); 
            }
        }
        else
        {
            System.out.println("Invalid entry! Enter a positive number.");
        }
    }
    public static boolean prime(int n)
    {
        boolean flag = true;
        for(int i = 2; i <= n/2; i++)
        {
            if(n % i == 0)
            {
               flag = false;
            }
        }
        return flag;
    }
    public static int square(int n)
    {
        int sq = n * n;
        return sq; 
    }
    public static boolean adam(int squarePrime, int squareReverse)
    {
         boolean flag = false;
         int copy = squarePrime, revSquarePrime = 0, d = 0;
         while (copy > 0)
         {
             d = copy % 10;
             revSquarePrime = ( revSquarePrime * 10 ) + d;
             copy /= 10; 
         }
         if(revSquarePrime == squareReverse)
         {
             flag = true;
             return flag;
         }
         else
         {
             return flag;
         }
    }
}