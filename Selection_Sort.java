  import java.util.*;
public class Selection_Sort
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
        for(i = 0; i < n; i++)
        {
            small = a[i];
            pos = i;
            for(j = i+1; j < n-1; j++)
            {
                if(a[j] < small)
                {
                    small = a[j];
                    pos = j;
                }
            }
            temp = a[i];
            a[i] = a[pos];
            a[pos] = temp;
        }
        System.out.println("The ascending order array is: ");
        for(i = 0; i < n; i++)
        {
            System.out.println(a[i]+" ");
        }
    }
}