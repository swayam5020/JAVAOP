/*Write a program in java to accept an integer number from the user. Display
all the possible combinations of the numbers which add to the given
number*/
import java.util.Scanner;
class All_Combinations
{
    void show(int n,int a[])
    {
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
    public static void main()
    {
        All_Combinations ob=new All_Combinations();
        Scanner sc=new Scanner(System.in);
        System.out.println("Ener a number");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=1;
        for(int i=1;i<n;i++)
        {
            ob.show(n-i,a);
            System.out.println(i);
            for(int j=i;j<n && j>=2;j++)
            {
                if((i+j)<=n)
                {
                    ob.show(n-i-j,a);
                    System.out.println(i+" "+j);
                }
            }
        }
    }
}