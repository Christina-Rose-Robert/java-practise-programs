/*
  User Defined Methods.
 */

import java.util.*;
public class Class_16
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the length: ");
        float l1 = sc.nextFloat();
        float AreaSquare = checkArea(l1);
        System.out.println("Enter the length and width: ");
        double l2 = sc.nextDouble();
        double w2 = sc.nextDouble();
        double AreaRectangle = checkArea(l2,w2); 
        System.out.println("Area of the square: " +AreaSquare);
        System.out.println("Area of the rectangle: " +AreaRectangle);
        System.out.println();
    }
    public static float checkArea(float l1)
    {
                float area = l1 * 4; 
                return area;
    }
    public static double checkArea(double l2, double w2)
    {
        double area = l2 * w2;
        return area;
    }
}