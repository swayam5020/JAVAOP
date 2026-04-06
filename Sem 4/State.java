//Write a Java Program to check if a number is Positive or Negative. (Use constructor, use respective member function).
import java.util.*;
public class State {
    int num;
    State(int n){
        num=n;
    }
    void check(){
        if(num<0)
            System.out.println(num + " is Negetive ! ");
        else
            System.out.println(num + " is Positive ! ");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print( "Enter the number : ");
        int x=sc.nextInt();
        State obj= new State(x);
        obj.check();
        sc.close();
    }

}
