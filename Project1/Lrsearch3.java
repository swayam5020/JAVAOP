/*Define a class to declare an integer array of size n and accept the elements into the array.
Search for an element input by the user using linear search technique, display the element
if it is found, otherwise display the message “NO SUCH ELEMENT*/
import java.util.*;
class Lrsearch3
{
     public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);        
        System.out.println("Input size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        int i;
        System.out.println("Enter array");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the number you want to seach");
        int t=sc.nextInt();
        int flag=0,pos=0;
        for(i=0;i<n;i++)
        {
            if(a[i]==t)
            {
                flag=1;
                pos=i;
                break;             
            }
        }
         if(flag==1)
        {
            System.out.println(t);
        }
        else
        {
            System.out.println("NO SUCH ELEMENT");
        }   
        }
    }

        