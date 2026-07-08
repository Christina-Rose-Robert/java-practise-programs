//Concatinate two strings
import java.util.*;
public class Class_77
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter two strings: ");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(s1.concat(s2));
    }
}