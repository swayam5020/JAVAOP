import java.util.*;
class BigArr2D
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the dimmension of the array");
        int R=sc.nextInt();
        int C=sc.nextInt();
        int arr[][]=new int[R][C];
        int i,j,sum=0;
        System.out.println("Enter the elements of the array with a space between each element");
        for(i=0;i<R;i++)
        {
            for(j=0;j<C;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<R;i++)
        {
            for(j=0;j<C;j++)
            {
                System.out.print(+arr[i][j]+"\t");
            }
            System.out.println();
        }
        for(i=0;i<R;i++)
        {
            for(j=0;j<C;j++)
            {
                sum +=arr[i][j];
            }
        }  
        System.out.println(sum);
        System.out.println("Enter the number you want to search in the matrix");
        int find=sc.nextInt();
        for(i=0;i<R;i++)
        {
            for(j=0;j<C;j++)
            {
                if(find==arr[i][j])
                System.out.println("Index : ("+i+","+j+")");
            }
        }        
        int sumbysum=0;
        System.out.println("Adding each element one by one");
        for(i=0;i<R;i++)
        {
            for(j=0;j<C;j++)
            {
                 sumbysum +=arr[i][j];
                 System.out.println(sumbysum);
            }            
        }
        int sumrow=0;
        System.out.println("Sum of each row");
        for(i=0;i<R;i++)
        {
            for(j=0;j<C;j++)
            {
                sumrow += arr[i][j];
            }
            System.out.println(sumrow);
            sumrow=0;
        }
        int productrow=1;
        System.out.println("Product of each row");
        for(i=0;i<R;i++)
        {
            for(j=0;j<C;j++)
            {
                productrow *= arr[i][j];
            }
            System.out.println(productrow);
            productrow=1;
        }
        int productcol=1;
        System.out.println("Product of each comloum");
        for(i=0;i<C;i++)
        {
            for(j=0;j<R;j++)
            {
                productcol *= arr[j][i];
            }
            System.out.println(productcol);
            productcol=1;
        }
        System.out.println("Sum of all border elements : ");
        int sumofborder=0;
        for(i=0;i<R;i++)
        {
            for(j=0;j<C;j++)
            {
                if(i==0 || j==0 || i==R-1 || j==C-1)
                sumofborder += arr[i][j];
            }
        }
        System.out.println(sumofborder);
        System.out.println("Sum of all non border elements : ");
        int nonborder=0;
        for(i=0;i<R;i++)
        {
            for(j=0;j<C;j++)
            {
                if(!(i==0 || j==0 || i==R-1 || j==C-1))
                nonborder += arr[i][j];
            }
        }
        System.out.println(nonborder);
        System.out.println("Enter the element you want to swap :");
        int swap=sc.nextInt();
        System.out.println("Enter the element you want to swap it with :");
        int swap2=sc.nextInt();
        boolean swap3=false;
        for(i=0;i<R;i++)
        {
            for(j=0;j<C;j++)
            {
                if(arr[i][j]==swap){
                    arr[i][j]=swap2;
                    swap3=true;
                }               
            }
        }
        for(i=0;i<R;i++)
        {
            for(j=0;j<C;j++)
            {
                System.out.print(+arr[i][j]+"\t");
            }
            System.out.println();
        }
        if(swap3==false)
        System.out.println("element not found :(");
        System.out.println("Reverse of each row :");
        for(i=0; i<R; i++)
        {
            for(j=0; j<C/2; j++)
            {
                int temp = arr[i][j]; // for 1st row: 0,0
                arr[i][j] = arr[i][C-j-1];// 
                arr[i][C-j-1] = temp;
            }
        }
        for(i=0;i<R;i++)
        {
            for(j=0;j<C;j++)
            {
                System.out.print(+arr[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Reverse of diagonals");
        for(i=0; i<R/2; i++)
        {
            int temp = arr[i][i]; // for 1st row: 0,0
            arr[i][i] = arr[R-i-1][R-i-1];// 
            arr[R-i-1][R-i-1] = temp;

            int temp2 = arr[i][R-i-1];
            arr[i][R-i-1] = arr[R-i-1][i];
            arr[R-i-1][i] = temp2;
        }
        for(i=0;i<R;i++)
        {
            for(j=0;j<C;j++)
            {
                System.out.print(+arr[i][j]+"\t");
            }
            System.out.println();
        }//System swayam 
        int max=arr[0][0];
        for(i=0;i<R;i++)
        {
            for(j=0;j<C;j++)
            {
                if(arr[i][j]>max)
                max=arr[i][j];               
            }
        }
        System.out.println("Max element in the array is :"+max);
    }
}
/*1 2 3 4
  5 6 7 8
  9 10 11 12*/        