/*
  LCM
 */
import java.util.*;
public class LCM
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int LCM = 0;
        //Calculating the greatest common divisor (GCD)
        int GCD = 0;
        for(int i = 1; i <= a || i <=b; i++)
        {
            if(a%i == 0 && b%i == 0)
            {
             GCD = i;   
            }
        }
        //Calculating LCM 
        LCM = (a*b)/GCD;
        System.out.println("LCM: "+LCM);
    }
}