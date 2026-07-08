//Write a method which acepts a number and checks whether it is a palindrome number or not.  
import java.util.*;
public class Class_63
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        boolean isPalindrome = isPalindrome(n);
        if(isPalindrome)
        {
            System.out.println(n+" is a Palindrom number.");
        }
        else
        {
            System.out.println(n+" is not a Palindrome number.");
        }
    }
    public static boolean isPalindrome(int n)
    {
        boolean flag = false;
        int copy = n, d = 0, rev = 0;
        while(copy > 0)
        {
            d = copy % 10;
            rev = (rev * 10) + d;
            copy /= 10;
        }
        if(n == rev)
        {
            flag = true;
        }
        else
        {
            flag = false;
        }
        return flag;
    }
}