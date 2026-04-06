// WAP a program that displays the result of :1)natural logarithm of no. 2) Abosolute value of no. 3)Square root 4)Cube root 5) random between 0 and 1
import java.io.*;
public class Maths
{
    public static void main(String args[])throws IOException
    {
        int n,ch;
        InputStreamReader read =new InputStreamReader(System.in);
        BufferedReader in= new BufferedReader(read);
        System.out.println("Enter 1 to find Natural Log");
        System.out.println("Enter 2 to find Absolute Value");
        System.out.println("Enter 3 to find Square root");
        System.out.println("Enter 4 to find Cube root");
        System.out.println("Enter 5 to find Random number from 0 to 1");
        System.out.println("Enter your choice 1-5");
        ch=Integer .parseInt(in.readLine());
        switch (ch)
        {
            case 1:
            System.out.println("Enter a number");
            n=Integer.parseInt(in.readLine());
            System.out.println("The Natural log of"+n+"is"+Math.log(n));
            break;
            case 2:
            System.out.println("Enter a number");
            System.out.println("The absolute value of");
            default:
            System.out.println("wrong choice");
        }
    }
}
            
            
            
            
        
        
        
        
