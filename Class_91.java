//Bubble Sort (review session)
import java.util.*;
public class Class_91
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        int temp = 0;
        System.out.println("Enter the elements into the array: ");
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < (n-1); i++)
        { 
            for(int j = 0; j < (n-1)-i; j++)
            {
                if(a[j+1] < a[j])
                {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted array: ");
        for(int i = 0; i < n; i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}