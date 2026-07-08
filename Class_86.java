//Bubble Sort
import java.util.*;
public class Class_86
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the value of the elements of the array: ");
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        //Selection Sort
        int temp = 0;
        for(int i = 0; i < n-1; i++)
        {
            int minIndex = i;
            for(int j = i + 1; j < n; j++)
            {
                if(a[minIndex] > a[j])
                {
                    minIndex = j;
                }
            }
            temp = a[minIndex];
            a[minIndex] = a[i];
            a[i] = temp;
        }
        System.out.println("The sorted array is: ");
        for(int i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");
        }
        
        
        
        
        
        
        System.out.println("Enter value for m: ");
        int m = sc.nextInt();
        int b[] = new int[m];
        System.out.println("Enter elements into this skibidi array: ");
        for(int i = 0; i < m; i++)
        {
            b[i] = sc.nextInt();
        }
    }
}