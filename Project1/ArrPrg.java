import java.util.*;
class ArrPrg
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=10,i,pos=0; 
        String a[]=new String[n];
        int b[]=new int [n];
        for( i=0;i<n;i++)
        { 
            System.out.println( " Enter names of students ");
            a[i]=sc.nextLine(); 
            System.out.println( " Enter marks of students ");
            b[i]=sc.nextInt();
        }
        System.out.println( " Enter name of student you want to search "); 
        String Nametobesearched=sc.nextLine(); 
        int flag =0;
        for ( i=0;i<n;i++)
        {   
            if (Nametobesearched.equalsIgnoreCase(a[i]))
            {   
                flag=1;
                pos=i;
                break;
            } 
        }
        if(flag==1)
        {
            System.out.println(" Search successful");
            System.out.println( " Name of student"+a[pos]); 
            System.out.println( "  Marks of student "+ b[pos]); 
        }
        else
        {
            System.out.println(" No such name ");
        }
    }
}
       
       
       