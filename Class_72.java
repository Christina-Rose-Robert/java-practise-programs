/*
  
     Design a Java program to overload a method Number() as follows:
     
     (i) void Number(int num, int d) — To count and display the frequency of a digit in a
         number.
         Example:
         num = 2565685
         d = 5
         Frequency of digit 5 = 3
         
    (ii) void Number(int n) — To find and display the sum of even digits of a number.
         Example:
         n1 = 29865
         Sum of even digits = 2 + 8 + 6 = 16
          
   (iii) Write a main method to read values and call the functions appropriately. 
  
 */
import java.util.*;
public class Class_72
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("MENU:");
        System.out.println("1. Displays the frequency of the digit of your choice from the entered number.");
        System.out.println("2. Display the sum of even digits of a number.");
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        switch (choice)
        {
            case 1:
            System.out.println("Enter a digit: ");
            int d = sc.nextInt();
            Number(n,d);
            break;
            
            case 2:
            Number(n);
            break;
            
            default:
            System.out.println("Invalid choice!");
        }
    }
    public static void Number(int n, int d)
    {
        int copy = n, ld = 0, c = 0;
        while(copy > 0)
        {
            ld = copy % 10;
            if(ld == d)
            {
                c++;
            }
            copy /= 10;
        }
    }
    public static void Number(int n)
    {
        int copy = n, ld = 0, sum = 0;
        while(copy > 0)
        {
            ld = copy % 10;
            if(ld % 2 == 0)
            {
                sum += ld;
            }
            copy /= 10;
        }
        System.out.println("Sum of the even digits in the number "+n+" is "+sum);
    }
}