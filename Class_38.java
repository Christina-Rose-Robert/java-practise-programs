/*
  Initialization of matrices.
 */
public class Class_38
{
    public static void main()
    {
        int a[][] = {{1,2,3},{1,2,3},{1,2,3}};
        int b[][] = {{4,5,6},{4,5,6},{4,5,6}};
        //Calculating the number of rows...
        int rows = a.length;
        int coloumns = a[0].length;
        System.out.println("The first matrix: ");
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < coloumns; j++)
            {
             System.out.print(a[i][j]+"\t"); 
            }
            System.out.println("");
        }
        System.out.println("The second matrix: ");
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < coloumns; j++)
            {
             System.out.print(b[i][j]+"\t"); 
            }
            System.out.println("");
        }
        int sum[][] = new int[rows][coloumns];
        //Addition
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < coloumns; j++)
            {
             sum[i][j] = a[i][j] + b[i][j];   
            }
        }
        System.out.println("Sum of the two matrices: ");
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < coloumns; j++)
            {
             System.out.print(sum[i][j]+"\t"); 
            }
            System.out.println("");
        }
    }
}