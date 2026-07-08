//Bubble Sort
import java.util.*;
public class Bubble
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        int n = 5;
        int a[] = new int[n];
        System.out.println("Enter the value of the elements of the array: ");
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        //Bubble Sort
        int temp = 0;
        for(int i = 0; i < n; i++)
        {
            for(int j = 1; j < n-1; j++)
            {
                if(a[j-1] > a[j])
                {
                    temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("The sorted array is: ");
        for(int i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}