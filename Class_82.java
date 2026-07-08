//String Tokenizer
/*
  
     Write a program to rearrange a sentence. Check the validity of the sentence, 
     if it's valid, reverse the sentence, replace the first word with the last word
     and replace the last word with the first word.
  
*/
import java.util.*;
public class Class_82
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a sentence: ");
        String s = sc.nextLine();
        if(s.endsWith(".") || s.endsWith("?") || s.endsWith("!"))
        {
            System.out.println("'"+s+"'"+" is valid.");
            rearrangeSentence(s);
        }
        else
        {
            System.out.println("'"+s+"'"+" is invalid.");
        }
    }
    public static void rearrangeSentence(String s)
    {
        StringTokenizer obj = new StringTokenizer(s);
        String rev = "";
        while(obj.hasMoreTokens())
        {
            rev = obj.nextToken() + " " + rev;
        }
        System.out.println("Reversed sentence: "+rev);
    }
}