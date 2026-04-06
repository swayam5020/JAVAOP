import java.util.*;
class Evil
{
    int num, bin;
    Evil()
    {
        num=0;
        bin=0;
    }
    void acceptNum()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer");
        num = sc.nextInt();
        if(num<=0)
        {
            System.out.println("Invalid Input");
            System.exit(0);
        }
    }
    void rec_bin(int x)
    {
        if(x==0)
        return;
        rec_bin(x/2);
        bin = bin*10 + (x%2);
    }
    void check()
    {
        rec_bin(num);
        int o = 0;
        for(int i=bin; i>0; i/=10)
        {
            if(i%10==1)
            o += 1;
        }
        
        if(o%2==0)
        System.out.println("Evil Number");
        else
        System.out.println("Not Evil Number");
    }
    public static void main(String[] args) {
        Evil evilNumChecker = new Evil(); // Create an instance of the Evil class

        // Accept a positive integer from the user
        evilNumChecker.acceptNum();

        // Check if the input number is an Evil Number
        evilNumChecker.check();
    }
}
