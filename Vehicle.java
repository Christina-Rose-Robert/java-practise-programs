/*
 
Write a Java class to represent a Vehicle. The datamembers classify the Vehicle as geared or ungeared vehicles, 
petrol or diesel vehicles, vehicle Type, mileageRate. 
Define a default constructor to initialize these to some values.

*/
import java.util.*;
public class Vehicle
{
    String gear;
    String fuel;
    String type;
    String milage;
    Vehicle()
    {
      gear = "Geared";
      fuel = "Petrol";
      type = "Supercar";
      milage = "2.3 kmpl";
    }
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter details of the vehicle : ");
        System.out.println("Geared / Ungeared : ");
        String gear = sc.nextLine();
        System.out.println("Petrol / Diesel : ");
        String fuel = sc.nextLine();
        System.out.println("Vehicle type : ");
        String type = sc.nextLine();
        System.out.println("Milage Rate: ");
        String milage = sc.nextLine();
    }
}