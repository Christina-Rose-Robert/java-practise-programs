/*
  Write a program to check if the word y is contained in the word x.
  Write in the notebook
*/

import java.util.*;
public class Class_15
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a word (x): ");
        String x = sc.next();
        System.out.println("Enter a word to be checked (y): ");
        String y = sc.next();
        /*boolean f = x.contains(y); 
        if(f)
        {
         System.out.println("Yes " +x+ " contains the word " +y);   
        }
        else
        {
         System.out.println("No " +x+ " does not contain the word " +y);   
        }*/
        System.out.println(x.contains(y)? "Yes " +x+ " contains the word " +y : "No " +x+ " does not contain the word " +y);   
    }
}