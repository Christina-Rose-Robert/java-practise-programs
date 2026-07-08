/*
  Declare an array to accept and store 10 words.
  Display only those words with begin with letter
  the letter 'A' or 'a' also end with 'A' or 'a'.
  
  EXAMPLE:
  
  Input: Hari, Anitha, Akash, Amritha, Alina, Devi,
         Rishab, John, Farha, Amitha
         
  Output: Anitha
          Amritha
          Alina
          Amitha
 */

import java.util.*;
public class Class_35
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        String a[] = new String[10];
        System.out.println("Enter the names: ");
        for(int i = 0; i < 10; i ++)
        {
            a[i] = sc.next();
        }
        System.out.println("Names that start and end is 'A' or 'a' is: ");
        for (int i = 0; i < 10; i ++)
        {
            if (a[i].startsWith("A") || a[i].startsWith("a") && a[i].endsWith("a") || a[i].endsWith("A"))
            {
                System.out.println(a[i]);
            }
        }
    }
}