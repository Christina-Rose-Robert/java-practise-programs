/*
  Define a class to declare an array of size 20
  of doule datatype, accept the elements into 
  the array and perform the following:
  
  1. Calculate and the print the product of all
     the elements.
  2. Print the square of each element of the 
     array.
 */
import java.util.*;
public class Class_50
{
  public static void main()
  {
    Scanner sc = new Scanner (System.in);
    double a[] = new double[20];
    System.out.println("Enter the elements into the array:");
    for(int i = 0; i < 20; i++)
    {
        a[i] = sc.nextDouble();
    }
    System.out.println("The array is: ");
    for(int i = 0; i < 20; i++)
    {
        System.out.print(a[i]+" ");
    }
    System.out.println("");
    double product = 1.0;
    for(int i = 0; i < 20; i++)
    {
        product = product * a[i];
    }
    System.out.println("Product of all the elements: "+product);
    System.out.println("");
    System.out.println("The square of each element: ");
    for(int i = 0; i < 20; i++)
    {
        System.out.println(a[i]*a[i]);
    }
  }
}