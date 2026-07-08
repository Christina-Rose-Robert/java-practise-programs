import java.util.*;
public class Flipgram
{
    String word;
    public Flipgram (String s)
    {
        word = s; 
    }
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a word: ");
        String input = sc.next();
        Flipgram obj = new Flipgram(input);
        obj.display();
    }
    public boolean ishetero() 
    {
        for(int i = 0; i < word.length(); i++) 
        {
            for(int j = i+1; j < word.length(); j++) 
            {
                if(word.charAt(i) == word.charAt(j)) 
                {
                    return false;
                }
            }
        }
        return true;
    }
    public String flip() 
    {
        int l = word.length();
        int mid = l / 2;
        String firsthalf = "";
        String secondhalf = "";
        String finalWord = "";
        if(l % 2 == 0) // Even
        { 
            firsthalf = word.substring(0, mid);
            secondhalf = word.substring(mid);
            finalWord = secondhalf + firsthalf;
        } 
        else // Odd
        { 
            firsthalf = word.substring(0, mid);
            char middle = word.charAt(mid);
            secondhalf = word.substring(mid+1);
            finalWord = secondhalf + middle + firsthalf;
        }
        return finalWord;
    }
    public void display()
    {
        boolean isHeterogram = ishetero();
        if(isHeterogram)
        {
            System.out.println("HETEROGRAM");
        }
        else
        {
            System.out.println(flip());
        }
    }
}