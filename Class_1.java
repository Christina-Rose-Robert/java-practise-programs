public class Class_1
{
    public static void main()
    {
           for (int i = 5; i >= 0; i--) 
         {
        int n=i;
        for (int j = 1; j <= i; j++) 
          {
            System.out.print(n-- +" ");
          }
         System.out.println();
     }
    }
}