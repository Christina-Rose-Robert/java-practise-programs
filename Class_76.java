//toUpperCase() and toLowerCase()
import java.util.*;
public class Class_76
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a lower-case character: ");
        char ch1 = sc.next().charAt(0);
        System.out.println(ch1+" to upper-case is "+ Character.toUpperCase(ch1));
        System.out.println("Enter an upper-case character: ");
        char ch2 = sc.next().charAt(0);
        System.out.println(ch2+" to lower-case is "+ Character.toLowerCase(ch2));
    }
}