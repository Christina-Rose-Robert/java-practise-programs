//Finding sum, difference, scalar prod and dot prod of 2 vectors
import java.util.*;
public class Class_89
{
    int A[]; int B[];
    Class_89()
    {
        A = new int[3];
        B = new int[3];
    }
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the x, y, z values for vector A: ");
        for(int i = 0; i < 3; i++) //inputting A
        {
            A[i] = sc.nextInt();
        }
        System.out.println("Enter the x, y, z values for vector B: ");
        for(int i = 0; i < 3; i++) //inputting B
        {
            B[i] = sc.nextInt();
        }
    }
    void vectorSum()
    {
        int C[] = new int[3];
        for(int i = 0; i < 3; i++)
        {
            C[i] = A[i] + B[i];
        }
        System.out.println("Sum of A and B= ");
        for(int i = 0; i < 3; i++)
        {
            System.out.print(C[i] +" ");
        }
        System.out.println();
    }
    void vectorDiff()
    {
        int C[] = new int[3];
        for(int i = 0; i < 3; i++)
        {
            C[i] = A[i] - B[i];
        }
        System.out.println("Difference of A and B= ");
        for(int i = 0; i < 3; i++)
        {
            System.out.print(C[i]+" ");
        }
    }
    void scalarMult() //finding prod of A and a scalar
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a scalar value: ");
        int n = sc.nextInt();
        int C[] = new int[3];
        for(int i = 0; i < 3; i++)
        {
            C[i] = A[i] * n;
        }
        System.out.println("product of vector A and "+n+"=");
        for(int i = 0; i < 3; i++)
        {
            System.out.print(C[i]+" ");
        }
        System.out.println();
    }
    void dotProd()
    {
        int D = 0;
        for(int i = 0; i < 3; i++)
        {
            D+=A[i]+B[i];
        }
        System.out.println("Dot product of A and B=" +D);
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("1: Vector Addition\n2: Vector Subtractionn\n3: Scalar multiplication\n4: Dot product");
        System.out.println("Enter a choice [A/B/C/D]: ");
        char c = sc.next().charAt(0);
        Class_89 o = new Class_89();
        o.input();
        switch(c)
        {
            case 'A': o.vectorSum(); break;
            case 'B': o.vectorDiff(); break;
            case 'C': o.scalarMult(); break;
            case 'D': o.dotProd(); break;
            default: System.out.println("Invalid choice");
        }
    }
}