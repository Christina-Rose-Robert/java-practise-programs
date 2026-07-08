/*
  Matrix 
 */
import java.util.*;
public class Class_37
{
 public static void main()
 {
     Scanner sc = new Scanner (System.in);
     System.out.println("Enter the value of m and n: ");
     int m = sc.nextInt();
     int n = sc.nextInt();
     int a[][] = new int[m][n];
     System.out.println("Enter the elements into the array: ");
     for(int i = 0; i < m; i++)
     {
         for(int j = 0; j < n; j++)
         {
             a[i][j] = sc.nextInt();
         }
     }
     System.out.println("The entered matrix is: ");
     for(int i = 0; i < m; i++)
     {
         for(int j = 0; j < n; j++)
         {
             System.out.print(a[i][j]+"\t");
         }
         System.out.println("");
     }
 }
}