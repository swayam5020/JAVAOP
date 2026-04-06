import java.util.*;
class Armstrong
{
public static void main()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt();
int r , s=0;
for(int i=n;i>0;i=i/10)
{
    r=i%10;
    s=s+r*r*r;
}
if(s==n)
{
    System.out.println("It is an Armstrong");
}
else
{
    System.out.println("It is not an Armstrong");
}
}
}
    
 