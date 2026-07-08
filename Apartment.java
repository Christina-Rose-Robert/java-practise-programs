/*

Write a Java class to represent an Apartment with squareFeet as its data member.
An apartment is 1000 sqft by default. It should also be possible to create 
objects with custom value for squareFeet.

For the apartments, wirte a method to calculate yearly maintenance charge
using the following formula Yearly Maintenance Charge = 12 * 2 * squareFeet
[Using the rate Rs 2/- per squareFeet per month]

*/

import java.util.*;
public class Apartment
{   public static double sqft;
    Apartment()
    {
        sqft = 1000.0;
    }
    Apartment(double sqft)
    {
        sqft = sqft;
    }
    public static void main()
    {
        double YMC_1 = YearlyMaintenaceCharge();
        System.out.println("Your maintenance charge : " +YMC_1);
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter squareFeet : ");
        double sqft = sc.nextDouble();
        double YMC_2 = YearlyMaintenaceCharge(sqft);
        System.out.println("");
        System.out.println("Yearly maintenance charge : " + YMC_2);
    }
    public static double YearlyMaintenaceCharge(double sqft)
    {
        double YMC = 12 * 2 * sqft; 
        return YMC;
    }
    public static double YearlyMaintenaceCharge()
    {
        double YMC = 12 * 2 * sqft; 
        return YMC;
    }
}