/*
 
   • boolean check(int number, int digit):
     Print an appropriate message and returns true if the digit exists in the number or not; 
     otherwise print an appropriate message and return false.
     
     If number=5897 , digit=9
     Then output : Digit is present 
     
   • boolean check(int number): 
     Print an appropriate message and return true if the number is a Niven number or not; 
     otherwise print an appropriate message and returns false. 
     
     If number=18
     sumofdigits=> (1+8=9)
     18 is divisible by 9
     Then output: Its is a Niven number
     
   • check(int number, char ch):
     Print a hollow square pattern. 
     Enter a number and a character. 
     If the number is 5 and the character is #, then print:
     
     #####
     #   #
     #   #
     #   #
     #####
 
 */
import java.util.*;
public class Class_71
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("MENU:");
        System.out.println("1. Checks if a digit of your choice is present in the entered number.");
        System.out.println("2. Checks if the entered number is a Niven number.");
        System.out.println("3. Prints a hollow square pattern.");
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        switch (choice)
        {
            case 1: 
            System.out.println("Enter a digit: ");
            int digit = sc.nextInt();
            boolean isDigitPresent = isDigitPresent(number, digit);
            if(isDigitPresent)
            {
                System.out.println(digit+" is present in the number "+number);
            }
            else
            {
                System.out.println(digit+" is not present in the number "+number);                        
            }
            break;
            
            case 2: 
            boolean isNiven = isNiven(number);
            if(isNiven)
            {
                System.out.println(number+" is a Niven number ");
            }
            else
            {
                System.out.println(number+" is not a Niven number");
            }
            break;
            
            case 3:
            System.out.println("Enter a character: ");
            char ch = sc.next().charAt(0);
            pattern(number,ch);
            break;
            
            default:System.out.println("Invalid choice!");
        }
    }
    public static boolean isDigitPresent(int number, int digit)
    {
        int copy = number, d = 0;
        boolean flag = false;
        while(copy > 0)
        {
            d = copy % 10;
            if(d == digit)
            {
                flag = true; 
                break;
            }
            copy /= 10;
        }
        return flag;
    }
    public static boolean isNiven(int number)
    {
        int copy = number, d = 0, sum = 0;
        boolean flag = false;
        while(copy > 0)
        {
            d = copy % 10;
            sum += d;
            copy /= 10;
        }
        if(number % sum == 0)
        {
            flag = true; 
        }
        return flag;
    }
    public static void pattern(int number, char ch)
    {
        int n = number;
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n; j++)
            {
                if(i == 1)
                {
                    System.out.print(ch);
                }
                else if(i == n)
                {
                    System.out.print(ch);
                }
                else
                {
                    System.out.print(ch);
                    for(int k = 1; k <= n-2; k++)
                    {
                        System.out.print(" ");
                    }
                    System.out.print(ch); 
                    break;
                }
            }
            System.out.println();
        }
    }
}