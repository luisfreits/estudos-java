package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import enums.OrderStatus;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Locale; 
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    System.out.println("Enter cliente data:");
    System.out.print("Name: ");
    String name = sc.nextLine();
    System.out.print("Email: ");
    String email = sc.nextLine();
    System.out.print("Birth date (DD/MM/YYYY): ");
    Date birthDate = sdf.parse(sc.next());
    sc.nextLine();

    Client client = new Client(name, email, birthDate);

    System.out.println("Enter order data:");
    System.out.print("Status: ");
    OrderStatus status = OrderStatus.valueOf(sc.nextLine());
    Order order = new Order(new Date(), status, client);
    System.out.print("How many items to this order? ");
    Integer items = sc.nextInt();

    for(int i = 1 ; i <= items ; i++){
        sc.nextLine();
        System.out.println("Enter #" + i + " item data:");
        System.out.print("Product name: ");
        String productName = sc.nextLine();
        System.out.print("Product price: ");
        Double price = sc.nextDouble();
        System.out.print("Quantity: ");
        Integer quantity = sc.nextInt();
        Product product = new Product(productName, price);
        OrderItem orderItem = new OrderItem(quantity, price, product);
        order.addItem(orderItem);

    }

    System.out.println("\nORDER SUMMARY:");
    System.out.println(order);
    sc.close();
    }
}
