/*
  Write a program to create and object 
  and methods associated with the class:
  
  (i) areaSquare()
  (ii) areaRectangle()
  
 */
import java.util.*;
public class Class_31
{
    public static void main()
    {
        Class_31 obj = new Class_31();
        obj.areaSquare();
        obj.areaRectangle();
    }
    public static void areaSquare()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the side of a square: ");
        double sq = sc.nextDouble();
        double areasq = sq * sq;
        System.out.println("Area of the square: "+areasq);
    }
    public static void areaRectangle()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the sides of a rectangle: ");
        double rectangle1 = sc.nextDouble();
        double rectangle2 = sc.nextDouble();
        double areaR = rectangle1 * rectangle2;
        System.out.println("Area of the square: "+areaR);
    }
}