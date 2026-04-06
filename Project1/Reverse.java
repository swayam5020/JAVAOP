//wap to accept a 2 digit number and check if the reverse of the number is equal to the original number//
class Reverse
{
    public static void main(int n)
    {
        int a=(n%10)*10+(n/10);
        if (a==n)
        {
            System.out.println("It is same as reverse");
        }
        else
        {
            System.out.println("It is not the same of reverse");
        }
    }
}
        
    

            


