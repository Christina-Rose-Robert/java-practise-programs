import java.util.*;
public class Dystopia
{
  public static void main()
      {
         Scanner sc = new Scanner (System.in);
         System.out.println ("Enter a string: ");
         String a = sc.nextLine();
         int l = a.length();
         System.out.println ("First character: " + a.charAt(0) + "\n Last character: " + a.charAt(l-1));     
      }
}
