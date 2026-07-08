/*
  Write a program to read a sentence.
  Frame a word with the first word and
  the last word. Arrange the new word
  with the pattern given below:
  
  EXAMPLE:
  
  Input: All the best for your Exams
  New word: AllExams
  Pattern:- 
            
           AllExams
           AllExam
           AllExa
           AllEx
           AllE
           All
           Al
           A
 */

import java.util.*;
public class Class_18
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a sentence: ");
        String str = sc.nextLine();
        str.trim();
        int l = str.length();
        String NewWord = "";
        int space1 = str.indexOf(" ");
        int space2 = str.lastIndexOf(" ");
        NewWord = str.substring(0,space1).concat(str.substring(space2,l));
        System.out.println(NewWord);
    }
}