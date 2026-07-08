public class Review_3
{
    public static void main()
    {
        String s = "Java";
        int l = s.length();
        for(int i = 1; i <=4; i++)
        {
             for(int j = 0; j < l; j++)
            {
                System.out.print(s.charAt(j));
            }
            System.out.println();
        }
}
}