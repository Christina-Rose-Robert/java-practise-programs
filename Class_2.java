import java.util.*;
public class Class_2
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt(); int i = n;
        int d; int s = 0;
        while (n > 0)
        {
            d = n % 10;
            s = s + d;
            n = n / 10;
        }
        if ( i % s == 0)
        System.out.println("Niven");
        else
        System.out.println("Not niven");
    }
}