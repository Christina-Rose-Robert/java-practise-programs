/*
  Swap values of integers through both types of method calling mechanisms.
 */

public class Class_43
{
    int x = 4;
    int y = 3;
    public static void main()
    {
     System.out.println("Enter two numbers: ");
     int n1 = 4;
     int n2 = 3;    
     Swap1(n1,n2);
     Class_43 obj = new Class_43();
     Swap2(obj);
     System.out.println("The numbers after swaping (call by value): ");
     System.out.println("n1 is "+n1+"and n2 is "+n2);
     System.out.println("The numbers after swaping (call by reference):");
     System.out.println("x is "+obj.x+"and y is "+obj.y);
     System.out.println("");
    }
    public static void Swap1(int n1, int n2)//value
    {
        System.out.println("The numbers before swaping: ");
        System.out.println("n1 is "+n1+"and n2 is "+n2);
        
        int temp = 0;
        temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("The numbers after swaping: ");
        System.out.println("n1 is "+n1+"and n2 is "+n2);
    }
    public static void Swap2(Class_43 obj)
    {
        System.out.println("The numbers before swaping :");
        System.out.println("x is "+obj.x+"and y is "+obj.y);
        int temp = 0;
        temp = obj.x;
        obj.x = obj.y;
        obj.y = temp;
        System.out.println("The numbers after swaping :");
        System.out.println("x is "+obj.x+"and y is "+obj.y);
    }
}