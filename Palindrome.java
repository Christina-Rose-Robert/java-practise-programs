import java.util.*;
public class Palindrome
{
    int num;
    int revnum;
    public Palindrome()
    {
        num = 0; revnum = 0;
    }
    public static void main()
    {
        Palindrome obj = new Palindrome();
        obj.accept();
        obj.check();
    }
    public void accept()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number: ");
        num = sc.nextInt();
    }
    public int reverse(int y)
    {
        if(y == 0)
        {
            return 0;
        }
        else
        {
            revnum = (revnum * 10) + (y % 10);
            reverse(y/10);
            return revnum;
        }
    }
    public void check()
    {
        reverse(num);
        if(num == revnum)
        {
            System.out.println(num + " is a Palindromedrome number");
        }
        else
        {
            System.out.println(num + " is not a Palindromedrome number");
        }
    }
}