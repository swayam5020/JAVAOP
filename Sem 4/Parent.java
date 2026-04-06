import java.util.*;
 class Parent {
    protected int Pass=1234;
    String User="Swayam";
    //int enroll=147;
}
class Child extends Parent{
    void display(int p){
        if(p==Pass)
            System.out.println("Welcome "+User+ " !!");
        else
            System.out.println("INVALID ID OR PASS ");
    }
}
 class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the code to access: ");
        int data=sc.nextInt();
        Child obj=new Child();
        obj.display(data);
        sc.close();
    }
}