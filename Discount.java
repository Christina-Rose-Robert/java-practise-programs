/*
DISCOUNT DETERMINER

Lab Goal: This lab was designed to teach you how to use if statement.

Lab Description: Make a new class CopyOfDiscount that will determine the amount of
discount a person should recive. If the bill is more than 2000, then the
person should reveive a 15% discount. If the bill is 2000 dollars or less,
the person does not recieve a discount of any kind. 

You will need to create a keyboard object which will allow you to enter a value
from the keyboard. Using that value you will calculate the discount is needed.
You will neeed to limit your answer to two decimal places.

Example Tests of your program:

Enter the original bill amount :: 500
Bill after discount :: 500.00

Enter the original bill amount :: 4000
Bill after discount :: 3400.00

Enter the original bill amount :: 2500
Bill after discount :: 2125.00

Enter the original bill amount :: 333.333
Bill after discount :: 333.33

Enter the original bill amount :: 95874.2154
Bill after discount :: 81493.08

FORMATTING OUTPUT
_________________

double dec = 9.541724;

      //printf is a void method 
System.out.printf("%.3f\n",dec); //outs 9.542
*/

import java.util.*;
public class Discount
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the bill amount:: ");
        double amt = sc.nextDouble();
        double disc = 0.0;
        if(amt > 2000)
        {
            disc = (amt * 15/100.0);
        }
        System.out.printf("\nBill after discount :: "+"%.2f\n",(amt - disc));
    }
}
