import java.util.*;
public class Class_32
{
    public static void main()
    {
        Class_32 obj = new Class_32();
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter side of square: ");
        double side = sc.nextDouble();
        obj.Area(side);
    }
    public static void Area(double side)
    {
        double area = side * side;
        System.out.println("Area of the square: "+area);
    }
    public static void Area()
    {
        
    }
}