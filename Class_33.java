import java.util.*;
public class Class_33
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter side of the square: ");
        double side = sc.nextDouble();
        Class_33 obj = new Class_33();
        double area = obj.AreaSquare(side);
        System.out.println("Area of the square: "+area);
    }
    public static double AreaSquare(double side)
    {
        double area = side * side;
        return area;
    }
}