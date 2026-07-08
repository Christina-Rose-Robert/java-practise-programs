//Magic Word
 
 import java.util.*;
 public class Question_1
 {
     public static void main()
     {
         Scanner sc = new Scanner (System.in);
         System.out.println("Enter a word: ");
         String word = sc.next();
         int l = word.length();
         boolean flag = false;
         for(int i = 0; i < l-1; i++)
         {
             char ch1 = word.charAt(i);
             char ch2 = word.charAt(i+1);
             if(ch1 + 1 == ch2)
             {
                 flag = true;
                 break;
             }
         }
         if (flag)
         System.out.println(word+" is a magic word.");
         else
         System.out.println(word+" is not a magic word.");
     }
 }
 
 /*
   Output I
   Enter a word: 
   Press
   Press is not a magic word.
   
   Output II
   Enter a word: 
   Best
   Best is a magic word.
   
   
   Algorithm:
   STEP 1. Ask the user to input a word to check if it is a magic word or not.
   STEP 2. Find the length of the inputted word.
   STEP 3. Set boolean flag to false.
   STEP 4. Carry out iteration in a 'for-loop' to go through each character in the word.
    a. Get the character at the index i in the variable ch1.
    b. Get the next character at the index (i + 1) in the variable ch2.
    c. If the value of ch1 + 1 is equal to the value of ch2: 
       (that is, if the letter after the original letter in the alphabetical series is equal to the letter after the original letter in the inputted word)
      i. Set 'flag' to true.
      ii. Break out of the loop.
   STEP 5. If 'flag' is true:
   a. Print that the word is a magic word.
   STEP 6. If the above statement is not true, execute 'else':
   a. Print that the word is not a magic word.

  */