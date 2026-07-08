/*
  Write a program to input integer elements into an
  arrray of size 20 and perform the following operations:
  
  1. Display the largest number from the array
  2. Display the smallest number from the array
  3. Display the sum of all the elements from the array
  
 */

import java.util.*;
public class Class_52
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        int a[] = new int[20];
        System.out.println("Enter the elements:");
        for(int i = 0; i < 20; i++)
        {
            a[i] = sc.nextInt();
        }
        int largest = 0, smallest = 9, sum = 0;
        for(int i = 0; i < 20; i++)
        {
            if(a[i]>largest)
            largest = a[i];
        }
        for(int i = 0; i < 20; i++)
        {
            if(a[i]<smallest)
            smallest = a[i];
        }
        for(int i = 0; i < 20; i++)
        {
            sum = a[i] + sum;
        }
        System.out.println("Largest number: "+largest);
        System.out.println("Smallest number: "+smallest);
        System.out.println("Sum of all the elements: "+sum);
    }
}