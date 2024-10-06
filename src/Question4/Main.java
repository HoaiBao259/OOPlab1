package Question4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the ID for order: ");
        
        int orderId = scan.nextInt();
        Order order = new Order(orderId);
        System.out.print("How many items in the order: ");
        int numberOfItems = scan.nextInt();


        for (int i = 0; i < numberOfItems; i++) {
            System.out.print("Please enter the ID for item " + (i + 1) + ": ");
            int itemId = scan.nextInt();
            scan.nextLine();

            System.out.print("Please enter the name for item " + (i + 1) + ": ");
            String itemName = scan.nextLine();

            System.out.print("Please enter the price for item " + (i + 1) + ": ");
            double itemPrice = scan.nextDouble();

            Item item = new Item(itemId, itemName, itemPrice);
            order.addItem(item);
        }
        System.out.println("You have a new order with ID: " + order.getId());
        System.out.println("The average price in your order is: " + order.calculateAverageCost());
    }
}
