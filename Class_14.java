/*
Pattern:
####
###
##
#
*/

/*
 * 9999
 * 666
 * 33
 * 0
 */

/*
 * 97531
 * 9753
 * 975
 * 97
 * 9
 */
/**/

public class Class_14
{
    public static void main()
    {
        for(int i = 4; i > 0; i--)
        {
            for(int j = i; j > 0; j--)
            {
                System.out.print("#");
            }
            System.out.println("");
        }
        
        int a = 9;
        for(int i = 4; i > 0; i--)
        {
            for(int j = i; j > 0; j--)
            {
                System.out.print(a);
            }
            a=a-3;
            System.out.println("");
        }
        
        for(int i = 5; i > 0; i--)  //also [for(int i = 5,b=9; i > 0; i--)]
        {
            int b = 9;
            for(int j = i; j > 0; j--)
            {
                System.out.print(b);
                b=b-2;
            }
            System.out.println("");
        }
        
        for(int i = 4; i > 0; i--)
        {
            for(int j = 4; j > 0; j--)
            {
                System.out.print("#");
            }
            System.out.println("");
        }
    }
}