/*Create a class Account
Data members : account_number, customer_name, balance
3 constructor
input function
display()
main
Partha Sen20:02
to create 3 objects and call all the constructor and functions*/
import java.util.*;
class Account 
{
    int account_number;
    String coustomer_name;
    int balance;
    Account()
    {
        account_number=1234;
        coustomer_name="Poor";
        balance=0;
    }
    Account(String n)
    {
        account_number=1;
        coustomer_name=n;
        balance=999999;
    }
    Account(int a,String n,int b)
    {
        account_number=a;
        coustomer_name=n;
        balance=b;
    }
    void input()
    {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter Account no.= ");
        account_number=sc.nextInt();
        System.out.println("Enter Coustomer name = ");
        coustomer_name=sc1.nextLine();
        System.out.println("Enter balance =122 ");
        balance=sc.nextInt();
    }
    void display()
    {
        System.out.println("Entered Account Number = "+account_number);
        System.out.println("Entered Coustomer Name = "+coustomer_name);
        System.out.println("Entered Balance = "+balance);
    }
    public static void main(String args[])
    {
        Account a1=new Account();
        Account a2=new Account("Ammer");
        Account a3=new Account(12245,"middle class",123);
        System.out.println("Details of 1st Account after creation =");
        a1.display();
        System.out.println("Details of 2nd Account after creation =");
        a2.display();
        System.out.println("Details of 3rd Account after creation =");
        a3.display();
        System.out.println("Enter details of 1st Account");
        a1.input();
        System.out.println("Enter details of 2nd Account");
        a2.input();
        System.out.println("Enter deta");
        a3.input();
    }
}