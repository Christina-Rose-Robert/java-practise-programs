 /*
    
     Design a class to overload a function series() as follows
     (a) double series(int x,int n) - To display the sum of the series given below:
         x¹ + x² + x³ + xn terms 
         
     (b) void series(int n) - To display the following series:
         0, 7, 26, 63 ... n terms
         
     (c) double series() - To display sum of series:
         1/2 + 1/3 + 1/4 ... + 1/10
    
*/
import java.util.*;
public class Java_1
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter values for x and n : ");
        int x = sc.nextInt();
        int n = sc.nextInt();
        double sum = series(x,n);
        System.out.println("Enter the number of terms : ");
        Short m = sc.nextShort();  
        series(m);
        double sum_2 = series();
    }
    public static double series(int x, int n)
    {
        double sum = 0;
        for(int i = 1; i <= n; i++)
        {
           double pow = Math.pow(x,i);
           sum = sum + pow;
        }
        return sum;
    }
    public static void series(int n)
    {
        double display = 0;
        for(int i = 1; i <=n; i++)
        {
            display = display + (Math.pow(i,3)-1);
        }
        System.out.println(display);
    }
    public static double series()
    {
        double sum = 0;
        for(int i = 2; i <= 10; i++)
        {
            sum = sum + 1.0/i;
        }
        return sum;
    }
}