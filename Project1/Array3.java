//Accept an array and find count of odd numbers
class Array3
{
    public static void main(int a[])
    {
        int n=a.length;
        int i,c=0;
        for(i=0;i<n;i++)
        {
            if(a[i]%2!=0)
            {
                c++;  
            }
        }
        System.out.println(c);
    }
} 