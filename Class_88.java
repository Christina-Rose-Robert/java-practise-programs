import java.util.*;

public class Class_88 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String str = sc.nextLine();
        int c = 0;
        int l = str.length();
        String word = "";
        
        for (int i = 0; i < l; i++) {
            char ch = str.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                word = word + ch;
            } else {
                if (word.equalsIgnoreCase("the")) {
                    c++;
                }
                word = ""; // Reset word after processing
            }
        }
        
        // Check the last word
        if (word.equalsIgnoreCase("the")) {
            c++;
        }
        
        System.out.println("Frequency: "+c);

}
}