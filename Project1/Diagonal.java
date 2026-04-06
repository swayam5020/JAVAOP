//Write a program in JAVA to find out the diagonal of a square taking side of a square as an input 
import java.util.*;
public class Diagonal 
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a;
        double d;
        System.out.println("Enter side ofa square");
        a=in.nextInt();
        d=Math.sqrt(2)*a;
        System.out.println("Side of a square="+a);
        System.out.println("Diagonal of a square ="+d);
    }
}