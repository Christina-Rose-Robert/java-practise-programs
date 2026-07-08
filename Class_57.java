/*
  Using the switch case statement, write a menu-driven program
  to do the following:
  
  a) To generate and print letters from A to Z and their UNICODE
   
  EXAMPLE:
         
            Letters         UNICODE
            
              A               65
              B               66
              .               .
              .               .
              .               .
              Z               90
              
  b) Display the following patter using iteration (looping) statement:
  
     1
     1  2
     1  2   3
     1  2   3   4
     1  2   3   4   5
 */
import java.util.*;
public class Class_57
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("\t\tMENU");
        System.out.println("");
        System.out.println("a) Generates and prints letters from A to Z and their UNICODE");
        System.out.println("b) Displayes a pattern");
        System.out.println("Enter your choice: ");
        char ch = sc.next().charAt(0);
        switch (ch)
        {
            case 'a':
            case 'A':
            char character = 'A';
            System.out.println("Letter\t\t\t\t\tUNICODE");
            for(int i = 0; i < 26; i++)
            {
                System.out.println(character+"\t\t\t\t\t"+(int)(character));
                character++;
            }
            break;
            
            case 'b':
            case 'B':
            for(int i = 1; i <= 5; i++)
            {
                for(int j = 1; j <= i; j++)
                {
                    System.out.print(j+"\t");
                }
                System.out.println();
            }
            
            default:
            System.out.println("Wrong Input");
        }
    }
}