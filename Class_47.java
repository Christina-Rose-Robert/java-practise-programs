import java.util.*;
public class Class_47
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a and b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int HCF = 0;
        for(int i = 1; i<=a || i<=b; i++)
        {
            if(a%i == 0 && b%i == 0)
            {
             HCF = i;   
            }
        }
        System.out.println("HCF: "+HCF);
    }
}