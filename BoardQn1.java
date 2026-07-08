 /*
   [2023]
   Define a class to overload the function print as follows:
   
   1. void print() to print the following format

   1 1 1 1
   2 2 2 2
   3 3 3 3 
   4 4 4 4 
   5 5 5 5
   
   2. void print(int n) to check whether the number 
   is a lead number. A lead number is the one whose 
   sum of even digits is equal to sum of odd digits.
   
   EXAMPLE:
   In the number 3669
   Sum (of odd digits) = 12
   Sum (of even digits) = 12
  */
 
 import java.util.*;
 public class BoardQn1
 {
     public static void main()
     {
         Scanner sc = new Scanner(System.in);
         print();
         System.out.println("Enter the number to be checked: ");
         int n = sc.nextInt();
         print(n);
     }
     public static void print()
     {
        for(int i = 1; i <= 5; i++ )
        {
            for(int j = 1; j <=5; j++)
            {
                System.out.print(i+" ");
            }
            System.out.println("");
        }
     }
     public static void print(int n)
     {
         int copy = n; int d = 0; int SumEven = 0; int SumOdd = 0;
         while (copy > 0)
         {
             d = copy % 10;
             if (d % 2 == 0)
             {
                 SumEven += d; 
             }
             else 
             {
                 SumOdd += d;
             }
             copy/=10;
         }
         if(SumEven == SumOdd)
         {
             System.out.println(n+" is a lead number!");
         }
         else
         {
             System.out.println(n+" is not a lead number!");
         }
     }
 }