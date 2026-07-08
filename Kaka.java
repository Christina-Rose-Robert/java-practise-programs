import java.util.Scanner;

public class Kaka 
{
    public static int[] algorithm_a(int flour, int sugar) 
    {
        int flourNeeded = 100;
        int sugarNeeded = 50;
        int cakeCount = 0;

        while (flour >= flourNeeded && sugar >= sugarNeeded) 
        {
            flour -= flourNeeded;
            sugar -= sugarNeeded;
            cakeCount++;
        }

        return new int[]{cakeCount, flour, sugar};
    }
    public static void main()  
    {
        try (Scanner scanner = new Scanner(System.in)) 
        {
            System.out.println("Enter the amount of flour available: ");
            int flour = scanner.nextInt();   // direct integer input

            System.out.println("Enter the amount of sugar available: ");
            int sugar = scanner.nextInt();   // direct integer input

            int[] result = algorithm_a(flour, sugar);

            System.out.println("Number of cakes that can be made: " + result[0]);
            System.out.println("Remaining flour: " + result[1]);
            System.out.println("Remaining sugar: " + result[2]);
        } 
        catch (Exception e) 
        {
            System.err.println("Error: " + e.getMessage());
            System.exit(1);
        }
    }
}
