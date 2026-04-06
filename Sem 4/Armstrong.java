import java.util.*;
class Armstrong{
    void check(int x){
        int temp,sum=0, digit, digicount=0;
        temp=x;
        while(temp!=0){
            digicount++;
            temp/=10;
        }
        temp=x;
        while(temp != 0){
            digit = temp % 10;
            sum += Math.pow(digit, digicount);
            temp/=10;
        }
        if(x==sum)
            System.out.println(x + " is an Armstrong number ! ");
        else
            System.out.println(x+" is not an Armstrong number ! ");
    }
    public static void main(String args[]){
        int num;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number you want to check : ");
        num=sc.nextInt();
        Armstrong obj=new Armstrong();
        obj.check(num);
        sc.close();
    }
}