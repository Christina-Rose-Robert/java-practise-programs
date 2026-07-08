/*
  Method names: 
 (i) area(int n)
 (ii)area(int n1, int n2)
 
 *WITH RETURN TYPE*
 
 */
import java.util.*;
public class Class_30
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int area1 = area(n);
        System.out.println("Area of the square: "+area1);
        System.out.println("Enter value of n1 and n2: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int area2 = area(n1,n2);
        System.out.println("Area of the rectangle: "+area2);
    }
    public static int area(int n)
    {
        int area = n * n; 
        return area;
    }
    public static int area(int n1, int n2)
    {
        int area = n1 * n2;
        return area;
    }
}

/*
 
  USER DEFINED METHODS:
  
  1. With parameter and with return type
  2. With parameter and without return type
  3. Without parameter and with return type
  4. Without parameter and without return type
 
 */