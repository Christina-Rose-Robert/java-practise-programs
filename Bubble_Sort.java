  import java.util.*;
public class Bubble_Sort
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number of numbers:");
        int n = sc.nextInt();
        int a[] = new int[n];
        int i,j,temp;
        System.out.println("Enter the elements into the array:");
        for(i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        for(i = 0; i < n-1; i++)
        {
            for(j = 0; j < (n-1)-i; j++)
            {
              if(a[j+1] < a[j])
              {
                temp = a[j];
                a[j] = a[j+1];
                a[j+1] = temp;
              }
            }
        }
        System.out.println("The array in ascending order is: ");
        for(i = 0; i < n; i++)
        {
            System.out.println(a[i]+"  ");
        }
    }
}