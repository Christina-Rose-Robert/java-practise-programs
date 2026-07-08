/*
  Design a class to overload a function volume() as follows:
  
  
  1. double volume(double R)                     - with radius (R) as an arguement,
                                                   returns the volume of sphere
                                                   using the formula V = 4/3 * 22/7 * R^3
                               
  2. double volume(double H, double R)           - with height (H) and radius (R)
                                                   as the arguements, returns the 
                                                   volume of a cylinder using the
                                                   formula V = 22/7 * R^2 * H
                                        
  3. double volume(double L, double B, double H) - with length (L), breadth (B),
                                                   and height (H) as the arguements,
                                                   returns the volume of a cuboid 
                                                   using the formula V = L*B*H
 */
import java.util.*;
public class Class_58
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the values for the radius, height, length and breadth: ");
        double R = sc.nextDouble(), H = sc.nextDouble(), L = sc.nextDouble(), B = sc.nextDouble();
        double volume1 = volume(R);
        double volume2 = volume(H,R);
        double volume3 = volume(L,B,H);
        System.out.println("1st volume = "+volume1);
        System.out.println("2nd volume = "+volume2);
        System.out.println("3rd volume = "+volume3);
    }
    public static double volume(double R)
    {
       double volume = 4/3 * 22/7 * R * R * R;
       return volume;
    }
    public static double volume(double H, double R)
    {
        double volume = 22/7 * R * R * H;
        return volume;
    }
    public static double volume(double L, double B, double H)
    {
        double volume = L * B * H;
        return volume;
    }
}