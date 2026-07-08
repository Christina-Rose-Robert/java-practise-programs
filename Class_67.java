/*
  
      Fibonacci Series:
      
      0 1 1 2 3 5 8 13 21 34 [upto n]
  
 */
import java.util.*;
public class Class_67
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value for n.");
        int n = sc.nextInt();
        int a = 0, b = 1, c = 0;
        System.out.print("0 1 ");
        for(int i = 0; i < n; i++)
        {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c+" ");
        }
    }
}