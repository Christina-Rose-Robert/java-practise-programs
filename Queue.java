// Program to implement Queue as an array
import java.util.*;
public class Queue
{
    int n, front, rear;
    int queue[];

    // Constructor
    Queue(int k)
    {
        n = k;
        queue = new int[n];
        front = 0;
        rear = -1;
    }

    // Function to insert an element in the queue
    void insert(int p)
    {
        if(rear == n - 1)
        {
            System.out.println("Queue Overflow");
        }
        else
        {
            rear++;
            queue[rear] = p;
        }
    }

    // Function to delete an element from the queue
    void delete()
    {
        if(front > rear)
        {
            System.out.println("Queue Underflow");
        }
        else
        {
            int m = queue[front];
            front++;
            System.out.println("The number deleted is " + m);
        }
    }

    // Function to display the queue
    void display()
    {
        if(front > rear)
            System.out.println("Queue is empty");
        else
        {
            System.out.println("QUEUE:");
            for(int i = front; i <= rear; i++)
                System.out.println(queue[i]);
        }
    }

    // MAIN METHOD
    public void main()
    {
        int e;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        Queue q1 = new Queue(size);
        int ch;
        do
        {
            System.out.println("Enter your choice");
            System.out.println("1. INSERT");
            System.out.println("2. DELETE");
            System.out.println("3. DISPLAY");
            System.out.println("4. EXIT");
            ch = sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("Enter the number to be inserted");
                    e = sc.nextInt();
                    q1.insert(e);
                    break;
                case 2:
                    q1.delete();
                    break;
                case 3:
                    q1.display();
                    break;
                case 4:
                    System.out.println("Stop Processing");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }while(ch != 4);
    }
}
