/*
  Define a class called "Fruit Juice" with the following descriptions:
  
  Instance variables or data members:
  
  int productcode  : stores the product code number
  
  String flavour   : stores the flavour of the juice 
                     (orange, apple etc)
                     
  String packtype  : stores the type of packaging
                     (tetra pack, bottle etc)
                     
  int packsize     : stores package size
                     (200ml, 400ml etc)
                     
  int productprice : stores the price of the product
  
  
  
  
  Member methods:
  
  Fruit_Juice()   : default constructor to initialize 
                    integer data-members to 0 and 
                    String data-members to ""
                  
  void input()    : to input and store the product code,
                    flavour, pack type, pack size and 
                    product price
                  
  void discount() : to reduce the product price by 10%
  
  void display()  : to display the product code, flavour,
                    pack type, pack size and product price 
  
 */
import java.util.*;
public class Fruit_Juice
{
    static int productcode;
    static String flavour;
    static String packtype;
    static int packsize;
    static int productprice;
    public static void main()
    {
        Fruit_Juice obj = new Fruit_Juice();
        input();
        discount();
        display();
    }
    public Fruit_Juice()
    {
         productcode = 0;
         flavour = "";
         packtype = "";
         packsize = 0;
         productprice = 0;
    }
    public static void input() //To input and store the product code, flavour, pack type, pack size and product price     
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the product code: ");
        productcode = sc.nextInt();
        System.out.println("Enter the flavour: ");
        flavour = sc.next();
        System.out.println("Enter the pack type: ");
        packtype = sc.next();
        System.out.println("Enter the pack size: ");
        packsize = sc.nextInt();
        System.out.println("Enter the product price: ");
        productprice = sc.nextInt();
    }
    public static void discount() //To reduce the product price by 10%
    {
        productprice = productprice - (productprice * 10/100);
    }
    public static void display() //To display the product code, flavour, pack type, pack size and product price 
    {
        System.out.println("");
        System.out.println("PRODUCT CODE: "+productcode);
        System.out.println("FLAVOUR: "+flavour);
        System.out.println("PACK TYPE: "+packtype);
        System.out.println("PRODUCT PRICE: "+productprice);
    }
}