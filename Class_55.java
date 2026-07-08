//Factorial (reccursion)

import java.util.*;
public class Class_55
{    
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        long fact = fact(a);
        System.out.println("The factorial: "+fact);
    }
    public static long fact(int a)
    {
        if(a==0)
            return 1;
        else
            return (a*fact(a-1));
    }
}