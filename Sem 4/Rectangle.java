import java.util.*;
public class Rectangle {
    public static void main(String args[]){
        int l,b;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Length and Breath of the rectangle: ");
        l=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Perimeter: "+ (2*(l+b)));
        System.out.println("Area: "+ (l*b));
        sc.close();
    }
}
