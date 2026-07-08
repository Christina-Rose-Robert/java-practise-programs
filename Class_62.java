/*
  Write a program to input name and percentage of 7 students of class X in two seperate
  one dimensional arrays. Arrange student details according to their percentage in the
  descending order using selection sort method. Display name and percentage of the 1st ten
  toppers of the class.
 */
import java.util.*;
public class Class_62
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        String name[] = new String[7]; 
        double perc[] = new double[7];
        System.out.println("Enter the student's name and percentage: ");
        for(int i = 0; i < 7; i++)
        {
            name[i] = sc.nextLine();
            perc[i] = sc.nextDouble();
        }
        for(int i = 0; i < 7; i++)
        {
            int high = i;
            for(int j = i+1; i < 7; i++ )
            {
                if(perc[j] > perc[high])
                {
                    high = j;
                }
            }
            double temp = perc[high];
            String n = name[high];
            perc[high] = perc[i];
            name[high] = name[i];
            perc[i] = temp;
            name[i] = n;
        }
        System.out.println("Name and percentage of the 1st ten toppers of the class: ");
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Name: "+name[i]);
            System.out.println("Percentage: "+perc[i]);
        }
    }
}