//Classes and Objects
import java.util.*;
class Class_83
{
    String s;
    int d;
    double w;
    
    public static void main()
    {
        Class_83 obj = new Class_83();
        String str1 = "Miau";
        String str2 = "Tu Tu Tu Tu Tu";
        obj.VeryDemure(str1);
        obj.VeryMindful(str2);
    }
    void VeryDemure(String str1)
    {
        s = "Very Demure";
        d = 123;
        w = 456;
        System.out.println(s+" "+d+w+" "+str1);
    }
    void VeryMindful(String str2)
    {
        s = "Very Mindful";
        d = 123;
        w = 456;
        System.out.println(s+" "+d+w+" "+str2);
    }
}