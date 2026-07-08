/*
  Define a class to perform binary search on a list
  of integers given below, to search for an element
  input by the user, if it found, display the element
  along with its position, otherwise display the 
  message the "Search element not found"
  
  The search numbers:
  2,5,7,10,15,20,29,30,46,50
 */



import java.util.*;
public class Class_51
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        int a[] = {2,5,7,10,15,20,29,30,46,50};
        System.out.println("Enter the search number: ");
        int found = sc.nextInt();
        boolean flag = false;
        int lower = 0, middle = 0, upper = 9;
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
        if (flag)
        {
            System.out.println(found+ " is present at index "+(middle+1));
        }
        else
        {
          System.out.println("Search element not found.");  
        }
    }
}