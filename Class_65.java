/*
    Smith Number 
    (will always be a composite number)
    
    EXAMPLE:
    
    Entered number = 85 
    
    Sum of the digits of the number = 
    8 + 5 = 30
    
    Prime factors of 85 = 
    5, 17
    
    Sum of digits of prime factors of 85 = 
    5 + (1 + 7) = 13
    
 */
import java.util.*;
public class Class_65
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        boolean is_composite = isComposite(n);
        if(is_composite)
        {
            int sum_digits = sumDigits(n);
            int sum_prime_digits = sumPrimeDigits(n);
        }
        else
        {
            System.out.println("Not a Smith number");
        }
    }
    public static boolean isComposite(int n)
    {
        boolean flag = false;
        for(int i = 2; i < n/2; i++)
        {
            if (n % i == 0)
            {
                flag = true;
            }
        }
        return flag;
    }
    public static int sumDigits(int n)
    {
        int copy = n, d = 0, sum = 0;
        while(copy > 0)
        {
            d = copy % 10;
            sum = sum + d;
            copy /= 10;
        }
        return sum;
    }
    public static int sumPrimeDigits (int n)
    {
        int sum = 0;
        int sumPrimeDigits = 0;
       
        for(int i = 2; i < n; i++) 
        {
            while(n % i == 0) 
            {
                n /= i;
                int temp = i;
                while (temp != 0) 
                {
                    int d = temp % 10;
                    System.out.println(d);
                    sumPrimeDigits += d;
                    temp /= 10;
                }
            }
        }
        if(n > 2)
        {
            while (n != 0) 
            {
                int d = n % 10;
                System.out.println(d);

                sumPrimeDigits += d;
                n /= 10;
            }
        }
        System.out.println("sum : "+sumPrimeDigits);
        return sum;
    }
}