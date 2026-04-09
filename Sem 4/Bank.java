import java.util.*;
interface Bank {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}
class Customer{
    String name;
    int id;
    Customer(String name, int id){
        this.name = name;
        this.id = id;
    }
    void display(){
        System.out.println("Customer Name: " + name);
        System.out.println("Customer ID: " + id);
    }
}
class Account extends Customer implements Bank {
    double balance;
    Account(String name, int id, double balance) {
        super(name, id);
        this.balance = balance;
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
    public double getBalance() {
        return balance;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Customer ID: ");
        int id = sc.nextInt();
        Account acc = new Account(name, id, 1000.0);
        acc.display();
       // acc.deposit(500.0);
       // acc.withdraw(200.0);
        System.out.println("Current Balance: " + acc.getBalance());
        sc.close();
    }
}