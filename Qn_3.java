/*
  Write a program to input a number and check
  and print whether it is a pronic number or 
  not.
  Pronic number is the number which is the
  product of two consecutive integers.
  
  EXAMPLES:
  
  12 = 3 x 4
  20 = 4 x 5
*/

import java.util.*;
public class Qn_3
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to be checked: ");
        int n = sc.nextInt();
        for(int i = 1; i < n/2; i++)
        {
            if(n % i == 0)
            {
                if(i * (i + 1) == n)
                {
                    System.out.println("Its a pronic number.");
                    break;
                }
            }
        }    
    }
}