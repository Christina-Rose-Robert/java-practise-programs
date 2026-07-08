//Binary Search

import java.util.*;
public class Quest_2
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements: ");
        for(int i = 0; i <n; i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the search number: ");
        int sn = sc.nextInt();
        boolean flag = false;
        int lower = 0, upper = n-1, middle = 0;
        while(lower <= upper)
        {
            middle = (lower+upper)/2;
            if(sn == a[middle])
            {
                flag = true;
                break;
            }
            else if (sn > a[middle])
            {
                flag = true;
                lower = middle + 1;
            }
            else 
            {
                flag = true;
                upper = middle - 1;
            }
        }
        if(flag  == true)
            {
                System.out.println("Number is present at the index "+middle);
            }
            else
            {
                System.out.println("Number is not present.");
            }
    }
}