/*
  Selection sort (page 203)
*/

import java.util.*;
public class Class_46
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of 'x': ");
        int x = sc.nextInt();
        int a[] = new int[x];
        int i,j;
        System.out.println("Enter the elements into the array: ");
        for(i = 0; i < x; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("The array entered is: ");
        for(i = 0; i < x; i++)
        {
            System.out.print(a[i]+"\t");
        }
        System.out.println("");
        int temp, small, position;
        for(i = 0; i < x; i++)
        {
          small = a[i];
          position = i;
          for(j = i + 1; j < 9; j++)
          {
              if(a[j] < small)
              {
                  small = a[j];
                  position = j;
              }
          }
          temp = a[i];   
          a[i] = a[position];
          a[position] = temp;
        }
        System.out.println("Smallest: "+ a[0]); 
        int l = a.length;
        System.out.println("Larest: "+ a[l-1]);                                         
    }
}