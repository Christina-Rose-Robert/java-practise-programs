/*
  METHOD OVERLOADING:
  
  Create more than two methods (with the same name) and access them using objects.
*/
public class Question_II
{
    public static void main()
    {
        Question_II obj = new Question_II();
        int a = 5, a2 = 23, a3 = 2345;
        //short b = 5;
        double c = 5.0, c2 = 369, c3 = 1277;
        obj.add(a);
        //obj.add(b); CORRECTION
        obj.add(c);
        obj.add(a2,a3);
    }
    public static void add(int a)
    {
        int addition = a + a;
        System.out.println("5 + 5 = "+addition);
    }
    /*public static void add(short b) CORRECTION
    {
        short addition = b + b;
        System.out.println("5 + 5 = "+addition);
    }
    */
    public static void add(double c)
    {
       double addition = c + c;
       System.out.println("5.0 + 5.0 = "+addition);
    }
    public static void add(int a2, int a3)
    {
       int addition = a2 + a3;
       System.out.println("23 + 2345 = "+addition);
    }
    public static void add(double c, double c2, double c3)
    {
        double addition = c + c2 + c3;
        System.out.println("5 + 369 + 1277 = "+addition);
    }
}