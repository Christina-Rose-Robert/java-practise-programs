import java.io.*;
import java.lang.*;

class Order 
{
    private String customerName;
    private String itemName;
    private int quantity;
    private double price;

    public Order(String customer, String item, int qty, double cost) 
    {
        customerName = customer;
        itemName = item;
        quantity = qty;
        price = cost;
    }

    public Order() 
    {
        customerName = "Unknown";
        itemName = "Unknown";
        quantity = 0;
        price = 0.0;
    }

    public void saveToFile(DataOutputStream dos) throws IOException 
    {
        dos.writeUTF(customerName != null ? customerName : "Unknown");
        dos.writeUTF(itemName != null ? itemName : "Unknown");
        dos.writeInt(quantity);
        dos.writeDouble(price);
    }

    public void readFromFile(DataInputStream dis) throws IOException 
    {
        customerName = dis.readUTF();
        itemName = dis.readUTF();
        quantity = dis.readInt();
        price = dis.readDouble();
        if (customerName == null) 
        {
            customerName = "Unknown";
        }
        if (itemName == null) 
        {
            itemName = "Unknown";
        }
    }

    public String getCustomerName() 
    {
        return customerName;
    }

    public String getItemName() 
    {
        return itemName;
    }

    public int getQuantity() 
    {
        return quantity;
    }

    public double getPrice() 
    {
        return price;
    }

    public double calculateTotalPrice() 
    {
        return quantity * price;
    }

    @Override
    public String toString() 
    {
        return "Customer: " + customerName +
                ", Item: " + itemName +
                ", Quantity: " + quantity +
                ", Price: " + price +
                ", Total: " + calculateTotalPrice();
    }
}

class OrderManager 
{
    private final String fileName;
    private final String tempFileName;

    public OrderManager(String mainFileName, String tempFile) 
    {
        fileName = mainFileName;
        tempFileName = tempFile;
    }

    public void placeOrder(BufferedReader br) throws IOException 
    {
        System.out.print("Enter Customer Name: ");
        String customerName = br.readLine();
        System.out.print("Enter Item Name: ");
        String itemName = br.readLine();
        System.out.print("Enter Quantity: ");
        int quantity = getValidIntegerInput(br);
        System.out.print("Enter Price: ");
        double price = getValidDoubleInput(br);

        Order order = new Order(customerName, itemName, quantity, price);

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName, true))) 
        {
            order.saveToFile(dos);
        }
        System.out.println("Order placed successfully.");
    }

    public void viewAllOrders() throws IOException 
    {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) 
        {
            while (dis.available() > 0) 
            {
                Order order = new Order();
                order.readFromFile(dis);
                System.out.println(order);
            }
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("No orders found.");
        }
    }

    public void searchOrders(String searchKey, boolean byCustomerName) throws IOException 
    {
        boolean found = false;
        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) 
        {
            while (dis.available() > 0) 
            {
                Order order = new Order();
                order.readFromFile(dis);

                if ((byCustomerName && searchKey.equalsIgnoreCase(order.getCustomerName())) ||
                        (!byCustomerName && searchKey.equalsIgnoreCase(order.getItemName()))) 
                {
                    System.out.println(order);
                    found = true;
                }
            }
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("No orders found.");
        }

        if (!found) 
        {
            System.out.println("No matching orders found.");
        }
    }

    public void editOrder(String customerName, BufferedReader br) throws IOException 
    {
        File originalFile = new File(fileName);
        File tempFile = new File(tempFileName);
        boolean edited = false;

        try (DataInputStream dis = new DataInputStream(new FileInputStream(originalFile));
             DataOutputStream dos = new DataOutputStream(new FileOutputStream(tempFile))) 
        {
            while (dis.available() > 0) 
            {
                Order order = new Order();
                order.readFromFile(dis);

                if (order.getCustomerName() != null && customerName.equalsIgnoreCase(order.getCustomerName())) 
                {
                    System.out.println("Editing Order: " + order);
                    System.out.print("Enter New Quantity: ");
                    int newQuantity = getValidIntegerInput(br);
                    System.out.print("Enter New Price: ");
                    double newPrice = getValidDoubleInput(br);

                    order = new Order(order.getCustomerName(), order.getItemName(), newQuantity, newPrice);
                    edited = true;
                }

                order.saveToFile(dos);
            }
        }

        if (edited && originalFile.delete() && tempFile.renameTo(originalFile)) 
        {
            System.out.println("Order edited successfully.");
        } 
        else 
        {
            System.out.println("No matching order found to edit.");
        }
    }

    private int getValidIntegerInput(BufferedReader br) throws IOException 
    {
        int value;
        while (true) 
        {
            try 
            {
                value = java.lang.Integer.parseInt(br.readLine());
                if (value >= 0) 
                {
                    return value;
                } 
                else 
                {
                    System.out.print("Please enter a positive integer: ");
                }
            } 
            catch (NumberFormatException e) 
            {
                System.out.print("Invalid input. Please enter a valid integer: ");
            }
        }
    }

    private double getValidDoubleInput(BufferedReader br) throws IOException 
    {
        double value;
        while (true) 
        {
            try 
            {
                value = Double.parseDouble(br.readLine());
                if (value >= 0) 
                {
                    return value;
                } 
                else 
                {
                    System.out.print("Please enter a positive price: ");
                }
            } 
            catch (NumberFormatException e) 
            {
                System.out.print("Invalid input. Please enter a valid price: ");
            }
        }
    }
}

public class OrderManagementSystem 
{
    public static void main() 
    {
        InputStreamReader ip = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OrderManager manager = new OrderManager("D:\\BlueJBG\\orders.txt",
                "D:\\BlueJBG\\temp_orders.txt");

        while (true) 
        {
            System.out.println("\nMenu:");
            System.out.println("1. Place an Order");
            System.out.println("2. View All Orders");
            System.out.println("3. Search Orders by Customer Name");
            System.out.println("4. Search Orders by Item Name");
            System.out.println("5. Edit an Order");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            try 
            {
                int choice = java.lang.Integer.parseInt(br.readLine().trim());

                if (choice == 6) 
                {
                    System.out.println("Exiting...");
                    break;
                }

                switch (choice) 
                {
                    case 1:
                        manager.placeOrder(br);
                        break;
                    case 2:
                        manager.viewAllOrders();
                        break;
                    case 3:
                        System.out.print("Enter Customer Name: ");
                        manager.searchOrders(br.readLine(), true);
                        break;
                    case 4:
                        System.out.print("Enter Item Name: ");
                        manager.searchOrders(br.readLine(), false);
                        break;
                    case 5:
                        System.out.print("Enter Customer Name of the order to edit: ");
                        String inputCustomerName = br.readLine();
                        if (inputCustomerName == null || inputCustomerName.trim().isEmpty()) 
                        {
                            System.out.println("Customer name cannot be empty.");
                            continue;
                        }
                        manager.editOrder(inputCustomerName, br);
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } 
            catch (Exception e) 
            {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}