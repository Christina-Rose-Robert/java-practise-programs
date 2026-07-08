import java.util.*;
public class PrimeFac
{
    int num[];   
    int freq[];  
    public PrimeFac()
    {
        num = new int[50];
        freq = new int[50];
    }
    public static void main()
    {
        PrimeFac obj = new PrimeFac();
        obj.enter();
        obj.frefac();
        obj.disp();
    }
    public void enter()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");
        for(int i=0; i<5; i++)
        {
            num[i] = sc.nextInt();
        }
    }
    public void frefac()
    {
        for(int i=0; i<5; i++)
        {
            int n = num[i];
            freq[i] = 0; 
            for(int j=2; j<=n; j++)
            {
                while(n % j == 0)
                {
                    freq[i]++;
                    n = n / j;
                }
            }
        }
    }
    public void disp()
    {
        System.out.println("Number\tPrime Factor Count");
        for(int i=0; i<5; i++)
        {
            System.out.println(num[i] + "\t" + freq[i]);
        } 
    }
}