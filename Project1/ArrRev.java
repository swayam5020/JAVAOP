import java.util.*;
class ArrRev
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i,j, n;
		System.out.println("Enter size of array");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter elements in array");
		for( i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
                 //Reverse
   		for(i=0,j=n-1;i<j;i++,j--)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		System.out.println("Elements in array after reverse - ");
		for( i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
