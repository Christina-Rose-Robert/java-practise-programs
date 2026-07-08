 import java.util.*;
public class Paper
{
  public static void main()
   {
     Scanner sc = new Scanner (System.in);
     System.out.println("Enter a word: ");
     String word = sc.nextLine();
     int l = word.length();
     String rev = "";
     for (int i = l-1; i >= 0; i-- )
     rev = rev + word.charAt(i);
     if (word.equalsIgnoreCase(rev))
       System.out.println(word + " is palindrome");
     else
       System.out.println(word + " is not palindrome");
   }
}
