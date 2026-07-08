/*

Write a Java class to represent a savings bank account. 
Data members can be Account Number,Customer Name and Balance. 
The minimum balance for a Savings account in the bank is Rs.1000/-. 
Write a default constructor and a parameterized constructor for the class.

*/
import java.util.*;
public class Savings
{   String AccountNumber = "1435789234941223";
    String CustomerName = "Christina Rose Robert";
    double balance = 1000;
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter account number, customer name, and balance : ");
        String AccountNumber = sc.nextLine();
        String CustomerName = sc.nextLine();
        double balance = sc.nextDouble();
    }
}