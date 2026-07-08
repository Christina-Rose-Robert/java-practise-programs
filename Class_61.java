/*
  Define a class to accept values into an array
  of double datatype of size 20. Accept a double
  value from user and search in the array using
  linear search method. If value is found, display
  message "Found" with its position where it is
  present in the array, otherwise display message
  "Not found"
 */
import java.util.*;
public class Class_61
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        double a [] = new double[20];
        int i,j;
        System.out.println("Enter elements into the array: ");
        for(i = 0; i < 20; i++)
        {
            a[i] = sc.nextDouble();
        }
        System.out.println("Enter the search number: ");
        double search = sc.nextDouble();
        boolean flag = false;
        for(i = 0; i < 20; i++)
        {
            if(a[i] == search)
            {
                flag = true;
                break;
            }
        }
        if(flag)
        {
            System.out.println("Found "+search+" in the index "+i);
        }
        else
        {
            System.out.println("Not found");
        }
    }
}