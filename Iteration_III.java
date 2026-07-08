/*
  j
  ja
  jav
  java
*/

import java.util.*;
public class Iteration_III
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
    }
}