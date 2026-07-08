 import java.util.*;
 public class Qn_2
 {
     public static void main()
     {
         Scanner sc = new Scanner (System.in);
         System.out.println("Enter the value of n for the 1st pattern :");
         int n1 = sc.nextInt();
         firstPattern(n1);
         System.out.println("Enter the value of n for the 2nd pattern :");
         short n2 = sc.nextShort();
         secondPattern(n2);
     }
     public static void firstPattern(int n1)
     {
         for(int i = 1; i <= n1; i++)
         {
             for(int j = 3; j <= i; j+=2)
             {}
         }
     }
     public static void secondPattern(short n2)
     {
         
     }
 }