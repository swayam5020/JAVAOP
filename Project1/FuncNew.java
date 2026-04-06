//Accept 2 number and find sum
import java.util.*;
class FuncNew
{
    public static void main(String args[])
    {
       FuncNew ob=new FuncNew();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a = ");
        int a=sc.nextInt();
        System.out.println("Enter b = ");
        int b=sc.nextInt();
         int sum;
         sum=ob.add(a,b);
         System.out.print("Sum ="+sum);
     } 
     int add(int a, int b) //called fuinction
     {
         int s=a+b;
         return s;
     }
     
}