import java.io.*;
import java.util.Scanner; 
class RailwayTicket 
{
    String name, coach;
    long mobno;
    int amt, totalamt;
    void accept( ) throws IOException 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Passenger’s Name: ");
        name = sc.next( );
        System.out.print("Enter Mobile Number:");
        mobno = sc.nextInt( );
        System.out.print("Enter Coach (FirstAC/SecondAC/ThirdAC/sleeper):");
        coach = sc.next( );
        System.out.print("Enter basic amount of ticket:");
        amt = sc.nextInt( );
    }

    void update() 
    {
        if (coach.equals("First_AC"))
            totalamt = amt + 700;
        else
        if (coach.equals("Second_AC"))
            totalamt = amt + 500; 
        else
        if (coach.equals("Third_AC"))
            totalamt = amt + 250;
        else
            totalamt = amt;
    }

    void display() 
    {
        System.out.println("\n\n Name :" +name);
        System.out.println("Coach :" +coach);
        System.out.println("Total Amount:"+totalamt);
        System.out.println("Mobile No.:" +name);
    }

    public static void main (String args[ ]) throws IOException 
    {
        RailwayTicket t = new RailwayTicket();
        t.accept();
        t.update();
        t.display();
    }
}
