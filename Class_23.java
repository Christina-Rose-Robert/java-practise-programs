/*
  Write a program to input ten integer elements
  in an array and sort them in descending order
  using the bubble sort technique.
*/

import java.util.*;
public class Class_23
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        int a[] = new int[10];
        System.out.println("Enter the elements into the array: ");
        for(int i = 0; i < 10; i++)
        {
            a[i] = sc.nextInt();
        }
        int descending[] = new int[10];
        int maximum = 1;
        for(int i = 0; i < 10; i++)
        {
            if(a[i] > maximum)
            {
                descending[i] = a[i];
            }
        }
        System.out.println("Descending order: ");
        for(int i = 0; i < 10; i++)
        {
            System.out.print(descending + " ");
        }
    }
}