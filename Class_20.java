/*
  Design a class to overload a method number() as follows:
  
  (i) void Number(int num, int d) - To count and display the
                                    frequency of a digit in
                                    a number.
                                    
  EXAMPLE:
  
  Input: 2565685
        Find the frequency of 5
        
  Output: Frequency of the entered number is 3
  
  (ii) void Number(int n1) - To find and display the sum of 
                             even digits of a number.
                             
  EXAMPLE:
  
  Input: 29865
  Output: Sum of even digits = 16
  
  Write a main method to create an object and invoke the above methods.
 */

import java.util.*;
public class Class_20
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        Class_20 obj = new Class_20();
        System.out.println("Enter a number and the specified number of which you want to check the frequency: ");
        int num = sc.nextInt(); 
        int d = sc.nextInt();
        obj.Number(num,d);
        System.out.println("Enter a number: ");
        int n1 = sc.nextInt();
        obj.Number(n1);
    }
    public static void Number(int num, int d)
    {
        int digit = 0;
        int c = 0;
        while(num > 0)
        {
            digit = num % 10;
            if(digit == d)
            {
                c++;
            }
            num/=10;
        }
        System.out.println("Frequency of the entered number is: "+c);
    }
    public static void Number(int n1)
    {
        int d = 0;
        int s = 0;
        while(n1 > 0)
        {
            d = n1 % 10;
            if(d % 2 == 0)
            {
                s+=d;
            }
            n1/=10;
        }
        System.out.println("Sum of even digits = "+s);
    }
}