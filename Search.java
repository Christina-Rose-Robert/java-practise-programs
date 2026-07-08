import java.util.*;
public class Search
{
    Scanner sc=new Scanner(System.in);
    int n;
    int a[];
    public static void main()
    {
        Search o1=new Search();
        o1.input();
        o1.menudriven();
    }
    public void input()
    {
        System.out.println("Input an Integer");
        n=sc.nextInt();
        a=new int[n];
        System.out.println("Input Values");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
    }
    public void menudriven()
    {
        System.out.println("\t\t\t\tMENU");
        System.out.println("1:Search an Element,2:Modify the array ");
        System.out.println("Enter a Choice");
        int ans=sc.nextInt();
        switch(ans)
        {
            case 1:System.out.println("\t\t\t\tMENU");
                   System.out.println("L:Linear Search,B:Binary Search");
                   System.out.println("Enter a Choice");
                   char ch=sc.next().charAt(0);
                   System.out.println("Input the Search Element");
                   int sn=sc.nextInt();
                   switch(ch)
                   {
                       case 'L':int q=0;
                                boolean flag=false;
                                for(int i=0;i<n;i++)
                                {
                                    if(a[i]==sn)
                                    {
                                        flag=true;
                                        q=i;
                                        break;
                                    }
                                    else
                                    continue;
                                }
                                if(flag)
                                System.out.println("Element "+sn+" is found at the index position "+q);
                                else
                                System.out.println("The Inputed Number is not present in the Array");
                                break;
                       case 'B':int temp=0;
                                for(int i=0;i<a.length-1;i++)
                                {
                                    int mp=i;
                                    for(int j=i+1;j<n;j++)
                                    {
                                        if(a[j]<a[mp])
                                        mp=i;
                                    }
                                    temp=a[mp];
                                    a[mp]=a[i];
                                    a[i]=temp;
                                }
                                boolean flag1=false;
                                int lw=0,up=a.length-1,mid,y=0;
                                while(lw<=up)
                                {
                                    mid=(lw+up)/2;
                                    if(sn==a[mid])
                                    {
                                        flag1=true;
                                        y=mid;
                                        break;
                                    }
                                    else if(a[mid]<sn)
                                    up=mid-1;
                                    else
                                    lw=mid+1;
                                }
                                if(flag1)
                                System.out.println("Element "+sn+" is found at the index position "+y);
                                else
                                System.out.println("The Inputed Number is not present in the Array");
                                break;
                   }
                   break;
            case 2:System.out.println("\t\t\t\tMENU");
                   System.out.println("A:Add an element to specified position,D:Delete a specified element");
                   System.out.println("Enter a Choice");
                   char cch=sc.next().charAt(0);
                   switch(cch)
                   {
                       case 'A':System.out.println("Enter the Element and The Specified Index");
                                int ae=sc.nextInt();
                                int in=sc.nextInt();
                                int p[]=new int[a.length+1];
                                int x=0;
                                for(int i=0;i<p.length;i++)
                                {
                                    if(i==in)
                                    p[i]=ae;
                                    else
                                    {
                                        p[i]=a[x];
                                        x++;
                                    }
                                }
                                System.out.println("New Array");
                                for(int h=0;h<p.length;h++)
                                System.out.print(p[h]+" ");
                                break;
                       case 'D':System.out.println("Enter The Specified Index");
                                int ing=sc.nextInt();
                                int k[]=new int[a.length];
                                for(int i=0;i<ing;i++)
                                {
                                    k[i]=a[i];
                                }
                                for(int i=ing+1;i<a.length;i++)
                                {
                                    k[i-1]=a[i];
                                }
                                for(int h=0;h<k.length-1;h++)
                                System.out.print(k[h]+" ");
                                break;
                   }
                   
        }
    }
}
