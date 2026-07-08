import java.util.*;
public class Class_48
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int HCF = 0;
        int LCM = 0;
        for(int i = 1; i <= a|| i <= b; i++)
        {
            if (a%i == 0 && b%i == 0)
            {
                HCF = i;
            }
        }
        LCM = (a*b)/HCF;
        System.out.println("LCM: "+LCM);
    }
}