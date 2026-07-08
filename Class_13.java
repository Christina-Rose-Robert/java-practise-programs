/*
  Write a program to input a matrix of order 5 x 5.
  1) Find the sum of each coloumn
  2) Input any element and print its row and coloumn position in the matrix
*/

import java.util.*;
public class Class_13
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        int a[][] = new int[5][5];
        System.out.println("Enter the elements: ");
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 5; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("The array you entered: ");
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 5; j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println("");
        }
        System.out.println("The sum of each coloumn: ");
        int sum = 0;
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 5; j++)
            {
                sum = sum + a[j][i];
            }
        }
    }
}