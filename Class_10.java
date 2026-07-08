//Two dimensional array program.

// Write a program to initialize marks to a 3x3 array and display them.

public class Class_10
{
    public static void main()
    {
        double m[][] = {{90.9, 97.5, 94,8},{92.9,96.5,99.9},{95.9,98.0,97.9}};
        int i,j;
        System.out.println("The marks are: ");
        for(i = 0; i <3; i++)
        {
            for(j = 0; j<3; j++)
            {
                System.out.print(m[i][j]+ ", ");
            }
            System.out.println();
        }
    }
}