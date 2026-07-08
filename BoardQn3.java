/*
   Write a program to find the smallest digit in an entered number.
 */

import java.util.*;
public class BoardQn3
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int d = 0;
        int min = n % 10;
        while(n > 0)
        {
            d = n % 10;
            if(d < min)
            {
                min = d;
            }
            n/=10;
        }
        System.out.println("Smallest digit in the number: " +min);
    }
}