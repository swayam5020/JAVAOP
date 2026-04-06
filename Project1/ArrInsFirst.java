import java.util.*;
class ArrInsFirst
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i,j, n;
		System.out.println("Enter size of array");
		n=sc.nextInt();//6
		int a[]=new int[n+1];
		System.out.println("Enter elements in array");
		for( i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
                //Insert First Position
		System.out.println("Enter elements to insert in array 1st pos ");
		int t=sc.nextInt();
   		for(i=n-1;i>=0;i--)
		{
			a[i+1]=a[i];
		}
		a[0]=t;
		n++;// total no of elements increased by 1
		System.out.println("Elements in array after reverse - ");
		for( i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}