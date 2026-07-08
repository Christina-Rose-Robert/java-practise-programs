import java.util.*;
public class MyMoney
{
    static double balance;
    static String name;
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the name: ");
        String name = sc.nextLine();
        System.out.println("Enter the balance: ");
        double balance = sc.nextDouble();
        
        //Deposit method
        double deposit = 505.22;
        deposit(deposit);
    }
    private static void deposit(double dep)
    {
        balance = balance + dep;
        System.out.println("The "+name+" account balance is = "+balance);
    }
}