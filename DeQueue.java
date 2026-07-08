public class DeQueue 
{ 
    int rear,front,size,q[]; 
    public DeQueue(int x) 
    { 
        size = x; 
        q = new int[size]; 
        front = rear = 0; 
    } 
    void addrear(int e) 
    { 
        if(rear < size) 
        {
            q[rear++] = e;
        }
        else 
        {
            System.out.println("Overflow"); 
        }
    } 
     void addfront(int e) 
    { 
        if(front > 0) 
        { 
            front = front-1; 
            q[front] = e; 
        } 
        else 
        {
            System.out.println("Overflow from front"); 
        }
    } 
    public int popfront() 
    { 
        if(front != rear) 
        {
            return q[front++];
        }
        else 
        {
            return -99999; 
        }
    } 
    public int poprear() 
    { 
        if(rear > 0) 
        {
            return q[--rear]; 
        }
        else 
        {
            return -99999; 
        }
    } 
    public void display() 
    { 
        for(int i = front;i < rear;i++) 
        System.out.print(q[i]+" "); 
    }
}