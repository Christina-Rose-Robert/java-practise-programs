/*
 * Use of valueOf() method and also write a sample program.
 */

import java.util.*;
public class Quest_3
{
    public static void main()
    {
        String num = "9334";
        System.out.println(String.valueOf(num));
        int a = 123;
        System.out.println(String.valueOf(a));
        double b = 123.0;
        System.out.println(String.valueOf(b));
        byte c = 12;
        System.out.println(String.valueOf(c));
        short d = 123;
        System.out.println(String.valueOf(d));
        float f = 1234f;
        System.out.println(String.valueOf(f));
        char g = 'a';
        System.out.println(String.valueOf(g));
        long h = 12345;
        System.out.println(String.valueOf(h));
        boolean i = true;
        System.out.println(String.valueOf(i));
        Quest_2 Q2 = new Quest_2();
        System.out.println(String.valueOf(Q2));
    }
}