/*
  Design a class RailwayTicket with the following description:
  
  Instance variables/data members:
  
  String name           :           To store the name of the
                                    customer
                                    
  String coach          :           To store the type of coach
                                    customer wants to travel
                                    
  long mobno            :           To store customer's mobile
                                    number
                                    
  int amt               :           To store basic amount of
                                    ticket
                                    
  int totalamt          :           To store the amount to be
                                    paid after updating the
                                    original amount
                                    
                                    
                                    
  Member methods:
  void accept() - To take input for name, coach,
                  mobile number and amount.
                  
  void update() - To update the amount as per the
                  coach selected.
                  (extra amount to be added in the
                   amount as follows)
                   
  TYPE OF COACHES          AMOUNT
     First_AC               700
     Second_AC              500
     Third_AC               250
     Sleeper                None
     
  void display() - To display all details of a
                   customer such as name, coach
                   total amount and mobile number.
                   
 Write a main method to create an object of the class and 
 call the above member methods.
    
 */

import java.util.*;
public class Class_53
{
    static String name;
    static String coach;
    static long mobno;
    static int amt;
    static int totalamt;
    public static void main()
    {
        Class_53 obj = new Class_53();
        obj.accept();
        obj.update();
        obj.display();
    }
    public static void accept()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the customer name: ");
        name = sc.nextLine();
        System.out.println("Enter the type of coach from the options below: ");
        System.out.println("* First_AC");
        System.out.println("* Second_AC ");
        System.out.println("* Third_AC");
        System.out.println("* Sleeper");
        coach = sc.nextLine();
        System.out.println("Enter the mobile number: ");
        mobno = sc.nextInt();
        System.out.println("Enter the basic amount of ticket: ");
        amt = sc.nextInt(); 
        System.out.println();
        System.out.println();
    }
    public static void update()
    {
        if(coach.compareTo("First_AC") == 0)
        {
            totalamt = amt + 700;
        }
        else if (coach.compareTo("Second_AC") == 0)
        {  
            totalamt = amt + 500;
        }
        else if (coach.compareTo("Third_AC") == 0)
        {
            totalamt = amt + 250;
        }
        else
        {
            totalamt = amt + 0;
        }
    }
    public static void display()
    {
       /*To display all details of a
         customer such as name, coach
         total amount and mobile number.
       */
       System.out.println("RAILWAY TICKET:");
       System.out.println("");
       System.out.println("Customer name: "+name);
       System.out.println("Mobile number: "+mobno);
       System.out.println("Coach: "+coach);
       System.out.println("Total amount: "+totalamt);
    }
}