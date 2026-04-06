import java.util.*;
class SwapNumber {
    int num;

    SwapNumber(int n) {
        num = n;
    }
    void swap(SwapNumber obj) {
        int temp = this.num;
        this.num = obj.num;
        obj.num = temp;
    }
    void display() {
        System.out.println(num);
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter both numbers : ");
        int num1=sc.nextInt();
        SwapNumber obj1 = new SwapNumber(num1);
        num1=sc.nextInt();
        SwapNumber obj2 = new SwapNumber(num1);
        System.out.println("Before swapping:");
        obj1.display();
        obj2.display();
        obj1.swap(obj2);
        System.out.println("After swapping:");
        obj1.display();
        obj2.display();
        sc.close();
    }
}