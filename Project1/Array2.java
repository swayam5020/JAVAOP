//Q. accept array from main and find sum of even numbers
class Array2
{
    public static void main(int a[])
    {
        
       int n=a.length;
       int i,s=0;
       for(i=0;i<n;i++)
       {
           if(a[i]%2==0)
           {
               s=s+a[i];
               System.out.println(s);
            }
        }
    }
}
            
               
    
    