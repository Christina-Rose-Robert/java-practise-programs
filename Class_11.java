 //Autoboxing and unboxing example.
 
 import java.util.*;
 public class Class_11
 {
     public static void main()
     {
         Integer a = new Integer(10);
         int b = a; // Unboxing
         System.out.println("Value of a: " +a);
         System.out.println("Value of b: " +b);
         
         Character c = 'A'; // Autoboxing
         char d = c; // Unboxing
         
         System.out.println("Value of c: " +c);
         System.out.println("Value of d: " +d);
     }
 }