/* 
 * Java program to count the number of uppercase, lowercase, numbers and special characters in a string ?
*/

import java.util.*;
public class Quest_1
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a string: ");
        String a = sc.nextLine();
        int c1 = 0; //Uppercase
        int c2 = 0; //Lowercase
        int c3 = 0; //Numbers
        int c4 = 0; //Special characters
        int l = a.length();
        for(int i = 0; i <l; i++)
        {
            char ch = a.charAt(i);
            if(ch >= 'A' && ch <= 'Z')
            {
                c1++;
            }
            else if(ch >= 'a' && ch <= 'z')
            {
                c2++;
            }
            else if (ch >= '0' && ch <= '9')
            {
                c3++;
            }
            else
            {
                c4++;
            }
        }
        System.out.println("Count of uppercase characters in the entered string: "+c1);
        System.out.println("Count of lowercase characters in the entered string: "+c2);
        System.out.println("Count of numerical characters in the entered string: "+c3);
        System.out.println("Count of special characters in the entered string: "+c4);
    }
}