//Merge Sort 

import java.util.*;
public class Merge_Sort
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
        System.out.println("The entered array is: ");
        for(int i = 0; i < n; i++)
        {
            System.out.print(a[i]+ " ");
        }
        //Sorting
        sort(a, 0, n-1);
    }
    public static void sort(int a[], int l, int r)
    {
        int mid = l+(r-1)/2;
        sort(a, l, mid);
        sort(a, mid+1, r);
        //Merging
        merge(a, l, mid, r);
    }
    public static void merge(int a[], int l, int mid, int r)
    {
        //Finding the size of two sub-arrays
        int n1 = mid-l+1;
        int n2 = r-mid;
        //Creating temporary arrays
        int left[] = new int[n1];
        int right[] = new int[n2];
        //Temporary arrays are used to store data into them
        for(int i = 0; i < n1; i++)
        {
            left[i] = a[l+i];
        }
        for(int j = 0; j < n2; j++)
        {
            right[j] = a[mid+1+j];
        }
        //Merging the temporary arrays
        int i = 0; 
        int j = 0;
        int k = l;
        while(i < n1 && j < n2)
        {
            if(left[i] <= right[j])
            {
                a[k] = left[i];
                i++;
            }
            else
            {
                a[k] = right[j];
                j++;
            }
            k++;
        }
    }
}