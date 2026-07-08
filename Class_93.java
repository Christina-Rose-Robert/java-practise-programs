import java.util.*;
public class Class_93
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        int i,j,pos,small,temp;
        System.out.println("Enter the elements into the array: ");
        for(i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        for(i = 0; i < n-1; i++)
        {
            
            pos = i;
            for(j = i+1; j < n; j++)
            {
                if(a[j] < a[pos])
                {
                    small = a[j];
                    pos = j;
                }
            }
            temp = a[pos];
            a[pos] = a[i];
            a[i] = temp;
        }
        System.out.println("The ascending order array is: ");
        for(i = 0; i < n; i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}