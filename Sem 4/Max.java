//Write a Java program to find maximum of three numbers. (Use constructor, Use member function).
import java.util.*;
public class Max {
    int a,b,c;
    Max(int x, int y, int z){
        a=x;
        b=y;
        c=z;
    }
    void check(){
        int max=a;
        if(b>max)
            max=b;
        if(c>max)
            max=c;
        System.out.println(max+" is the Max number. ");
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 3 numbers: ");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        Max obj= new Max(x,y,z);
        obj.check();
        sc.close();
    }
}
