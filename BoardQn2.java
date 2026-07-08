/*
   [ARRAY BASED QUESTION]
 
  Define a class to declare a character array of size 10.
  Accept the characters into the array and display the
  characters with highest and lowest ASCII value.
  
  EXAMPLE:
  
  Input:
  'R','z','q','A','N','p','M','U','Q','F'
  
  Output:
  Character with highest ASCII value: z
  Character with highest ASCII value: A
  
 */

import java.util.*;
public class BoardQn2
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        char a[] = new char[10];
        char maximum = 'A';
        char minimum = 'z';
        System.out.println("Enter ten elements: ");
        for(int i = 0; i < 10; i++)
        {
            a[i] = sc.next().charAt(0);
        }
        for(int i = 0; i < 10; i++)
        {
            char ch = a[i];
            if( (int)ch > (int)maximum)
            {
                maximum = a[i];
            }
            else if( (int)ch < (int)minimum)
            {
                minimum = a[i];
            }
        }
        System.out.println("Character with highest ASCII value: "+maximum);
        System.out.println("Character with lowest ASCII value: "+minimum);
    }
}