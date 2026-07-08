/*
  Write a program in JAVA with the following specifications:
  
  
  Class name   : HCF_LCM
  
  Data members : int a,b
  
  Member functions -
  HCF_LCM (int x, int y) : constructor to initialize a and b
  void calculate()       : to find an print HCF and LCM of both 
                           the numbers
  
 */
import java.util.*;
public class HCF_LCM
{
    static int a,b;
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter two numbers: ");
        a = sc.nextInt(); b = sc.nextInt();
        HCF_LCM obj = new HCF_LCM(a,b);
        calculate();
    }
    public HCF_LCM(int x, int y)
    { 
        a = x; b = y;
    }
    public static void calculate()
    {
        int HCF = 1, LCM = 1;
        for(int i = 1; i <= a || i <=b; i++) //Calculation of the HCF
        {
            if(a%i == 0 && b%i == 0)
            {
                HCF = i;
            }
        }
        System.out.println("HCF: "+HCF);
        LCM = (a*b)/HCF; //Calculation of the LCM
        System.out.println("LCM: "+LCM);
    }  
}
/*                                                     OR

  Write a programme in java with the following specification:
  class name: Hcflcm
  Data members: int a,b
  Member Functions:
  HcfLcm(int x, int y): Constructor to initialize a and b.
  void calculate() : To find and print Hcf and Lem of both the numbers.
 
 import java.util.*;
 public class HcfLcm
 {
    static int a,b;
    public static void main()
    {
       Scanner sc = new Scanner (System.in);
       System.out.println("Enter two numbers: ");
       a = sc.nextInt(); b = sc.nextInt();
       HcfLcm obj = new HcfLcm(a,b);
       calculate();        
    }
    HcfLcm(int x, int y)
    {
       a = x;
       b = y;
    }
    static void calculate()
    {
       int max = 0, min = 0;
       max = a>b?a:b;
       min = a<b?a:b;
       while(min != 0)
        {
            int r = max%min;
            max = min;
            min = r;
        }
       System.out.println("Hcf is "+max);
       System.out.println("Lcm is "+((a+b)/max));
    }
 }
 */