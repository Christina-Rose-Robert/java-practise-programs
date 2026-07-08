/*
  
    FASCINATING NUMBER:
      
    Example:
    
    273 x 1 = 273
    273 x 2 = 546
    273 x 3 = 819
    
    Concatenate the products.
    
    273546819
    
    If the above number contains digits from 1 to 9, then it is a fascinating number.
 
 */
import java.util.*;
public class Question_III
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int a = n * 1;
        int b = n * 2;
        int c = n * 3;
        int count_a = DigitCounter(a);
        int count_b = DigitCounter(b);
        int count_c = DigitCounter(c);
        long concatenate = concatenate(a, b, c, count_a, count_b, count_c);
        boolean isFascinatingNumber = isFascinatingNumber(concatenate);
        if(isFascinatingNumber)
        {
            System.out.println(n+" is a Fascinating number.");
        }
        else
        {
            System.out.println(n+" is not a Fascinating number.");
        }
    }
    public static int DigitCounter(int n)
    {
        int copy = n, d = 0, counter = 0;
        while(copy > 0)
        {
           d = copy % 10;
           counter++;
           copy /= 10;
        }
        return counter;
    }
    public static long concatenate(int a, int b, int c, int count_a, int count_b, int count_c)
    {
        int multiplier_b = 1;
        while(count_b > 0)
        {
            multiplier_b *= 10;
            count_b -= 1;
        }
        long concatenate_temp = (a * multiplier_b) + b;
        int multiplier_c = 1;
        while(count_c > 0)
        {
            multiplier_c *= 10;
            count_c -= 1;
        }
        long concatenate_final = (concatenate_temp * multiplier_c) + c;
        return concatenate_final;
    }
    public static boolean isFascinatingNumber(long concatenate)
    {
        long copy = concatenate, d = 0, c = 0;
        boolean flag = false;
        boolean one = false;
        boolean two = false;
        boolean three = false;
        boolean four = false;
        boolean five = false;
        boolean six = false;
        boolean seven = false;
        boolean eight = false;
        boolean nine = false;
        boolean ten = false;
        while(copy > 0)
        {
            d = copy % 10;
            if(d == 1)
            {
                one = true;
            }
            else if (d == 2)
            {
                two = true;
            }
            else if (d == 3)
            {
                three = true;
            }
            else if (d == 4)
            {
                four = true;
            }
            else if (d == 5)
            {
                five = true;
            }
            else if (d == 6)
            {
                six = true;
            }
            else if (d == 7)
            {
                seven = true;
            }
            else if (d == 8)
            {
                eight = true;
            }
            else if (d == 9)
            {
                nine = true;
            }
            copy /= 10;
        }
        if (one && two && three && four && five && six && seven && eight && nine)
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