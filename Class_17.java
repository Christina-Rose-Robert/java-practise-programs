/*
  Write a java program to input a word.
  Convert it into capital and check if it
  is a magic word or not.
 */

import java.util.*;
public class Class_17
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter any word: ");
        String str = sc.next();
        int l = str.length();
        boolean flag = false;
        for(int i = 0; i < l; i++)
        {
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(i+1);
            if( ch1 + 1 == ch2)
            {
            flag = true;
            break;
            }
        }
        if(flag)
        System.out.println(str+" is a magic word.");
        else
        System.out.println(str+" is not a magic word.");
    }
}