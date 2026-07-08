/*
  A special two digit number is such that when the 
  sum of its digits is added to the product of its 
  digits, the result is equal to the original two
  digit number. 
  
  EXAMPLE:
  
  Consider the number 59
  Sum of digits = 5 + 9 = 14
  Product of its digits = 5 x 9 = 45
  Sum of the sum of digits and product of digits = 14 + 45 = 59
  
  Write a program to accept a two digit number. Add 
  the sum of its digits to the product of its digits.
  If the value is equal to the number input, output 
  the message "Special two digit number" otherwise,
  output the message "Not a special two digit number"
 */
import java.util.*;
public class Class_59
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int copy = n, d;
        int d1 = n%10;
        int d2 = n/10;
        int sum = d1+d2;
        int product = d1*d2;
        if((sum + product) == n)
        {
            System.out.println("Special two digit number");
        }
        else
        {
            System.out.println("Not a special two digit number");
        }
    }
}