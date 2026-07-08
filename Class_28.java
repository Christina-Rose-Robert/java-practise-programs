/*
 Design a class to overload a function series() as follows:
 
 (a) void series(int x, int n)
     Display the sum of series given below:
     
     x^1 + x^2 + x^3 +... + x^n terms
     
 (b) void series(int p)
     To display the following series:
     
     0, 7, 26, 63... p terms
     
 (c) void series()
     To display the sum of the series given below:
     
     1/2 + 1/3 + 1/4 +... +1/10
 */

import java.util.*;
public class Class_28
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value for x and n: "); //Section A
        int x = sc.nextInt();
        int n = sc.nextInt();
        series(x,n);
        System.out.println("Enter the value of p: "); //Section B
        int p = sc.nextInt();
        series(p);
        series();
    }
    public static void series(int x, int n)
    {
        double sum = 0;
        for(int i = 1; i <= n; i++)
        {
            sum = sum + Math.pow(x,i);
        }
        System.out.println("The sum: "+sum);
    }
    public static void series(int p)
    {
        for(int i = 1; i <= p; i++)
        {
            System.out.print((Math.pow(i,3)-1)+", ");
        }
        System.out.println("");
    }
    public static void series()
    {
        double sum = 0;
        for(int i = 1; i <= 10; i++)
        {
            sum = sum + 1.0/i;
        }
        System.out.println("Sum: "+sum);
    }
}