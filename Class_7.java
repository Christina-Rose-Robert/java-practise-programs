 /*
  * Program to count the number of uppercase, lowercase, numbers and special characters in a string.
  */
 import java.util.*;
 public class Class_7
 {
     public static void main()
     {
         Scanner sc = new Scanner (System.in);
         System.out.println("Enter a string: ");
         String s = sc.nextLine();
         int c1 = 0, c2 = 0, c3 = 0, c4 = 0; //Uppercase: c1, lowercase: c2, numbers:c3 and special characters: c4
         for(int i = 0; i < s.length(); i++)
         {
             char ch = s.charAt(i);
             if(ch >= 'A' && ch <= 'Z')
             c1++;
             else if(ch >= 'a' && ch <='z')
             c2++;
             else if(ch >= '0' && ch <= '9' )
             c3++;
             else
             c4++;
         }
         System.out.println("Count of uppercase alphabets: "+c1);
         System.out.println("Count of lowercase alphabets: "+c2);
         System.out.println("Count of numbers: "+c3);
         System.out.println("Count of special characters: "+c4);
     }
 }