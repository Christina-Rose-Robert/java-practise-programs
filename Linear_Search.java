//Linear Search

import java.util.*;
public class Linear_Search
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        linearSearch(n);
    }
    public static void linearSearch(int n)
    {
        Scanner sc = new Scanner (System.in);
        int a[] = new int[n];
        System.out.println("Enter the elements into the array: ");
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be found: ");
        boolean isFound = false;
        int j;
        int find = sc.nextInt();
        for(j = 0; j < n; j++)
        {
            if(a[j] == find)
            {
                isFound = true; break;
            }
        }
        if(isFound)
        {
            System.out.println("The element found at the position : " +(j+1));
        }
        else
        {
            System.out.println("The element is not found.");
        }
    }
}