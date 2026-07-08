import java.util.*;
public class Binary_Search
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the numbers of numbers: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements into the array: ");
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("The array you entered is: ");
        for(int i = 0; i < n; i++)
        {
            System.out.print(a[i]+"\t");
        }
        System.out.println("");
        System.out.println("Enter the search number: ");
        int found = sc.nextInt();
        boolean flag = false;
        int lower = 0, middle = 0, upper = n-1;
        while(lower <= upper)
        {
            middle = (lower+upper)/2;
            if(found == a[middle])
            {
                flag = true;
                break;
            }
            else if(found > a[middle])
            {
                lower = middle + 1;
                flag = true;
            }
            else 
            {
                upper = middle - 1;
                flag = true;
            }
        }
        if(flag)
          {
           System.out.println("The number is present at index "+middle);
          }
        else
          {
           System.out.println("The number is not present.");    
          }
    }
}