//Write a program to define a class "Item" containing "code" and "price". accept this data for 5 objects using array of objects. Display code, price in tabular form and also, display total price of all items.
import java.util.Scanner;
public class Item {
    String code;
    double price;
    Item(String c, double p) {
        code = c;
        price = p;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Item[] items = new Item[5];
        double total = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter code and price for item " + (i + 1) + ": ");
            items[i] = new Item(sc.nextLine(), sc.nextDouble());
            total += items[i].price;
        }
        System.out.println("\nCODE\t\tPRICE");
        System.out.println();
        for (Item itm : items) {
            System.out.println(itm.code + "\t\t" + itm.price);
        }
        System.out.println();
        System.out.println("Total Price: " + total);
        sc.close();
    }
}
