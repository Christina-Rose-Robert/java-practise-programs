/*
  Write a program to display the following pattern using for loop:
  
  A 
  AB
  ABC
  ABCD
  ABCDE
  
 */

/**/
public class Class_21
{
    public static void main()
    {
        for(int i = 1; i <= 5; i ++)
        {
            char ch = 'A';
            for(int j = 1; j <= i; j++)
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println("");
        }
    }
}