//isDigit()
public class Class_74
{
    public static void main()
    {
        char ch1 = '1';
        char ch2 = 'a';
        char ch3 = '@';
        if(Character.isDigit(ch1))
        {
            System.out.println(ch1+" is a digit.");
        }
        else if(Character.isDigit(ch2))
        {
            System.out.println(ch2+" is a digit.");
        }
        else if(Character.isDigit(ch3))
        {
            System.out.println(ch3+" is a digit.");
        }
    }
}