/*
  Write a program to input and store integer elements
  in a double dimensional array of size 3x3 and find
  the sum of the elements in the left diogonal.
  
  EXAMPLE:      
  
  Input:
            1  3  5
            4  6  8
            9  2  4   
            
  Output: 
  
  Sum of the left diagonal elements (1 + 6 + 4) = 11      
 */

import java.util.*;
public class Class_22
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][3];
        int i,j;
        int sum = 0;
        System.out.println("Enter the elements into the 3x3 array: ");
        for(i = 0; i < 3; i++)
        {
            for(j = 0; j < 3; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        for(i = 0; i < 3; i++)
        {
            for(j = 0; j < 3; j++)
            {
                if(i == j)
                {
                    sum = sum + a[i][j];
                }
            }
        }
        System.out.println("Sum of the elememnts in the left diogonal: " +sum);
    }
}