/*
 
  Write a menu-driven using switch to design a class 
  to overload a function series() as follows:
  
  (i) With an arguement (M) and return the difference
      of the largest and the smallest digit.
  (ii) With an arguement (N) to print the pattern as 
       shown below where N represent represent the
       numbers of lines 
       
       EXAMPLE:
       
       1
       2  22
       3  33  333
       4  44  444  4444

 */
import java.util.*;
public class Class_44
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("MENU");
        System.out.println("a. Difference between the largest and smallest number in a digit.");
        System.out.println("b. Pattern of N lines.");
        System.out.println("Enter your choice: ");
        char ch = sc.next().charAt(0);
        switch(ch)
        {
            case 'A':
            case 'a':
            System.out.println("Enter a number: ");
            int M = sc.nextInt();
            int difference = series(M);
            System.out.println("Difference =" + difference);
        }
    }
    public static int series(int M)
    {
        int difference = 0;
        int largest = 0;
        int smallest = 9;
        int d = 0;
        while(M > 0)
        {
            d = M % 10;
            if(M > largest)
            {
                M = largest;
            }
            else if(M < smallest)
            {
                M = smallest;
            }
        }
        difference = largest - smallest;
        return difference;   
    }
}