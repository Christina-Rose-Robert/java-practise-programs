/*
  The International Standard Book Number (ISBN) is a unique
  numeric book identifier which is printed on every book
  The ISBN is based on a ten digit code. The ISBN is legal
  if:
  
  1 * digit1 + 2 * digit2 + 3 * digit3 + 4 * digit4 + 5 * digit5 + 6 * digit6 + 7 * digit7 + 8 * digit8 + 9 * digit9 + 10 * digit10 
  is divisible by 11.
  
  EXAMPLE:
  
  For and ISBN 1401601499
  Sum = 1 * 1 + 2 * 4 + 3 * 0 + 4 * 1 + 5 * 6 + 6 * 0 + 7 * 1 + 8 * 4 + 9 * 9 + 10 * 9 = 259
  which is divisible by 11.
  
  Write a program to:
  
  (i) Input the ISBN code as a 10 digit integer.
  
  (ii) If the ISBN is not a 10 digit integer, give
       the output as "Illegal ISBN" and terminate 
       the program.
       
  (iii) If the number is ten digit, extract the digits
        of the number and compute the sum as explained
        above.
  (iv) If the sum is divisible by 11, give the output as
       "Legal ISBN". If the sum is not divisible by 11, 
       output the message "Illeagal ISBN"
    
 */

import java.util.*;
public class Class_25
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the ISBN number: ");
        long ISBN = sc.nextLong();
        long copy = ISBN;
        long d1 = 0;
        long d2 = 0;
        long sum = 0;
        int c = 0;
        while(ISBN > 0)
        {
            d1 = ISBN % 10;
            c++;
            ISBN/=10;
        }
        if(c != 10)
        {
          System.out.println("Illegal ISBN");
          System.exit(0);
        }
        else if ( c == 10 )
        {
          while(copy > 0)
            {
                d2 = copy % 10;
                sum = sum + d2;
                copy/=10;
            }
          if(sum % 11 == 0)
            {
                System.out.println("Legal ISBN");
            }
        }
        else
        {
         System.out.println("Illegal ISBN");
        }
    }
}