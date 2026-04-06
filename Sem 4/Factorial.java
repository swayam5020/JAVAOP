//1.	Write a Java program to calculate factorial of a number. (Input a number as a constant value, use member function for factorial computation and return the value).
import java.util.*;
class Factorial{
    void Fact(int n){
        int i=1;
        while(n>0){
            i*=n;
            n--;
        }
        System.out.println("Factorial = "+i);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number ");
        int x=sc.nextInt();
        Factorial obj=new Factorial();
        obj.Fact(x);
        sc.close();
    }
}
