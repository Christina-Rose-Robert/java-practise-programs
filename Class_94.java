/* 
  
            The result of a quiz competition is to be prepared as follows:
            The quiz has five questions with four multiple choices (A, B, C, D), with each question
            carrying 1 mark for the correct answer. Design a program to accept the number of
            participants N such that N must be greater than 3 and less than 11. Create a double dimensional array of size (Nx5) to store the answers of each participant row-wise.
            Calculate the marks for each participant by matching the correct answer stored in a
            single-dimensional array of size 5. Display the scores for each participant and also the
            participant(s) having the highest score.
            Example: If the value of N = 4, then the array would be:
            Q1 Q2 Q3 Q4 Q5
            Participant 1 A B B C A
            Participant 2 D A D C B
            Participant 3 A A B A C
            Participant 4 D C C A B
            Key to the question: D C C B A
            Note: Array entries are line fed (i.e. one entry per line)
            Test your program for the following data and some random data.
            Example 1
            INPUT:
            N = 5
            Participant 1 D A B C C
            Participant 2 A A D C B
            Participant 3 B A C D B
            Participant 4 D A D C B
            Participant 5 B C A D D
            Key: B C D A A
            OUTPUT:
            Scores:
            Participant 1 = 0
            Participant 2 = 1
            Participant 3 = 1
            Participant 4 = 1
            Participant 5 = 2
            Highest Score:
            Participant 5
            Example 2
            INPUT:
            N = 4
            Participant 1 A C C B D
            Participant 2 B C A A C
            Participant 3 B C B A A
            Participant 4 C C D D B
            Key: A C D B B
            OUTPUT:
            Scores:
            Participant 1 = 3
            Participant 2 = 1
            Participant 3 = 1
            Participant 4 = 3
            Highest Score:
            Participant 1
            Participant 4
            Example 3
            INPUT:
            N = 12
            OUTPUT:
            INPUT SIZE OUT OF RANGE.
 
 
 */
/*
import java.util.*;
public class Class_94
{
    static int N; //Number of participants
    static String A[][] = new String[N][5]; //Stores the answers of each participant
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        Class_94 obj = new Class_94();
                
        boolean flag = true;
        while (flag)
        {
            System.out.print("N = ");
            int n = sc.nextInt();
            N = n;
            if(N > 3 && N < 11)
            {
                obj.Answers(N);
                flag = false;
            }
            else
            {
                System.out.println("\nInvlaid input. Try again.");
            }
        }
    }
    public void Answers(int N)
    {
        Scanner sc = new Scanner (System.in);
        for(int i = 0; i < N; i++)
        {
            System.out.print("\nParticipant "+(i+1)+" ");
            for(int j = 0; j < 5; j++)
            {
                A[i][j] = sc.next();
            }
        }
    }
}
*/

import java.util.Scanner;

public class Class_94 {
    int N; // Number of participants
    String A[][] = new String[N][5]; // Stores the answers of each participant
    String key[][] = new String[N][5];
    public static void main() 
    {
        Scanner sc = new Scanner(System.in);
        Class_94 obj = new Class_94();
        
        boolean flag = true;
        while (flag) 
        {
            System.out.print("N = ");
            int N = sc.nextInt(); 
            
            if (N > 3 && N < 11) 
            {
                obj.N = N; // Set the instance variable N
                obj.A = new String[N][5]; // Initialize the array with N rows and 5 columns
                obj.Answers();
                flag = false;
            } 
            else 
            {
                System.out.println("Invalid input. Try again.");
            }
        }
    }

    public void Answers() 
    {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < N; i++) 
        {
            System.out.print("Participant " + (i + 1) + ": ");
            for (int j = 0; j < 2; j++) 
            {
                A[i][j] = sc.next();
            }
        }
    }
}
