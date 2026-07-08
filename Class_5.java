//Binary search

import java.util.*;
public class Class_5
{
public static void main()
 {
  Scanner sc = new Scanner (System.in);
  System.out.println("Enter number of numbers: ");
  int n = sc.nextInt(); //number of numbers in the array
  System.out.println("Number of numbers entered: " +n);
  int num[] = new int[n];
  for(int i = 0; i < n; i++)
  {
      System.out.println("Enter number for the position "+i+": "); 
      num[i]=sc.nextInt();
  }
  System.out.println("The numbers in the array: ");
  for(int i = 0; i < n; i++)
  {
     System.out.println(num[i]);
  }
  System.out.println("Enter the number to be found in the array: ");
  int found = sc.nextInt();
  boolean flag = false;
  int lower = 0, upper = n-1, middle = 0;
  
  while(lower<=upper)
  {
      middle = (lower + upper) / 2;
      if(found == num[middle])
      {
          flag = true;
          break;
      }
      else if(found > num[middle])
      {
          lower = middle + 1;
          flag = true;
      }
      else 
      {
          upper = middle - 1;
          flag = true;
      }
  }
  if(flag == true) 
  
   System.out.println("Number is present at index: "+ middle);
   
   else 
   
   System.out.println("Number is not present in the array");
  }
}