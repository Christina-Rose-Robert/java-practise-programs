// Create a class and use four methods to perform addition, subtraction, multiplication and division
public class Question_I
{
    public static void main()
    {
       Question_I obj = new Question_I();
       obj.add();
       obj.sub();
       obj.mul();
       obj.div();
    }
    public static void add()
    {
       int add = 5 + 5;
       System.out.println("5 + 5 = "+add);
    }
    public static void sub()
    {
        int sub = 5 - 5;
        System.out.println("5 - 5 = "+sub);
    }
    public static void mul()
    {
        int mul = 5 * 5;
        System.out.println("5 * 5 = "+mul);
    }
    public static void div()
    {
        double div = 5 / 5.0;
        System.out.println("5 / 5 = "+div);
    }
}