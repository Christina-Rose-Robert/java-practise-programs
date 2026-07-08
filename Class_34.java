/*
  Define a class to accept a string
  and print the characters with the
  uppercase and lowercase reversed,
  but all the other characters should
  remain the same as before.
  
  EXAMPLE:
  
  Input: WelCoMe_2022
  Output: wElcOmE_2022
 */
import java.util.Scanner;

public class Class_34
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = sc.nextLine();
        int length = inputString.length();

        StringBuilder modifiedString = new StringBuilder();

        for (int i = 0; i < length; i++) {
            char ch = inputString.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                modifiedString.append(Character.toLowerCase(ch));
            } else if (ch >= 'a' && ch <= 'z') {
                modifiedString.append(Character.toUpperCase(ch));
            } else {
                modifiedString.append(ch);
            }
        }

        System.out.println("Output: " + modifiedString.toString());
    }
}