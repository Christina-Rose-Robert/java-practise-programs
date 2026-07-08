//Factorial

import java.util.*;
public class Class_54
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);    
        System.out.println("Enter a number: ");
        int a = sc.nextInt(); long fact = 1;
        for(int i = 1; i <= a; i++)
        {
            fact = fact * i;
        }
        System.out.println("Factorial: "+fact);
    }
}