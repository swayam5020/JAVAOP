import java.util.*;
public class Sum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x, y;
        System.out.println("Enter first number: ");
        x=sc.nextInt();
        System.out.println("Enter second number: ");
        y=sc.nextInt();
        System.out.println("Sum: "+ (x+y));
        sc.close();
    }
}
