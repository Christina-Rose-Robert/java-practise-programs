
 //Inserstion Sort

import java.util.*;
public class Insertion_Sort
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements into the array: ");
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        //Insertion Sort
        for(int i = 1; i < n; i++)
        {
            int key = a[i];
            int j = i - 1;
            //Move elements horizontally 
            while(j >= 0 && a[j] > key)
            {
                a[j+1] = a[j];
                j = j-1;
            }
            a[j+1] = key;
        }
        
        
        for(int i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");
        } 
    }
}