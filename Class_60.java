/*
  Using the switch statement, write a menu-driven
  program for the following:
  
  1) To print the Floyd's triangle (given below)
  
     1
     2  3
     4  5  6
     7  8  9  10
     11 12 13 14 15
     
  2) To display the following pattern
      
      I
      I C
      I C S
      I C S E
      
  For an incorrect option, an appropriate error message should be displayed.
 */

import java.util.*;
public class Class_60
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("MENU");
        System.out.println("1) To print the Floyd's triangle");
        System.out.println("2) To display a pattern");
        System.out.println("Enter your choice");
        int choice = sc.nextInt();
        switch (choice)
        {
            case 1:
            int a = 1;
            for(int i = 1; i <= 5; i++)
            {
                for(int j = 1; j <= i; j++)
                {
                    System.out.print(a+" ");
                    a++;
                }
                System.out.println("");
            }
            break;
            
            case 2:
            String word = "ICSE";
            int l = word.length();
            for(int i = 1; i < l; i++)
            {
                for(int j = 0; j <= i; j++)
                {
                    System.out.print(word.charAt(j)+"  ");
                }
                System.out.println("");
            }
        }
    }
}