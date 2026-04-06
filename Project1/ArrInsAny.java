import java.util.*;
class ArrInsAny
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i,n;
		System.out.println("Enter size of array");
		n=sc.nextInt();
		int a[]=new int[n+1];
		System.out.println("Enter elements in array");
		for( i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		//Insert ANY Position
		System.out.println("Enter Position to insert from 0 to "+(n-1));
		int pos=sc.nextInt();
		System.out.println("Enter elements to insert in array at "+pos);
		int t=sc.nextInt();
   		for(i=n-1;i>=pos;i--)
		{
			a[i+1]=a[i];
		}
                a[pos]=t;
		n++;// total no of elements increased by 1
		System.out.println("Elements in array after insert -");
		for( i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}