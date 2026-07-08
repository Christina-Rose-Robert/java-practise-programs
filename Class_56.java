import java.util.*;
public class Class_56
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        int temp;
        System.out.println("Enter elements into the array: ");
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n - 1; i++)
        {
            for(int j = 0; j < (n-i-1); j++)
            {
                temp = a[j];
                a[j] = a[j+1];
                a[j+1] = temp;
            }
        }
        System.out.println("Elements in ascending order: ");
        for(int i = 0; i < n; i++)
        {
            System.out.print(a[i]+"\t");
        }
    }
}