/*
  [2023]
  Define a class to accept a String
  and print the number of digits,
  alphabets and special characters in
  the String.
  
  EXAMPLE:
  
  Input : "KAPILDEV@83"
  Output : 
  Number of digits: 2
  Number of alphabets: 8
  Number of special characters: 1
 */

import java.util.*;
public class Random
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a string: ");
        String str = sc.next();
        int l = str.length();
        int c1 = 0; //Digits
        int c2 = 0; //Alphabets
        int c3 = 0; //Special Characters
        for(int i = 0; i < l; i++)
        {
            char ch = str.charAt(i);
            if(ch >= '0' && ch <='9') //Checks for the presence of a digit
            {
              c1++;  
            }
            else if(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') //Checks for the presence of an alphabet
            {
              c2++;
            }
            else //Special Characters
            {
            c3++;
            }
        }
        System.out.println("Number of digits: " +c1);
        System.out.println("Number of alphabets: " +c2);
        System.out.println("Number of special characters: " +c3);
    }
}