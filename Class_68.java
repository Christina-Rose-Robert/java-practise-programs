// Reverse a number
import java.util.*;
public class Class_68
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int  copy = n, rev = 0, d = 0;
        while(copy > 0)
        {
            d = copy % 10;
            rev = (rev * 10) + d;
            copy /= 10;
        }
        System.out.println("Reverse: "+rev);
    }
}