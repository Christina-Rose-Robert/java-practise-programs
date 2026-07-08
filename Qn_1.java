/*
 
Write a program to input a number and check it is a Magical number or not using a method
isMagic() which returns a boolean value.

 */
import java.util.*;
public class Qn_1
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        if(isMagic(n))
         System.out.println(n+ " is a magical number");
         else
         System.out.println(n+ " is not a magical number");
    }
    public static boolean isMagic(int num)
    {
       while (num > 9) 
       {
            int sum = 0;
            while (num > 0) 
            {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
       if (num == 1)
        return true;
       else
        return false;
    }
}