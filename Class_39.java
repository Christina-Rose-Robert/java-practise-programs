/*
  Matrix subraction.
 */
import java.util.*;
public class Class_39
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number of rows and coloums: ");
        int m = sc.nextInt(); //Rows
        int n = sc.nextInt(); //Coloumns
        int a[][] = new int[m][n];
        System.out.println("Enter the elements into the 1st martix: ");
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
             a[i][j] = sc.nextInt();
            }
        }
        int b[][] = new int[m][n];
        System.out.println("Enter the elements into the 2nd martix: ");
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
             b[i][j] = sc.nextInt();
            }
        }
        int difference[][] = new int[m][n];
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
             difference[i][j] = a[i][j] - b[i][j];
            }
        }
        System.out.println("The matrix after subraction: ");
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
             System.out.print(difference[i][j]+"\t");
            }
        }
    }
}