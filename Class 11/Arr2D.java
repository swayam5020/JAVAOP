import java.util.*;
class Arr2D
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the dimmensions of the array");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int i,j;
        int arr[][]=new int[n][m];
        //n=3 m=3
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                System.out.println("Enter the number");
                arr[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<n;i++)//
        {
           for(j=0;j<m;j++)//0,0  0,1 0,2 
           {
               System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
/* 0,0 0,1 0,2
 * 1,0 1,1 1,2
 * 2,0 2,1 2,2
   */

                