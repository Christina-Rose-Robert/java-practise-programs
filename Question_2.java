//Binary Search

import java.util.*;
public class Question_2
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the array in ascending order: ");
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the search number: ");
        int search = sc.nextInt();
        int upper = 0; int lower = 0; int middle = upper/2;
        for(int i = 0; i < n; i++)
        {
            lower = a[i];
            
        }
    }
}