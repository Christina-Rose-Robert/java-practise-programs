//Print the elements in a 2 Dimensional Array
import java.util.*;
public class Class_87
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number of rows in the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the number of columns");
        int m = sc.nextInt();
        int A[][] = new int[n][m];
        System.out.println("Enter the elements into the array: ");
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("The entered array is: ");
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}