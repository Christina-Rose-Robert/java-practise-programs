// Spy number: the sum of all the digits is equal to the product of all digits.
import java.util.*;
public class Class_66
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0; 
        int product = 1;
        int copy = n, d = 0;
        while(copy > 0)
        {
            d = copy % 10;
            sum += d;
            product *= d;
            copy /= 10;
        }
        if(sum == product)
        {
            System.out.println(n+" is a spy number.");
        }
        else
        {
            System.out.println(n+ " is not a spy number.");
        }
    }
}