import java.util.*;
public class Swap {
    int first,sec;
    Swap(int x,int y){
        first=x;
        sec=y;
    }
    void swapping(){
        int t=first;
        first=sec;
        sec=t;
        System.out.print("Frist number : "+ first+"\nSecond number: "+sec);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Frist Number: ");
        int a=sc.nextInt();
        System.out.println("Enter Second Number: ");
        int b=sc.nextInt();
        System.out.print("Initial : \n Frist number : "+ a+"\nSecond number: "+b);
        Swap obj=new Swap(a,b);
        obj.swapping();
        sc.close();
    }
}
