/*
 
   Write a menu driven program to implement the following vector operations.
   1. Declare 2 vectors(SDAs’)
   2. Initialize the values
   3. Perform addition of vectors and display the sum vector
   If Input is, A[]= {4, -2, 2} and B[]= {-3, -2, 1}
   Then Output is,C[]={1,-4,3} 
   4. Perform subtraction of vectors and display the difference vector
   If Input is, A[]= {4, 2, 2} and B[]= {-3, 2, 1}
   Then Output is,C[]={7,0,1}
   5. Perform scalar multiplication of vector 1 and display the product vector
   (Scalar multiplication is the multiplication of a vector by a scalar (where the product is a vector))
   If Input is, A[]= {2, 1, 3} Scalar value=5
   Then Output is, C[]={10,5,15}
   6. Perform dot product of vectors and display the dot product 
   (The dot product of two vectors is the sum of the products of their corresponding components.)
   If Input is, A[] = {2, 1, 1} andB[]= {3, 5, 2}
   Then Output is, D = 
   Write a main() to create an object and call the functions accordingly to enable the task.
     

 */
import java.util.*;
public class Arrays
{
    static int n;
    static int A[] = new int[n];
    static int B[] = new int[n];
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        Arrays obj = new Arrays();
        while (true)
        {
            System.out.println("MENU:");
            System.out.println("1. Declares two vectors");
            System.out.println("2. Initialize the values");
            System.out.println("3. Perform addition of vectors and display the sum vector");
            System.out.println("4. Perform subtraction of vectors and display the difference vector");
            System.out.println("5. Perform scalar multiplication of vector 1 and display the product vector");
            System.out.println("6. Perform dot product of vectors and display the dot product");
            System.out.println("7. Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                System.out.println("Enter the value for n: ");
                n = sc.nextInt();
                obj.declare(n);
                break;
                
                case 2:
                obj.initialize();
                break;
                
                case 3:
                break;
                
                case 4:
                break;
                
                case 5:
                break;
                
                case 6:
                break;
                
                case 7:
                break;
                
                default:
            }
        }
    }
    public static void declare(int n)
    {
        int A[] = new int[n];
        int B[] = new int[n];
    }
    public static void initialize()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values into the array A: ");
        for(int i = 0; i < n;i++)
        {
            A[i] = sc.nextInt();
        }
        System.out.println("Enter values into the array B: ");
        for(int i = 0; i < n;i++)
        {
            B[i] = sc.nextInt();
        }
    }
}