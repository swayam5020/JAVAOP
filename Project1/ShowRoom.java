/*Design a class name ShowRoom with the following description :
Instance variables/ Data members :
String name – To store the name of the customer
long mobno – To store the mobile number of the customer
double cost – To store the cost of the items purchased
double dis – To store the discount amount
double amount – To store the amount to be paid after discount
Member methods: –
ShowRoom() – default constructor to initialize data members
void input() – To input customer name, mobile number, cost
void calculate() – To calculate discount on the cost of purchased items, based on following criteria
 */
import java.util.*;
class ShowRoom
{
    String name;
    double cost;
    long mobno;
    double dis;
    double amount;
    ShowRoom()
    {
        name=" ";
        mobno=0;
        dis=0.0;
        amount = 0.0;
    }

    void input( ) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("EnterName:");
        name = sc.nextLine( );
        System.out.println("Enter Mobile number:");
        mobno = sc.nextLong( );
        System.out.println("Enter cost:");
        cost = sc.nextDouble( );
    }

    void calculate( ) 
    {
        if (cost <= 10000)
        {
            dis=cost*5/100;
            amount =cost-dis;
        }
        else
        if (cost>10000 && cost<=20000)
        {
            dis = cost*10/100;
            amount=cost-dis;
        }
        else
        if (cost>20000 && cost<=35000)
        {
            dis = cost* 15/100;
            amount = cost-dis;
        }
        else
        if (cost > 35000)
        {
            dis = cost*20/100;
            amount = cost-dis;
        }
    }

    void display( ) 
    {
        System.out.println("Name=" +name);
        System.out.println("Mobile No.=" +mobno);
        System.out.println("Amount=" +amount);
    }

    public static void main(String args[]) 
    {
        ShowRoom ob = new ShowRoom( );
        ob.input( );
        ob.calculate( );
        ob.display( );
    }
}