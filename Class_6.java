 /*
   Write a program to accept a word and convert it into lowercase if it is in uppercase 
   and display the new word by replacing only the vowels with the charecter following it.
 */

import java.util.*;
public class Class_6
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a word: ");
        String word = sc.nextLine(); //Accepting the string
        int l = word.length(); //Length of the string
        char ch;
        
        for(int i = 0; i < l; i++)
        {
            ch = word.charAt(i); //Exctracting the charecters in the string
            if( Character.isUpperCase(ch) == true )
            {
                word.charAt(i); //Convertion to lowercase
                System.out.println("*"); 
                ch = word.charAt(i); //
            }
            if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u')
            {
                word.charAt(i);
            }
        }
    }
}