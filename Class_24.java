/*
  Desgin a class to overload a function series() as follows:
  
  (i) double series(double n) with one double arguement and
      returns the sum of the series
      
      Sum = 1/1 + 1/2 + 1/3 +... 1/n
      
  (ii) double series(double a, double n) with two double
       arguements and returns the sum of the series
       
       Sum = 1/a^2 + 4/a^5 + 7/a^8 + 10/a^11 +... till n terms
 */

import java.util.*;
public class Class_24
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value of n: ");
        double n1 = sc.nextDouble();
        double sum1 = series(n1);
        System.out.println("The sum: " +sum1);
        System.out.println("Enter the value of a and n: ");
        double a = sc.nextDouble(); 
        double n2 = sc.nextDouble();
        double sum2 = series(a,n2);
        System.out.println("The sum: " +sum2);
    }
    public static double series(double n)
    {
        double s = 0.0;
        for(int i = 0; i <= n; i++)
        {
            s = s + 1/i;
        }
        return s;
    }
    public static double series(double a, double n)
    {
        double s = 0.0;
        double numerator = 1;
        double power = 2;
        for(int i = 0; i < n; i++)
        {
            s = numerator/(Math.pow(a,power));
            numerator+=3;
            power+=3;
        }
        return s;
    }
}