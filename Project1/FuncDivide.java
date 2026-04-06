import java.util.*;
class FuncDivide 
{
     public static void main(String args[]) 
     {
        FuncDivide ob=new FuncDivide();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a = ");
        int a=sc.nextInt();
        System.out.println("Enter b = ");
        int b=sc.nextInt();
         int questiont;
         questiont=ob.Divide(a,b);
         System.out.print("questiont ="+questiont);
     }
     int Divide(int a, int b) 
     {
         int questiont=a/b;
         return questiont;
     }
     
}