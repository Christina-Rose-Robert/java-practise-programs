import java.util.*;
class Stack 
{
    int top;
    int n;
    int[] stackArr;

    // Constructor
    Stack(int size) 
    {
        n = size;
        stackArr = new int[n];
        top = -1;
    }

    // Push operation
    void push(int value) 
    {
        if (top == n - 1) 
        {
            System.out.println("Stack Overflow");
        }
        else 
        {
            stackArr[++top] = value;
            System.out.println(value + " pushed into stack");
        }
    }

    // Pop operation
    void pop() 
    {
        if (top == -1) 
        {
            System.out.println("Stack Underflow");
        } 
        else 
        {
            System.out.println(stackArr[top--] + " popped from stack");
        }
    }

    // Display operation
    void display() 
    {
        if (top == -1) 
        {
            System.out.println("Stack is empty");
        } 
        else 
        {
            System.out.print("Stack elements: ");
            for (int i = top; i >= 0; i--) 
            {
                System.out.print(stackArr[i] + " ");
            }
            System.out.println();
        }
    }
}

public class StackDemo 
{
    public static void main() 
    {
        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack(5);

        while (true) 
        {
            System.out.println("\n1.Push  2.Pop  3.Display  4.Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) 
            {
                case 1:
                    System.out.print("Enter value to push: ");
                    int val = sc.nextInt();
                    stack.push(val);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
