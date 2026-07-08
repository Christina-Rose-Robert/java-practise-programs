/*
 
     Enter a number and a character. 
     If the number is 5 and the character is #, then print:
     
     #####
     #   #
     #   #
     #   #
     #####
 
 */
import java.util.*;
public class Class_70
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);
        pattern(n,ch);
    }
    public static void pattern(int n, char ch)
    {
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