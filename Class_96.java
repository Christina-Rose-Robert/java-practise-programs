import java.util.*;

public class Class_96
{
    int n, top;
    int stack[];

    // Constructor
    Class_96(int k)
    {
        n = k;
        stack = new int[n];
        top = -1;
    }
    
    // Function to insert an element in the stack
    void push(int p)
    {
        if(top == n - 1)
        {
            System.out.println("Stack Overflow");
        }
        else
        {
            top++;
            stack[top] = p;
        }
    }

    // Function to delete an element
    public void Pop()
    {
        if(top == -1)
            System.out.println("Stack Underflow");
        else
        {
            int m = stack[top];
            top--;
            System.out.println("The number deleted is " + m);
        }
    }

    // Function to display the stack
    void display()
    {
        System.out.println("STACK:");
        for(int i = top; i >= 0; i--)
            System.out.println(stack[i]);
    }

    // MAIN METHOD
    public void main()
    {
        int e;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        Class_96 s1 = new Class_96(size);
        int ch;
        do
        {
            System.out.println("Enter your choice");
            System.out.println("1. PUSH");
            System.out.println("2. POP");
            System.out.println("3. DISPLAY");
            System.out.println("4. EXIT");
            ch = sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("Enter the number to be inserted");
                    e = sc.nextInt();
                    s1.push(e);
                    break;
                case 2:
                    s1.Pop();
                    break;
                case 3:
                    s1.display();
                    break;
                case 4:
                    System.out.println("Stop Processing");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
        while(ch != 4);
    }
}