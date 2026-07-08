/*
  Write a program to input two words x and y.
  Check if the word y is contained in the word x 
  and print a message accordingly.
 */

import java.util.*;
public class Class_27
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the word and the word to be found: ");
        String word = sc.next();
        String found = sc.next();
        //System.out.println(word.contains(found)? "The word is present" : "The word is not present");
        
        //Use the substring method.
        
        int l1 = word.length(); //length of the word
        int l2 = found.length(); //length of the word to be found
        boolean flag = false;
        for(int i = 0; i < l1; i++)
        {
            String a = word.substring(i,l2+1);
            if(a == found)
            {
                flag = true;
                break;
            }
        }
        if (flag)
        {
            System.out.println("The word is present");
        }
        else
        {
            System.out.println("The word is not present");
        }
    }
}