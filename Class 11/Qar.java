import java.util.*;
class Qar
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int n=sc.nextInt();
        int i,j,max;
        if(n>=3 && n<=10)
        {
            int a[][]=new int [n][n];
            System.out.println("Enter the matrix");
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    a[i][j]=sc.nextInt();
                }
            }
            max=a[0][0];
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    if(a[i][j]>max)
                    max=a[i][j];
                }
            }
            System.out.println("Max ="+max);
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    if(i==j || i+j==n-1)
                    a[i][j]=max;
                }
            }
            System.out.println("Modified Matrix :");
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    System.out.print(a[i][j]+"\t");
                }
                System.out.println();
            }
        }            
    }
}       