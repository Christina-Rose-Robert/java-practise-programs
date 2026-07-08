/*
  j
  ja
  jav
  java
 */

import java.util.*;
public class Class_26
{
    public static void main()
    {
        for(int i = 1; i <= 4; i ++)
        {
            String str = "java";
            for(int j = 0; j < i; j++)
            {
                System.out.print(str.charAt(j));
            }
            System.out.println("");
        }
        
        //Generate the same pattern using substring method.
        
        for(int i = 1; i <= 4; i ++)
        {
            String str = "java";
            System.out.print(str.substring(0,i));
            System.out.println("");
        }
    }
}