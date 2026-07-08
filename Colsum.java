import java.util.*;
public class Colsum
{
    int mat[][];
    int m;
    int n;
    public Colsum(int mm, int nn)
    {
        m = mm;
        n = nn;
        mat = new int[m][n];
    }
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter the number of rows and columns: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        Colsum obj_A = new Colsum(m ,n);
        Colsum obj_B = new Colsum(m ,n);
        
        System.out.println("Enter the elements into the matrix A: ");
        obj_A.readArray();
        System.out.println("Enter the elements into the matrix B: ");
        obj_B.readArray();
        
        System.out.println("Matrix A:");
        obj_A.print();
        System.out.println("Matrix B:");
        obj_B.print();
        
        if (obj_A.check(obj_A, obj_B)) 
        {
            System.out.println("Sum of corresponding columns is equal.");
        } 
        else 
        {
            System.out.println("Sum of corresponding columns is NOT equal.");
        }
    }
    public void readArray()
    {
        Scanner sc = new Scanner (System.in);
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                mat[i][j] = sc.nextInt();
            }
        }
    }
    public boolean check(Colsum A, Colsum B)
    {
        for (int j = 0; j < n; j++) //Column
        {  
            int sumA = 0, sumB = 0;
            for (int i = 0; i < m; i++) //Row
            {   
                sumA += A.mat[i][j];
                sumB += B.mat[i][j];
            }
            if (sumA != sumB) 
            {
                return false;
            }
        }
        return true;
    }
    public void print()
    {
        for (int i = 0; i < m; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}