//Write a program to define a class "Tender" containing data members, cost and company name. Accept data for 5 objects and display company name for which cost is minimum.
import java.util.*;
public class Tender{
    String companyName;
    double cost;
  Tender(String name, double c) {
        companyName = name;
        cost = c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tender[] tenders = new Tender[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Company " + (i + 1) + " Name and Cost: ");
            tenders[i] = new Tender(sc.next(), sc.nextDouble());
        }

        // Find minimum cost
        Tender min = tenders[0];
        for (int i = 1; i < 5; i++) {
            if (tenders[i].cost < min.cost) {
                min = tenders[i];
            }
        }
        System.out.println("\nCompany with minimum cost: " + min.companyName);
        System.out.println("Minimum Cost: " + min.cost);
        sc.close();
    }
}
