//Binary Search

import java.util.*;
public class Class_85
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int flag = binarySearch(n);
        if(flag == -1)
        {
            System.out.println("Element not found: ");
        }
        else
        {
            System.out.println("Element found at index: "+flag);
        }
    }
    public static int binarySearch(int n)
    {
        Scanner sc = new Scanner (System.in);
        int a[] = new int[n];
        System.out.println("Enter the elements into the array: ");
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be found: ");
        int find = sc.nextInt();
        int lower = 0, upper = n, middle = 0;
        while(lower <= upper)
        {
            middle = (lower + upper)/2;
            if(a[middle] == find)
            {
                return middle; 
            }
            else if(a[middle] < find)
            {
                lower = middle + 1; 
            }
            else
            {
                upper = middle - 1;
            }
            
        }
        return -1;
    }
}