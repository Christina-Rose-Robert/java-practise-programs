import java.util.Scanner;

class Stack 
{
    int top;
    int n;
    char[] arr;

    // Constructor
    Stack(int size) 
    {
        n = size;
        arr = new char[n];
        top = -1;
    }

    // Push operation
    void push(char value) 
    {
        if (top == n - 1) 
        {
            System.out.println("Stack Overflow");
        } 
        else 
        {
            arr[++top] = value;
        }
    }

    // Pop operation
    char pop() 
    {
        if (top == -1) 
        {
            System.out.println("Stack Underflow");
            return '\0';
        } else 
        {
            return arr[top--];
        }
    }
}

public class ReverseString 
{
    public static void main() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        Stack stack = new Stack(str.length());
        
        for (int i = 0; i < str.length(); i++) 
        {
            stack.push(str.charAt(i));
        }

        String reversed = "";
        while (stack.top != -1) 
        {
            reversed += stack.pop();
        }

        System.out.println("Reversed string: " + reversed);
        sc.close();
    }
}
