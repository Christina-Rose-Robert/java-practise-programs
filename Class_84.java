//Classes and Objects
import java.util.*;
public class Class_84
{
    String s;
    int d;
    
    public static void main()
    {
        Class_84 obj = new Class_84();
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a ooga booga:");
        int oogabooga = sc.nextInt();
        
        obj.Ooga(oogabooga);
        obj.Booga(oogabooga);
    }
    void Ooga(int oogabooga)
    {
        System.out.println(oogabooga);
    }
    void Booga(int oogabooga)
    {
        System.out.println(oogabooga);
    }
}