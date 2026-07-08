/*
The Business Office at State University has asked for your help in writing a program to calculate student tuition fees. 
Tuition fees vary depending on the number of credit hours the student is taking and on the student's status as a state resident or non-resident. 
Name your class - University.

The rates are as follows:

	HOURS	   RESIDENT	NON-RESIDENT
        1-4        80.00/hour   120.00/hour
        5-12       70.00/hour   110.00/hour
        Over 12    900.00 total 1400.00/total

Before you begin coding the problem, you must see remaks to explain what the take is that your need to complete 
and then outline what steps you need to complete in order to create your solution.

The program should promp the user to enter the student's name, student's residency status, and the number of credit hours.

It should then display the student's bill similar to the following:

Bill for:	<student's name>
Credit Hours:	<number of hours taken>
Resident:	<Yes or No>
Amount Owed:	<total fees>
*/
import java.util.*;
public class University
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the student's name: ");
        String name = sc.nextLine();
        System.out.println("Is the student a resident (enter yes or no): ");
        String r = sc.nextLine();
        System.out.println("Enter the student's credit hours: ");
        int hours = sc.nextInt(); 
        double totamt = 0.0;
        if(hours >= 1 && hours <= 4)
        {
            if(r.equalsIgnoreCase("yes"))
            {
                totamt = 80.00*hours;
            }
            else 
            {
                totamt = 120.00*hours;
            }
        }
        else if(hours < 12)
        {
            if(r.equalsIgnoreCase("yes"))
            {
                totamt = 70.00*hours;
            }
            else 
            {
                totamt = 110.00*hours;
            }
        }
        else 
        {
            if(r.equalsIgnoreCase("yes"))
            {
                totamt = 900.00;
            }
            else 
            {
                totamt = 1400.00;
            }
        }
        System.out.println("");
        System.out.println("\t  STATE UNIVERSITY BILL");
        System.out.println("Bill for: \t" +name);
        System.out.println("Credit hours: \t" +hours);
        System.out.println("Resident: \t" +r);
        System.out.println("Amount Owed: \t" +totamt);
    }
}