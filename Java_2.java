/*
   2. Using switch statement and methods write a menu driven program to do the following:
      (a) Input a number, a digit to be found, and a digit to replace the found digit. Print the new
          number and state how many replacements have been made.
          E.g.: Input: 9080204070 Digit to be found: 0 Digit to be replaced with: 1
                New number: 9181214171
                Count of replacements: 5
      (b) Input a number and arrange the digits of it in descending order.
          E.g.: Input: 4863027195. New number: 9876543210
*/
import java.util.*;
public class Java_2
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("\t \t \t MENU");
        System.out.println("(a) Replacement of a digit with another digit of your choice.");
        System.out.println("(b) Converts to descending order of the digits you enter.");
        System.out.println("Enter your choice: ");
        char ch = sc.next().charAt(0);
        switch (ch)
        {
            case 'a':
            case 'A':
            System.out.println("Enter the number, the digit to be found, and the digit to be replaced with : ");
            long Number_1 = sc.nextLong();
            int Digit = sc.nextInt();
            int RepDigit = sc.nextInt();
            long NewNumber_1 = Replacement(Number_1, Digit, RepDigit);
            System.out.println(" New number obtained: " + NewNumber_1 + " Number of replacements made: " );
            break;
            
            case 'b':
            case 'B':
            System.out.println("Enter the number: ");
            long Number_2 = sc.nextLong();
            long NewNumber_2 = Descending(Number_2);
            System.out.println("Descending number obtained: " + NewNumber_2);
        }
    }
    public static long Replacement(long n1, int digit, int repd)
    {  
      long n = 0; long d = 0; int c = 0;
      n = n1;
      while(n>0)
      {
        d = n % 10;
        if (n == digit)
        {
            n = repd;
            c++;
        }
        n = n / 10;
      }
      return n;
    }
    public static long Descending(long n2)
    {
     long n = 0; long d = 0; int small = 0; int large = 0;
     n = n2;
     while (n>0)
     {
         d = n % 10;
         if (n < (n2 % 10))
         {
             n = small;
         }
         n = n / 10;
     }
     return n;
    }
}