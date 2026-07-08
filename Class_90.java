/*
  
    Write a method to calculate and return the sum of the 
    square of the digits of a number 'n', using 
    recursive technique. 
    
    The method declaration is as follows:
    int sumSq(int n)
  
 */

import java.util.*;
public class Class_90
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int SUM = sumSq(n);
    }
    public static int sumSq(int n)
    {
        if(n == 0)
        {
            return 0;
        }
        else
        {
            int digit = n % 10;
            return ((digit * digit) + sumSq(n/10));
        }
    }
}