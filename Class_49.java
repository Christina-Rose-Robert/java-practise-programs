/*
  A tech number has even number of digits.
  If the number is split into equal halves,
  then the square of the sum of these halves
  is equal to the number itself.
  
  3025
  (30 + 25)^2 = (55)^2 = 3025
  
  Write a program to generate and print all 4 digit Tech Numbers.
 */

public class Class_49
{
    public static void main()
    {
        int n1, n2; boolean flag = false;
        System.out.println("All 4-digit Tech Numbers: ");
        for(int i = 1000; i < 10000; i++)
        {
            n1 = i % 100;
            n2 = i / 100;
            if(((n1+n2)*(n1+n2)) == i)
            {
                System.out.println(i);
            }
        }
    }
}